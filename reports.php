<?php

include('authenticate/authenticate.php');
require_once('connection/connect.php');
$file = basename($_SERVER['PHP_SELF'], ".php");
//$month_now = getdate()['mon'];
//$date_now = getdate()['date'];
//echo $today;
//init
$html = "";
$query = "";
$content = "";
$title = "";
$author = "";
$number = "";
$avail = "";
$result = "";
$error = "";
$success = "";
$qty = "";
$exist = "";

if (isset($_GET['btnSearch']) && isset($_GET['txtSearch'])) {
    if (isset($_GET['btnReserve'])) {
        
    }
    if (!isset($_GET['btnReserve'])) {
        $query = "SELECT * FROM reports WHERE rp_title LIKE '%{$_GET['txtSearch']}%' OR rp_author LIKE '%{$_GET['txtSearch']}%'";
        $result = mysql_query($query);
        if (mysql_num_rows($result) > 0) {
            while ($rs = mysql_fetch_array($result)) {
                $html .= "<tr>";
                $html .= "<td>{$rs['rp_itemnumber']}</td>";
                $html .= "<td>{$rs['rp_title']}</td>";
                $html .= "<td>{$rs['rp_author']}</td>";
                $html .= "<td>{$rs['rp_avail']}</td>";
                $html .= "<td><a href=\"reports.php?item={$rs['rp_itemnumber']}\">Reserve</a></td>";
                $html .= "</tr>";
            }
            $exist = "";
        } else {
            $exist = "The item is not existed.";
            $exist = "<h4>{$exist}</h4>";
            $exist = "<div class=\"alert alert-block\">{$exist}</div>";
        }
        $content = "templates/tplReports.php";
    }
}
if (!isset($_GET['btnSearch'])) {

    if (isset($_GET['item'])) {
        $query = "SELECT * FROM reports WHERE rp_itemnumber = {$_GET['item']}";
        $result = mysql_query($query);
        if (mysql_num_rows($result) > 0) {
            while ($rs = mysql_fetch_array($result)) {
                $number = $rs['rp_itemnumber'];
                $title = $rs['rp_title'];
                $author = $rs['rp_author'];
                $avail = $rs['rp_avail'];
            }
        }
        $content = "templates/tplReserve.php";
    }
    if (!isset($_GET['item'])) {
        if (isset($_GET['btnReserve'])) {
            $query = "SELECT * FROM reports WHERE rp_itemnumber = {$_GET['txtItem']}";
            $result = mysql_query($query) or die(mysql_error());
            if (mysql_num_rows($result) > 0) {
                while ($rs = mysql_fetch_array($result)) {
                    $number = $rs['rp_itemnumber'];
                    $title = $rs['rp_title'];
                    $author = $rs['rp_author'];
                    $avail = $rs['rp_avail'];
                }
            }
            if (is_numeric($_GET['txtQty'])) { //txtQuantity is a number
                if (0 < $_GET['txtQty'] && $_GET['txtQty'] <= (int) $_GET['txtAvail']) { //0 < x <= avail
                    if ($_GET['txtQty'] - (int) $_GET['txtQty'] == 0) {//Check if it is integer
                        //International standard date format
                        $now = date('Y-m-d', time());

                        //MySQL Standard date format
                        $year = date('Y', time());
                        $month = sprintf("%02d", (int) date('m', time()) - 1);
                        $date = date('d', time());
                        $now_sql = "{$year}-{$month}-{$date}";

                        //SET TRANSACTION (MySQL)
                        $query = "INSERT INTO transaction(emp_num, itemnumber, qty, datereserved)
            VALUES ({$_COOKIE['emp_num']}, {$_GET['txtItem']},
                {$_GET['txtQty']}, '{$now_sql}')";
                        $result = mysql_query($query) or die(mysql_error());
                        //SET TRANSACTION REPORTS (MySQL)
                        $query = "INSERT INTO transactionreports
            (emp_num, itemnumber, qty, datereserved, date)
            VALUES
            ({$_COOKIE['emp_num']}, {$_GET['txtItem']}, {$_GET['txtQty']},  
             '{$now_sql}', '{$now_sql}')";

                        $result = mysql_query($query) or die(mysql_error());
                        //SET REPORTS (MySQL)
                        $query = "UPDATE reports
            SET rp_reserved = (rp_reserved + {$_GET['txtQty']}),
             rp_avail = (rp_avail - {$_GET['txtQty']})
            WHERE rp_itemnumber = {$_GET['txtItem']}";
                        $result = mysql_query($query) or die(mysql_error());
                        $success = "<div class=\"alert alert-success\"><p class=\"text-center\">The items {$_GET['txtItem']} is reserved.</p></div>";
                        $content = "templates/tplReports.php";
                    } else {
                        $qty = $_GET['txtQty'];
                        $error = "<div class=\"alert alert-error\"><p class=\"text-center\">Check the quantity.</p></div>";
                        $content = "templates/tplReserve.php";
                    }
                } else {
                    $qty = $_GET['txtQty'];
                    $error = "<div class=\"alert alert-error\"><p class=\"text-center\">Check the available.</p></div>";
                    $content = "templates/tplReserve.php";
                }
            } else { //txtQuantity is not a number.
                $qty = $_GET['txtQty'];
                $error = "<div class=\"alert alert-error\"><p class=\"text-center\">Please enter numeric value.</p></div>";
                $content = "templates/tplReserve.php";
            }
        }
        if (!isset($_GET['btnReserve'])) {
            $content = "templates/tplReports.php";
        }
    }
}

$navbar = 'templates/tplNavBar.php';
include('templates/tplMaster.php');
?>