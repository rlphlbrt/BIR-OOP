<?php include 'conditions.php' ?>
<div class="navbar navbar-inverse">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand">Facilities and Resource Management System</a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li class="
                    <?php
                    if ($nav == 0) {
                        echo 'active';
                    }
                    ?>">
                        <a href="home.php">Home</a>
                    </li>
                    <li class="
                    <?php
                    if ($nav == 1) {
                        echo 'active';
                    }
                    ?>">
                        <a href="books.php">Books</a>
                    </li>
                    <li class="
                    <?php
                    if ($nav == 2) {
                        echo 'active';
                    }
                    ?>">
                        <a href="reports.php">Reports</a>
                    </li>
                    <li class="
                    <?php
                    if ($nav == 3) {
                        echo 'active';
                    }
                    ?>">
                        <a href="equip.php">Equipment</a>
                    </li>

                    <li class="
                    <?php
                    if ($nav == 5) {
                        echo 'active';
                    }
                    ?>">
                        <a href="profile.php">Profile</a>
                    </li>
                    <li>
                        <a href="logout.php">Log out</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>