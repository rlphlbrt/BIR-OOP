<?php
if ($file == "books") {
    echo $error;

    if (!empty($error)) {
        $warning = "error";
    } else {
        $warning = "";
    }
    ?>

    <div class="container">
        <form class="form-horizontal" action="books.php" method="GET">
            <div class="control-group">
                <label class="control-label">Item Number:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $number ?>" name="txtItem">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Title:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $title ?>">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Author:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $author ?>">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Available:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $avail ?>" name="txtAvail">
                </div>
            </div>
            <div class="control-group <?php echo $warning; ?>">
                <label class="control-label">Quantity:</label>
                <div class="controls">
                    <input type="text" name="txtQty" value="<?php echo $qty ?>">
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn" name="btnReserve">Reserve</button>
                </div>
            </div>
        </form>
    </div>
    <?php
} else if ($file == "reports") {
    echo $error;

    if (!empty($error)) {
        $warning = "error";
    } else {
        $warning = "";
    }
    ?>
    <div class="container">
        <form class="form-horizontal" action="reports.php" method="GET">
            <div class="control-group">
                <label class="control-label">Item Number:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $number ?>" name="txtItem">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Title:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $title ?>">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Author:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $author ?>">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Available:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $avail ?>" name="txtAvail">
                </div>
            </div>
            <div class="control-group <?php echo $warning; ?>">
                <label class="control-label">Quantity:</label>
                <div class="controls">
                    <input type="text" name="txtQty" value="<?php echo $qty ?>">
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn" name="btnReserve">Reserve</button>
                </div>
            </div>
        </form>
    </div>

    <?php
} else if ($file == "equip") {
    echo $error;

    if (!empty($error)) {
        $warning = "error";
    } else {
        $warning = "";
    }
    ?>
    <div class="container">
        <form class="form-horizontal" action="equip.php" method="GET">
            <div class="control-group">
                <label class="control-label">Item Number:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $number ?>" name="txtItem">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Description:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $desc ?>">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Serial Number:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $sernum ?>">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">Available:</label>
                <div class="controls">
                    <input type="text" readonly="readonly" value="<?php echo $avail ?>" name="txtAvail">
                </div>
            </div>
            <div class="control-group <?php echo $warning; ?>">
                <label class="control-label">Quantity:</label>
                <div class="controls">
                    <input type="text" name="txtQty" value="<?php echo $qty ?>">
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <button type="submit" class="btn" name="btnReserve">Reserve</button>
                </div>
            </div>
        </form>
    </div>
    <?php
}?>