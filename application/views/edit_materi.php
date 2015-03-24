

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                           Materi Pelajaran
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="<?=base_url()?>index.php/dashboard">Dashboard</a>
                            </li>
                            <li>
                                <i class="fa fa-file"></i> <a href="<?=base_url()?>index.php/materi">Materi</a>
                            </li>
                            <li>
                                <i class="fa fa-file"></i> <a href="<?=base_url()?>index.php/materi">Detail</a>
                            </li>
                            <li>
                                <i class="fa fa-file"></i> <a href="">Detail-Materi</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-file"></i> Edit Materi
                            </li>
                        </ol>
                    </div>
                </div>

                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-4">
                        <div class="panel panel-green">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-2">
                                        <i class="fa fa-plus-circle fa-4x"></i>
                                    </div>
                                    <div class="col-xs-10 text-right">
                                        <div class="huge">Edit Kelas</div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body">
                                <?php
                                    $text = "materi/insert";
                                    echo form_open_multipart($text);
                                ?>
                                    <div class="form-group">
                                        <input class="form-control" name="id_subbab" type="text" value="<?=$data[0]->id_subbab?>" readonly></input>
                                    </div>
                                    <?php 
                                        if (form_error('nomor_materi') != NULL){
                                            echo "<div class='alert alert-danger alert-dismissable' role='alert'>";
                                            echo "<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>";
                                            echo form_error('nomor_materi');
                                            echo "</div>";    
                                        }
                                    ?>
                                    <div class="form-group">
                                        <label class="control-label">Nomer Materi:</label>
                                        <input class="form-control" name="nomor_materi" value="<?php echo set_value('nomor_materi');?>" type="text"></input>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">File Materi:
                                        </label>
                                        <input class="form-control" name="file" type="file" accept=".jpg,.jpeg,.gif,.png"></input>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Catatan :</label>
                                        <input class="form-control" name="catatan_materi" value="<?php echo set_value('catatan_materi');?>" type="textarea"></input>
                                    </div>
                                    <div class="pull-right">
                                        <button class="btn btn-success" type="submit"><b>OK</b></button>
                                    </div>
                                <?php echo form_close()?>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
   

    <script>
    $('#popUpEdit').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var id = button.data('editid')
        var name = button.data('editname')
        // Extract info from data-* attributes
        // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        var modal = $(this)
        modal.find('.modal-body input:first').val(id)
        modal.find('.modal-body input:last').val(name)
    })

    function edit_kelas(id_str, name_str)
    {
        var xmlhttp;
        if(id_str.length == 0)
        {
            document.getElementById("id_form_group").class = "form-group has-error";
        }
    }
    </script>
