

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
                            <li class="active">
                                <i class="fa fa-file"></i> Detail
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-university fa-4x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div class="huge">Daftar Materi Pelajaran</div>
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
                                        <th><center>Detail</center></th>
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
                                            $text = "materi/detailMateri/".$d->id_subbab;
                                            echo form_open($text);
                                            echo "<input type=submit value=detail>";
                                            echo form_close();
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
