<?php
include('authenticate/authenticate.php');
require_once('connection/connect.php');
$file = basename($_SERVER['PHP_SELF'], ".php");

$nav = 1;
$navbar = 'templates/tplNavBar.php';
include('templates/tplMaster1.php');

$itemnumber = $_GET['item'];
$query = "SELECT * FROM book WHERE bk_itemnumber = '$itemnumber'";
$result = mysqli_query($link,$query);

$row = mysqli_fetch_array($result);
$title = $row['bk_title'];
$author = $row['bk_author'];
$avail = $row['bk_avail'];

function e($val){
  global $link;
  return mysqli_real_escape_string($link, trim($val));
}
?>

<!DOCTYPE html>
<html>
<head>
</head>
<body>

  <center>
<form method="POST" action="">
  <label>Item Number</label>
  <input type="text" readonly="" name="itemnumber" value="<?php echo $itemnumber; ?>"><br>
  <label>Title</label>
  <input type="text" readonly="" name="title" value="<?php echo $title; ?>"><br>
  <label>Author</label>
  <input type="text" readonly="" name="author" value="<?php echo $author; ?>"><br>
  <label>Available</label>
  <input type="text" readonly="" name="avail" value="<?php echo $avail; ?>"><br>
  <label>Quantity</label>
  <input type="number" min="1" max="<?php echo $avail; ?>" name="quantity"><br>
  <button type="submit" name="reserve">Reserve</button>
</form>
</center>
</body>
</html>


<?php
if (isset($_POST['reserve'])) {
$now = date('Y-m-d', time());
$year = date('Y', time());
$month = sprintf("%02d", (int) date('m', time()) - 1);
$date = date('d', time());
$now_sql = "{$year}-{$month}-{$date}";
$quantity   =  e($_POST['quantity']);
$newavail = $avail - $quantity;

    $query = "INSERT INTO transaction(emp_num, itemnumber, qty, datereserved)
            VALUES ({$_COOKIE['emp_num']}, '$itemnumber',
                '$quantity', '$now_sql')";
    $result = mysqli_query($link,$query) or die(mysqli_error($link));
                        //SET TRANSACTION REPORTS (MySQL)
    $query = "INSERT INTO transactionreports
            (emp_num, itemnumber, qty, datereserved, date)
            VALUES
            ({$_COOKIE['emp_num']}, '$itemnumber',
                '$quantity', '$now_sql', '$now_sql')";
    $result = mysqli_query($link,$query) or die(mysqli_error($link));
                        //SET BOOK (MySQL)
    $query = "UPDATE book
            SET bk_reserved = (bk_reserved + {$quantity}),
             bk_avail = '$newavail'
            WHERE bk_itemnumber = '$itemnumber'";
    $result = mysqli_query($link,$query) or die(mysqli_error($link));
                    header('location: books.php'); 
                    }

?>