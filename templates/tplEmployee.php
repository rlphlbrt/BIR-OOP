<div class="">
    <form class="form-horizontal" action="profile.php" method="POST">
        <div class="control-group">
            <label class="control-label" for="inputEmail">Employee Number:</label>
            <div class="controls">
                <input type="text" readonly="readonly" value="<?php echo $_COOKIE['emp_num'] ?>">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputPassword">Surname:</label>
            <div class="controls">
                <input type="text" value="<?php echo $sn ?>" name="txtSurname">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputPassword">First name:</label>
            <div class="controls">
                <input type="text" value="<?php echo $fn ?>" name="txtFirstname">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputPassword">Department:</label>
            <div class="controls">
                <input type="text" value="<?php echo $dept ?>" name="txtDepartment">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for="inputPassword"></label>
            <button type="submit" class="btn" name="btnUpdate">Update</button>
        </div>
    </form>
</div>