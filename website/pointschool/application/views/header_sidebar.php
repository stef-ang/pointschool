<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title> <?=$title?></title>

    <!-- Bootstrap Core CSS -->
    <link href="<?=base_url()?>assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<?=base_url()?>assets/css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<?=base_url()?>assets/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	
	<!-- jQuery -->
    <script src="<?=base_url()?>assets/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<?=base_url()?>assets/js/bootstrap.min.js"></script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="navbar-header">
            <a class="navbar-brand" href="<?=site_url("dashboard")?>">Pointer Admin Page</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-user"></i>
                        <?=$this->session->userdata('username');?>
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li class="divider"></li>
                        <li>
                            <center><a href="<?=site_url("logout")?>"><i class="fa fa-fw fa-power-off"></i> Log Out</a></center>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Brand and toggle get grouped for better mobile display -->
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li <?php if(strpos(current_url(),site_url("dashboard"))!==false)echo 'class="active"'; ?>>
                        <a href="<?=site_url("dashboard")?>"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                    </li>
                     <li <?php if(strpos(current_url(),site_url("kelas"))!==false)echo 'class="active"'; ?>>
                        <a href="<?=site_url("kelas")?>"><i class="fa fa-fw fa-university"></i> Kelas</a>
                    </li>
                    <li <?php if(strpos(current_url(),site_url("mapel"))!==false)echo 'class="active"'; ?>>
                        <a href="<?=site_url("mapel")?>"><i class="fa fa-fw fa-paper-plane"></i> Mata Pelajaran</a>
                    </li>
                    <li <?php if(strpos(current_url(),site_url("bab"))!==false)echo 'class="active"'; ?>>
                        <a href="<?=site_url("bab")?>"><i class="fa fa-fw fa-codepen"></i> Bab</a>
                    </li>
                    <li <?php if(strpos(current_url(),site_url("subbab"))!==false)echo 'class="active"'; ?>>
                        <a href="<?=site_url("subbab")?>"><i class="fa fa-fw fa-bars"></i> Sub Bab</a>
                    </li>
                    <li <?php if(strpos(current_url(),site_url("materi"))!==false)echo 'class="active"'; ?>>
                        <a href="<?=site_url("materi")?>"><i class="fa fa-fw fa-book"></i> Materi</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>