<?php

include('authenticate/firsttime.php');
require_once('connection/connect.php');
$error = "";

if (!isset($_GET['btnSubmit'])) {
    $content = "templates/tplFirstTimeForm.php";
} else {
    $query = "SELECT * FROM employee WHERE emp_num = {$_COOKIE['temp']}";
    $result = mysql_query($query) or die(mysql_error());
    if (mysql_num_rows($result) > 0) {
        while ($rs = mysql_fetch_array($result)) {
            $sn = $rs['emp_sn'];
            $fn = $rs['emp_fn'];
        }
    }
    if ($sn == $_GET['txtSurname'] && $fn == $_GET['txtFirstname']) {
        $query = "UPDATE employee SET emp_pw = '{$_GET['txtPassword']}' WHERE emp_num = {$_COOKIE['temp']}";
        $result = mysql_query($query) or die(mysql_error());
        setcookie('temp', null, time() - 120);
        setcookie('emp_num', $rs['emp_num'], time() * 24 * 60 * 60);
        header('location:home.php');
    } else {
        $error = "<div class=\"alert alert-error\"><p class=\"text-center\">Employee is not matched.</p></div>";
        $content = "templates/tplFirstTimeForm.php";
    }
}


include('templates/tplFirstTime.php');
?>
