<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset="UTF-8" /> 
    <title>
        Admin Log in
    </title>
    <link href="<?=base_url()?>assets/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<?=base_url()?>assets/css/login.css" />

    <!-- Custom CSS -->
    <link href="<?=base_url()?>assets/css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<?=base_url()?>assets/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    <!-- jQuery -->
    <script src="<?=base_url()?>assets/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<?=base_url()?>assets/js/bootstrap.min.js"></script>
</head>
<body>
    <?php
        $text = site_url("login/do_login") ;
        echo form_open_multipart($text);
    ?>
    <div style="padding:20px">
    <h1>Admin Log in</h1>
    <?php
        if(isset($_GET['status']) && $_GET['status'] == 0)
        {
            echo "<div class='alert alert-danger alert-dismissable'  role='alert'>";
            echo "<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>";
            echo "Pastikan username & password benar";
            echo "</div>";
        }
    ?>
        <p>
            <label for="username"><strong>Username</strong></label>
            <input type="text" name="username" id="username">
        </p>
        <p>
            <label for="password"><strong>Password</strong></label>
            <input type="password" name="password" id="password" value="">
        </p>
    </div>
    <p class="p-container">
        <input class="login" type="submit" name="go" id="go" value="Log in">

        <a href="<?=site_url("register.php")?>">
            <input class="register" type="button" value="Register">
        </a>
    </p>
    </div>
    <?php
        echo form_close();
    ?>
</body>
</html>