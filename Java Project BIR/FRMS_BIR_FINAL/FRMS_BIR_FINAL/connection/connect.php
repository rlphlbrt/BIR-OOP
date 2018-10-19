<?php

require_once('connection/config.php');
$link = mysql_connect($db['host'], $db['username'], $db['password']);
mysql_select_db($db['db_name']);
?>