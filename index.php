<?php

require_once('connection/connect.php');
$error = '';
if (isset($_POST['cmdLogin'])) {
    $sql = "SELECT * FROM employee";
    $result = mysqli_query($link,$sql) or die(mysqli_error($link));
    if (mysqli_num_rows($result) > 0) {
        while ($rs = mysqli_fetch_array($result)) {
            if ($_POST['txtUsername'] == $rs['emp_num']
                    && $_POST['txtPassword'] == $rs['emp_pw']) {
                if ($rs['emp_pw'] == null) {
                    setcookie('temp', $rs['emp_num'], time() + 120);
                    header('location:firsttime.php');
                } else {
                    setcookie('emp_num', $rs['emp_num'], time() + 24 * 60 * 60);
                    header('location:home.php');
                }
            } else {
                if ($_POST['txtUsername'] == $rs['emp_num'] && $rs['emp_pw'] == null) {
                    setcookie('temp', $rs['emp_num'], time() + 120);
                    header('location:firsttime.php');
                } else {
                    $error = "<center>Access denied.</center>";
                }
            }
        }
    }
}
if (!empty($error)) {
    $error = '<div class="alert alert-error">' . $error . '</div>';
}


$header = 'templates/tplHeader.php'; //BIR header
$template = 'templates/tplLogin.php'; //log in form

include 'templates/tplIndex.php';
?>