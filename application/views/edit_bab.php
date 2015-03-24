

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Bab Mata Pelajaran
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="<?=base_url()?>index.php/Dashboard">Dashboard</a>
                            </li>
                            <li>
                                <i class="fa fa-file"></i> <a href="<?=base_url()?>index.php/bab">Bab</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-file"></i> Edit Bab
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
                                        <div class="huge">Edit Bab</div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body">
                                <?php
                                    $text = "bab/edit/".$data[0]->id_bab;
                                    echo form_open($text);
                                ?>
                                <?php
                                    if(isset($_GET['status']) && $_GET['status'] == 0)
                                    {
                                        echo "<div class='alert alert-success alert-dismissable'  role='alert'>";
                                        echo "<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>";
                                        echo "Bab berhasil diedit";
                                        echo "</div>";
                                    }
                                    if(isset($_GET['status']) && $_GET['status'] == 1)
                                    {
                                        echo "<div class='alert alert-danger alert-dismissable' role='alert'>";
                                        echo "Maaf, gagal melakukan query.";
                                        echo "</div>";
                                    }
                                    if(isset($_GET['status']) && $_GET['status'] == 2)
                                    {
                                        echo "<div class='alert alert-danger alert-dismissable' role='alert'>";
                                        echo "Maaf, ID sudah terpakai. Silakan gunakan ID yang lain.";
                                        echo "</div>";
                                    }
                                    if(isset($_GET['status']) && $_GET['status'] == 3)
                                    {
                                        echo "<div class='alert alert-danger alert-dismissable' role='alert'>";
                                        echo "Maaf, pastikan semua isian sudah terisi.";
                                        echo "</div>";
                                    }
                                ?>
                                    <div class="form-group">
                                        <label class="control-label">ID Bab:</label>
                                        <input class="form-control" name="id_bab" type="text" value="<?php echo $data[0]->id_bab?>" readonly></input>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Nama Kelas:
                                        </label>
                                        <select class="form-control" name="id_kelas">
                                            <?php
                                                $i=1;
                                                foreach ($kelas as $d){
                                                    echo "<option value = ".$d->id_kelas;
                                                    if ($d->id_kelas == $data[0]->id_kelas){
                                                        echo " selected=selected";
                                                    }
                                                    echo ">".$d->nomor_kelas." - ".$d->nama_kelas."</option>";
                                                }
                                            ?>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Nama Mata Pelajaran:
                                        </label>
                                        <select class="form-control" name="id_mapel">
                                            <?php
                                                $i=1;
                                                foreach ($mapel as $d){
                                                    echo "<option value = ".$d->id_mapel;
                                                    if ($d->id_mapel == $data[0]->id_mapel){
                                                        echo " selected=selected";
                                                    }
                                                    echo ">".$d->nama_mapel."</option>";
                                                }
                                            ?>
                                        </select>
                                    </div>
                                    <?php 
                                        if (form_error('nomer_bab') != NULL){
                                            echo "<div class='alert alert-danger alert-dismissable' role='alert'>";
                                            echo "<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>";
                                            echo form_error('nomer_bab');
                                            echo "</div>";    
                                        }
                                    ?>
                                    <div class="form-group">
                                        <label class="control-label">Nomer Bab:
                                        </label>
                                        <input class="form-control" name="nomer_bab" value="<?=$data[0]->nomor_bab?>" type="number"></input>
                                    </div>
                                    <?php 
                                        if (form_error('nama_bab') != NULL){
                                            echo "<div class='alert alert-danger alert-dismissable' role='alert'>";
                                            echo "<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>";
                                            echo form_error('nama_bab');
                                            echo "</div>";    
                                        }
                                    ?>
                                    <div class="form-group">
                                        <label class="control-label">Nama Bab:
                                        </label>
                                        <input class="form-control" name="nama_bab" value="<?=$data[0]->nama_bab?>" type="text"></input>
                                    </div>
                                    <div class="pull-right">
                                        <button class="btn btn-success" type="submit"><b>OK</b></button>
                                    </div>
                                <?php
                                    echo form_close();
                                ?>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->


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

