<?php

include('authenticate/authenticate.php');

$file = basename($_SERVER['PHP_SELF'], ".php");
$navbar = 'templates/tplNavBar.php';
$content = 'templates/tplConRm.php';
include('templates/tplMaster.php');
?>