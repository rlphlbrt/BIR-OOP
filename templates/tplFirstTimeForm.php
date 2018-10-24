<?php echo $error ?>
<div class="container">
    <div>
        <p class="text-info">Please fill in the form to verify.</p>
    </div>

    <form class="form-horizontal" action="firsttime.php" method="GET">
        <div class="control-group">
            <label class="control-label">Employee Number:</label>
            <div class="controls">
                <input type="text" readonly="readonly" value="<?php echo $_COOKIE['temp'] ?>">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">Surname:</label>
            <div class="controls">
                <input type="text" placeholder="Surname" name="txtSurname">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">First name:</label>
            <div class="controls">
                <input type="text" placeholder="First name" name="txtFirstname">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label">New Password:</label>
            <div class="controls">
                <input type="password" placeholder="Password" name="txtPassword">
            </div>
        </div>
        <button type="submit" class="btn" name="btnSubmit">Submit</button>
    </form>
</div>