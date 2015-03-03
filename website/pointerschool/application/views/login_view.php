<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset="UTF-8" /> 
    <title>
        Admin Log in
    </title>
    <link href="<?=base_url()?>assets/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<?=base_url()?>assets/css/login.css" />
</head>
<body>
    <?php
        $text = "login/do_login";
        echo form_open_multipart($text);
    ?>
    <div style="padding:20px">
    <h1>Admin Log in</h1>
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

        <a href="register.php">
            <input class="register" type="button" value="Register">
        </a>
    </p>
    </div>
    <?php
        echo form_close();
    ?>

</body>
</html>