<?php echo $error; ?>
<form class="form-horizontal" action="index.php" method="POST">
    <div class="control-group">
        <label class="control-label">Username:</label>
        <div class="controls">
            <input type="text" name="txtUsername"id="inputUsername" placeholder="Username">
        </div>
    </div>
    <div class="control-group">
        <label class="control-label">Password:</label>
        <div class="controls">
            <input type="password" name="txtPassword" id="inputPassword" placeholder="Password">
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
            <input class="btn" type="submit" name="cmdLogin" value="Log in">
        </div>
    </div>
</form>