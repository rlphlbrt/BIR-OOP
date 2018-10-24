<?php

if (isset($_GET['item'])) {
    $item = $_GET['item'];
    if (substr($item, 0, 1) == '1') {
        $query = "SELECT * FROM book WHERE bk_itemnumber = {$item}";
        $result = mysql_query($query);
        if (mysql_num_rows($result) > 0) {
            while ($rs = mysql_fetch_array($result)) {
                $title = $rs['bk_title'];
                $author = $rs['bk_author'];
            }
        }
        echo "<div class=\"container\">";
        echo "<h4>Item Number :     {$_GET['item']}</h4>";
        echo "<h4>Title :     {$title}</h4>";
        echo "<h4>Author :     {$author}</h4>";
        echo "</div>";

        echo"<div class=\"container\">
            <div class=\"row-fluid\">
            <div class=\"span12\">
            <form method=\"GET\" action=\"profile.php\">
            <div class=\"control-group\">
            <input type=\"hidden\" value=\"{$_GET['category']}\" name=\"category\">
            </div>
            <div class=\"control-group\">
            <div class=\"controls\">
            <button type=\"submit\" class=\"btn btn-info btn-large\">OK</button>
            </div>
            </div>
            </form>
            </div>
            </div>
            </div>";
    }
    if (substr($item, 0, 1) == '2') {
        $query = "SELECT * FROM reports WHERE rp_itemnumber = {$item}";
        $result = mysql_query($query);
        if (mysql_num_rows($result) > 0) {
            while ($rs = mysql_fetch_array($result)) {
                $title = $rs['rp_title'];
                $author = $rs['rp_author'];
            }
        }
        echo "<div class=\"container\">";
        echo "<h4>Item Number :     {$_GET['item']}</h4>";
        echo "<h4>Title :     {$title}</h4>";
        echo "<h4>Author :     {$author}</h4>";
        echo "</div>";

        echo"<div class=\"container\">
            <div class=\"row-fluid\">
            <div class=\"span12\">
            <form method=\"GET\" action=\"profile.php\">
            <div class=\"control-group\">
            <input type=\"hidden\" value=\"{$_GET['category']}\" name=\"category\">
            </div>
            <div class=\"control-group\">
            <div class=\"controls\">
            <button type=\"submit\" class=\"btn btn-info btn-large\">OK</button>
            </div>
            </div>
            </form>
            </div>
            </div>
            </div>";
    }
    if (substr($item, 0, 1) == '3') {
        $query = "SELECT * FROM equip WHERE eq_itemnumber = {$item}";
        $result = mysql_query($query);
        if (mysql_num_rows($result) > 0) {
            while ($rs = mysql_fetch_array($result)) {
                $desc = $rs['eq_desc'];
                $sernum = $rs['eq_serial_num'];
            }
        }
        echo "<div class=\"container\">";
        echo "<h4>Item Number :     {$_GET['item']}</h4>";
        echo "<h4>Title :     {$desc}</h4>";
        echo "<h4>Author :     {$sernum}</h4>";
        echo "</div>";

        echo"<div class=\"container\">
            <div class=\"row-fluid\">
            <div class=\"span12\">
            <form method=\"GET\" action=\"profile.php\">
            <div class=\"control-group\">
            <input type=\"hidden\" value=\"{$_GET['category']}\" name=\"category\">
            </div>
            <div class=\"control-group\">
            <div class=\"controls\">
            <button type=\"submit\" class=\"btn btn-info btn-large\">OK</button>
            </div>
            </div>
            </form>
            </div>
            </div>
            </div>";
    }
}
?>