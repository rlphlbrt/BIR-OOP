<?php
include('authenticate/authenticate.php');
require_once('connection/connect.php');
$file = basename($_SERVER['PHP_SELF'], ".php");
//$month_now = getdate()['mon'];
//$date_now = getdate()['date'];
//echo $today;
//init
        $navbar = 'templates/tplNavBar.php';
include('templates/tplMaster1.php');
?>

<!DOCTYPE html>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
    <title>Books</title>
</head>
<body>
<?php
    $query = "SELECT * FROM book";
    $result = mysqli_query($link,$query);
?>

<table id="book" class="display" border="1" width="100%" align="center">
    <thead>
        <tr>
            <th>Item Number</th>
            <th>Title</th>
            <th>Author</th>
            <th>Available</th>
            <th>Reserve</th>
        </tr>
    </thead>
    <tbody>
  
            <?php
                  while ($rs = mysqli_fetch_array($result)) 
                    {
            ?>
                  <tr>
            <td><?php echo $rs['bk_itemnumber']; ?></td>
            <td><?php echo $rs['bk_title']; ?></td>
            <td><?php echo $rs['bk_author']; ?></td>
            <td><?php echo $rs['bk_avail']; ?></td>
            <td><a href="bookreserve.php?item=<?php echo $rs['bk_itemnumber'] ?>">Reserve</a>
            </td>
        </tr>
            <?php }
            ?>
    
    </tbody>
</table>

<script type="">
    $(document).ready(function() {
    $('#book').DataTable();
} );
</script>
</body>
</html>