<?php
class Bab extends CI_Controller {

	public function index()
	{
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$this->load->model('bab_model');
			$data['data'] = $this->bab_model->getData();
			
			$this->load->model('kelas_model');
			$data['kelas'] = $this->kelas_model->getData();

			$this->load->model('mapel_model');
			$data['mapel'] = $this->mapel_model->getData();
			$header['title'] = "Kelola Bab Mata Pelajaran";
			$this->load->view('header_sidebar',$header);
			$this->load->view('bab_view',$data);
			$this->load->view('footer');
		}
	}

	public function insert()
	{

		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$id_kelas = $_POST['id_kelas'];
			$id_mapel = $_POST['id_mapel'];
			$nomor_bab = $_POST['nomer_bab'];
			$nama_bab = $_POST['nama_bab'];

			$data = array(
				'id_kelas' => $id_kelas,
				'id_mapel' => $id_mapel,
			   	'nomor_bab' => $nomor_bab,
			   	'nama_bab' => $nama_bab
			);

			$this->load->library('form_validation');
			$this->form_validation->set_rules('nomer_bab', 'Nomer Bab', 'required');
			$this->form_validation->set_rules('nama_bab', 'Nama Bab', 'required');
			$this->form_validation->set_message('required', 'Field %s harus diisi!');
			if ($this->form_validation->run() == FALSE)
			{
				$this->index();
			}
			else
			{
				$this->load->model('bab_model');
				$this->bab_model->insert($data);
				redirect('bab?status=0', 'refresh');	
				//header('Location: '+site_url()+'bab?status=0') ;
			}
		}
	}

	public function editBab($id_bab)
	{
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$this->load->model('kelas_model');
			$data['kelas'] = $this->kelas_model->getData();

			$this->load->model('mapel_model');
			$data['mapel'] = $this->mapel_model->getData();

			$this->load->model('bab_model');
			$data['data'] = $this->bab_model->getBab($id_bab);
			//print_r($data['mapel']);
			$header['title'] = "Kelola Bab Mata Pelajaran";
			$this->load->view('header_sidebar',$header);
			$this->load->view('edit_bab',$data);
			$this->load->view('footer');
		}
		
	}

	public function edit($id_bab)
	{
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$id_kelas = $_POST['id_kelas'];
			$id_mapel = $_POST['id_mapel'];
			$nomor_bab = $_POST['nomer_bab'];
			$nama_bab = $_POST['nama_bab'];

			$data = array(
				'id_kelas' => $id_kelas,
				'id_mapel' => $id_mapel,
			   	'nomor_bab' => $nomor_bab,
			   	'nama_bab' => $nama_bab
			);



			$this->load->library('form_validation');
			$this->form_validation->set_rules('nomer_bab', 'Nomer Bab', 'required');
			$this->form_validation->set_rules('nama_bab', 'Nama Bab', 'required');
			$this->form_validation->set_message('required', 'Field %s harus diisi!');
			if ($this->form_validation->run() == FALSE)
			{
				$this->editBab($id_bab);
			}
			else
			{
				$this->load->model('bab_model');
				$this->bab_model->update($id_bab, $data);

				$text = "bab/editBab/".$id_bab."?status=0";
				redirect($text, 'refresh');
			}
		}
	}

	public function hapusBab($id_bab)
	{
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$this->load->model('bab_model');
			$this->bab_model->delete($id_bab);
			redirect('bab', 'refresh');
		}
	}
}