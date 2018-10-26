<?php
include('authenticate/authenticate.php');
require_once('connection/connect.php');
$file = basename($_SERVER['PHP_SELF'], ".php");

$nav = 3;
$navbar = 'templates/tplNavBar.php';
include('templates/tplMaster1.php');

$itemnumber = $_GET['item'];
$query = "SELECT * FROM equip WHERE eq_itemnumber = '$itemnumber'";
$result = mysqli_query($link,$query);

$row = mysqli_fetch_array($result);
$desc = $row['eq_desc'];
$serial = $row['eq_serial_num'];
$avail = $row['eq_avail'];

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
  <label>Description</label>
  <input type="text" readonly="" name="desc" value="<?php echo $desc; ?>"><br>
  <label>Serial Number</label>
  <input type="text" readonly="" name="serial" value="<?php echo $serial; ?>"><br>
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
    $query = "UPDATE equip
            SET eq_reserved = (eq_reserved + {$quantity}),
             eq_avail = '$newavail'
            WHERE eq_itemnumber = '$itemnumber'";
    $result = mysqli_query($link,$query) or die(mysqli_error($link));
                    header('location: equip.php'); 
                    }

?>