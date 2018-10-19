<?php

include('authenticate/authenticate.php');
require_once('connection/connect.php');
$file = basename($_SERVER['PHP_SELF'], ".php");
$cookie = '';
$sql = "SELECT * FROM employee";
$result = mysql_query($sql) or die(mysql_error());
if (mysql_num_rows($result) > 0) {
    while ($rs = mysql_fetch_array($result)) {
        if ($_COOKIE['emp_num'] == $rs['emp_num']) {
            $cookie = $rs['emp_fn'];
        }
    }
}
$greet = "Hello, {$cookie}!";
$greet = "<div class=\"container\"><h1>{$greet}</h1></div>";



$navbar = 'templates/tplNavBar.php';
$content = 'templates/tplHome.php';
include('templates/tplMaster.php');
?>

