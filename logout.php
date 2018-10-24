<?php

setcookie('emp_num', null, time() - 24 * 60 * 60);
header('location:index.php');
?>