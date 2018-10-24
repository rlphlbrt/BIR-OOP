<?php

require_once('connection/config.php');
$link = mysqli_connect($db['host'], $db['username'], $db['password']);
mysqli_select_db($link,$db['db_name']);
?>