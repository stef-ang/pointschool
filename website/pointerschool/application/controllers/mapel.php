<?php
class Mapel extends CI_Controller {

	public function index()
	{
		$this->load->model('mapel_model');
		$data['data'] = $this->mapel_model->getData();
		$this->load->view('mapel_view',$data);
	}

	public function insert()
	{
		$nama_mapel = $_POST['nama_mapel'];

		$data = array(
		   'nama_mapel' => $nama_mapel
		);

		$this->load->library('form_validation');
		$this->form_validation->set_rules('nama_mapel', 'Nama Mapel', 'required');
		$this->form_validation->set_message('required', 'Field %s harus diisi!');
		if ($this->form_validation->run() == FALSE)
		{
			$this->index();
		}
		else
		{
			$this->load->model('mapel_model');
			$this->mapel_model->insert($data);
			redirect('mapel?status=0', 'refresh');
		}

		
	}

	public function editMapel($id_mapel)
	{
		$this->load->model('mapel_model');
		$data['data'] = $this->mapel_model->getMapel($id_mapel);
		//print_r($data['data']);
		$this->load->view('edit_mapel',$data);
	}

	public function edit($id_mapel)
	{
		$nama_mapel = $_POST['nama_mapel'];

		$data = array(
		   'nama_mapel' => $nama_mapel
		);


		$this->load->library('form_validation');
		$this->form_validation->set_rules('nama_mapel', 'Nama Mapel', 'required');
		$this->form_validation->set_message('required', 'Field %s harus diisi!');
		if ($this->form_validation->run() == FALSE)
		{
			$this->editMapel($id_mapel);
		}
		else
		{
			$this->load->model('mapel_model');
			$this->mapel_model->update($id_mapel, $data);
			$text = "mapel/editMapel/".$id_mapel."?status=0";
			redirect($text, 'refresh');
		}

		
	}

	public function hapusMapel($id_mapel)
	{
		$this->load->model('mapel_model');
		$this->mapel_model->delete($id_mapel);
		redirect('mapel', 'refresh');
	}
}