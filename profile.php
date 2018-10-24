<?php

include('authenticate/authenticate.php');
require_once('connection/connect.php');
$file = basename($_SERVER['PHP_SELF'], ".php");

//init
$num = $_COOKIE['emp_num']; //employee number
$fn = ""; //first name
$sn = ""; //surname
$dept = ""; //department
$query = ""; //sql query
$result = "";
$html = "";


if (!isset($_GET['category'])) {
    if (isset($_POST['btnUpdate'])) {
        $query = "UPDATE employee
            SET emp_fn = '{$_POST['txtFirstname']}',
            emp_sn = '{$_POST['txtSurname']}',
            emp_dept = '{$_POST['txtDepartment']}'
            WHERE emp_num = {$_COOKIE['emp_num']}";
        $result = mysql_query($query) or die(mysql_error());
        $content = "templates/tplProfile.php";
    } else if (isset($_GET['item'])) {
        $content = "templates/tplItemInfo.php";
    } else {
        $content = "templates/tplProfile.php";
    }
}

if (isset($_GET['category'])) {
    if ($_GET['category'] == "profile") {
        $query = "SELECT * FROM employee WHERE emp_num = {$_COOKIE['emp_num']}";
        $result = mysql_query($query) or die(mysql_error());
        if (mysql_num_rows($result) > 0) {
            while ($rs = mysql_fetch_array($result)) {
                $sn = $rs['emp_sn'];
                $fn = $rs['emp_fn'];
                $dept = $rs['emp_dept'];
            }
        }
        $content = "templates/tplEmployee.php";
    }
    if ($_GET['category'] == "reserved") {
        $query = "SELECT * FROM transaction WHERE datereserved IS NOT NULL";
        $result = mysql_query($query) or die(mysql_error());
        if (mysql_num_rows($result) > 0) {
            while ($rs = mysql_fetch_array($result)) {
                $html .= "<tr>";
                $html .= "<td>
                        <form method=\"GET\" action=\"profile.php\">
                        <input type=\"hidden\" value=\"{$rs['itemnumber']}\" name=\"item\">
                        <input type=\"hidden\" value=\"{$_GET['category']}\" name=\"category\">
                        <button type=\"submit\" class=\"btn btn-link\">{$rs['itemnumber']}</button>
                        </form></td>";
                $html .= "<td>{$rs['qty']}</td>";
                $html .= "<td>{$rs['datereserved']}</td>";
                $html .= "</tr>";
            }
            $exist = "";
        } else {
            $exist = "<div class=\"alert alert-info\"><p class=\"text-center\">
        No reserved item.
    </p></div>";
        }
        $content = "templates/tplItemsReserved.php";
    }
    if ($_GET['category'] == "borrowed") {
        $query = "SELECT * FROM transaction WHERE dateborrowed IS NOT NULL";
        $result = mysql_query($query) or die(mysql_error());
        if (mysql_num_rows($result) > 0) {
            while ($rs = mysql_fetch_array($result)) {
                $html .= "<tr>";
                $html .= "<td>
                        <form method=\"GET\" action=\"profile.php\">
                        <input type=\"hidden\" value=\"{$rs['itemnumber']}\" name=\"item\">
                        <input type=\"hidden\" value=\"{$_GET['category']}\" name=\"category\">
                        <button type=\"submit\" class=\"btn btn-link\">{$rs['itemnumber']}</button>
                        </form></td>";
                $html .= "<td>{$rs['qty']}</td>";
                $html .= "<td>{$rs['dateborrowed']}</td>";
                $html .= "</tr>";
            }
            $exist = "";
        } else {
            $exist = "<div class=\"alert alert-info\"><p class=\"text-center\">
        No borrowed item.
    </p></div>";
        }
        $content = "templates/tplItemsBorrowed.php";
    }

    if (isset($_GET['item']) && $_GET['category'] != "cancel") {
        $content = "templates/tplItemInfo.php";
    }
    if ($_GET['category'] == "cancel") {
        $content = "templates/tplCancelReserve.php";
    }
}

$navbar = 'templates/tplNavBar.php';
include('templates/tplMaster.php');
?>