

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                           Sub-Bab Mata Pelajaran
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="<?=base_url()?>index.php/dashboard">Dashboard</a>
                            </li>
                            <li>
                                <i class="fa fa-file"></i> <a href="<?=base_url()?>index.php/subbab">Sub-Bab</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-file"></i> Detail Sub-Bab
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-8">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-university fa-4x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div class="huge">Daftar Sub Bab Mata Pelajaran</div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body"></div>
                            <table class="table">
                                <tr>    
                                    <th width=150px>Kelas</th> <td width=10px>:</td> <td><?=$bab[0]->nomor_kelas." - ".$bab[0]->nama_kelas?></td>
                                </tr>
                                <tr>
                                    <th>Mata Pelajaran</th> <td>:</td> <td><?=$bab[0]->nama_mapel?></td>
                                </tr>
                                <tr>
                                    <th>Bab</th> <td>:</td> <td><?=$bab[0]->nomor_bab?></td>
                                </tr>
                                <tr>
                                    <th>Nama Bab</th> <td>:</td> <td><?=$bab[0]->nama_bab?></td>
                                </tr>
                            </table>
                            <br>
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th><center>No</center></th>
                                        <th><center>Nomer Sub-Bab</center></th>
                                        <th><center>Nama Sub-Bab</center></th>
                                        <th><center>Edit</center></th>
                                        <th><center>Delete</center></th> 
                                    </tr>
                                </thead>
                                <tbody>
                                   <?php
                                    $i=1;
                                    foreach ($data as $d){ // perulangan untuk menampilkan semua post
                                        echo "<tr>";
                                        echo "<td align=center>".$i."</td>";
                                        echo "<td align=center>".$d->nomor_subbab."</td>";
                                        echo "<td>".$d->nama_subbab."</td>";
                                        echo "<td align = center>";
                                            $text = "subbab/editSubbab/".$d->id_subbab;
                                            echo form_open($text);
                                            echo "<input type=submit value=edit>";
                                            echo form_close();
                                        echo "</td>";
                                        echo "<td align = center>";
                                            echo "<input type=submit value=delete onclick=myFunction(".$d->id_subbab.")>";
                                        echo "</td>";
                                        echo "</tr>";
                                        echo "</tr>";
                                        $i++;
                                    }
                                ?>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="panel panel-green">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-2">
                                        <i class="fa fa-plus-circle fa-4x"></i>
                                    </div>
                                    <div class="col-xs-10 text-right">
                                        <div class="huge">Tambah Sub-Bab</div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body">
                                <?php
                                    if(isset($_GET['status']) && $_GET['status'] == 0)
                                    {
                                        echo "<div class='alert alert-success alert-dismissable'  role='alert'>";
                                        echo "<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>";
                                        echo "Sub-bab berhasil ditambahkan";
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
                                <?php
                                    $text = "subbab/insert";
                                    echo form_open($text);
                                ?>
                                    <div class="form-group">
                                        <input class="form-control" name="id_bab" type="hidden" value="<?=$bab[0]->id_bab?>"></input>
                                    </div>
                                    <?php 
                                        if (form_error('nomor_subbab') != NULL){
                                            echo "<div class='alert alert-danger alert-dismissable' role='alert'>";
                                            echo "<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>";
                                            echo form_error('nomor_subbab');
                                            echo "</div>";    
                                        }
                                    ?>
                                    <div class="form-group">
                                        <label class="control-label">Nomer Sub-Bab:</label>
                                        <input class="form-control" name="nomor_subbab" value="<?php echo set_value('nomor_subbab');?>" type="text"></input>
                                    </div>
                                    <?php 
                                        if (form_error('nama_subbab') != NULL){
                                            echo "<div class='alert alert-danger alert-dismissable' role='alert'>";
                                            echo "<button type='button' class='close' data-dismiss='alert' aria-hidden='true'>&times;</button>";
                                            echo form_error('nama_subbab');
                                            echo "</div>";    
                                        }
                                    ?>
                                    <div class="form-group">
                                        <label class="control-label">Nama Sub-Bab:
                                        </label>
                                        <input class="form-control" name="nama_subbab" value="<?php echo set_value('nama_subbab');?>" type="text"></input>
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

    <script>
        function myFunction(p1) {
            if (confirm("Apakah anda yakin untuk menghapus Sub-bab ini ?") == true) {
                var text = "../hapusSubbab/"+p1;
                window.location.replace(text);
            } else {
                
            }
            
        }
    </script>
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
