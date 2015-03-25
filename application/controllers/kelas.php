<?php
class Kelas extends CI_Controller {

	public function index()
	{
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$this->load->model('kelas_model');
			$data['data'] = $this->kelas_model->getData();
			$header['title']= "Kelola Kelas";
			$this->load->view('header_sidebar',$header);
			$this->load->view('kelas_view',$data);
			$this->load->view('footer');
		}
	}

	public function insert()
	{
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$nomer_kelas = $_POST['nomer_kelas'];
			$nama_kelas = $_POST['nama_kelas'];

			$data = array(
			   'nomor_kelas' => $nomer_kelas,
			   'nama_kelas' => $nama_kelas
			);

			$this->load->library('form_validation');
			$this->form_validation->set_rules('nomer_kelas', 'Nomer Kelas', 'required');
			$this->form_validation->set_rules('nama_kelas', 'Nama Kelas', 'required');
			$this->form_validation->set_message('required', 'Field %s harus diisi!');
			if ($this->form_validation->run() == FALSE)
			{
				$this->index();
			}
			else
			{
				$this->load->model('kelas_model');
				$this->kelas_model->insert($data);
				
				redirect('kelas?status=0', 'refresh');
			}
		}
	}

	public function editKelas($id_kelas)
	{
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$this->load->model('kelas_model');
			$data['data'] = $this->kelas_model->getKelas($id_kelas);
			
			$header['title']= "Kelola Kelas";
			$this->load->view('header_sidebar',$header);
			$this->load->view('edit_kelas',$data);
			$this->load->view('footer');
		}
	}

	public function edit($id_kelas)
	{
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$nomer_kelas = $_POST['nomer_kelas'];
			$nama_kelas = $_POST['nama_kelas'];

			$data = array(
			   'nomor_kelas' => $nomer_kelas,
			   'nama_kelas' => $nama_kelas
			);

			$this->load->library('form_validation');
			$this->form_validation->set_rules('nomer_kelas', 'Nomer Kelas', 'required');
			$this->form_validation->set_rules('nama_kelas', 'Nama Kelas', 'required');
			$this->form_validation->set_message('required', 'Field %s harus diisi!');
			if ($this->form_validation->run() == FALSE)
			{
				$this->editKelas($id_kelas);
			}
			else
			{
				$this->load->model('kelas_model');
				$this->kelas_model->update($id_kelas, $data);

				$text = "kelas/editKelas/".$id_kelas."?status=0";
				redirect($text, 'refresh');
			}
		}
	}

	public function hapusKelas($id_kelas)
	{
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$this->load->model('kelas_model');
			$this->kelas_model->delete($id_kelas);
			redirect('kelas', 'refresh');
		}
	}
}