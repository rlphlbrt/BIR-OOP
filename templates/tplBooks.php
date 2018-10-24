<?php echo $success ?>
<div>
    <form class="form-horizontal" action="books.php" method="GET">
        <div class="control-group">
            <div class="controls">
                <input type="text" name="txtSearch" id="inputUsername" placeholder="Search">
            </div>
        </div>
        <div class="control-group">
            <div class="controls">
                <input class="btn" type="submit" name="btnSearch" value="Search">
            </div>
        </div>
    </form>
</div>

<?php
if (isset($_GET['btnSearch']) && !empty($_GET['txtSearch']) && empty($exist)) {
    echo "<table class = \"table table-striped\">";
    echo "<tr>";
    echo "<td>Item Number</td>";
    echo "<td>Title</td>";
    echo "<td>Author</td>";
    echo "<td>Available</td>";
    echo "<td>Reserve</td>";
    echo "</tr>";
    echo $html;
    echo "</table>";
} else {
    echo $exist;
}
?>