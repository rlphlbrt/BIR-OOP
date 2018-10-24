<?php

if (isset($_GET['category']) && $_GET['category'] == "borrowed" && empty($exist)) {

    echo "<table class = \"table table-striped\">";
    echo "<tr>";
    echo "<td>Item Number</td>";
    echo "<td>Quantity</td>";
    echo "<td>Date Borrowed</td>";
    echo "</tr>";
    echo $html;
    echo "</table>";
} else {
    echo $exist;
}
echo "<p class=\"text-center\"><a href=\"profile.php\">
                <button class=\"btn btn-large btn-info\">OK</button>
            </a></p>";
?>