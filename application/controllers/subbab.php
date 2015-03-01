<?php
class Subbab extends CI_Controller {

	public function index()
	{
		$this->load->model('bab_model');
		$data['data'] = $this->bab_model->getData();

		$this->load->view('subbab_view',$data);
	}

	public function insert()
	{
		$id_bab = $_POST['id_bab'];
		$nomor_subbab = $_POST['nomor_subbab'];
		$nama_subbab = $_POST['nama_subbab'];

		$data = array(
			'id_bab' => $id_bab,
		   	'nomor_subbab' => $nomor_subbab,
		   	'nama_subbab' => $nama_subbab
		);

		$this->load->model('subbab_model');
		$this->subbab_model->insert($data);
		$text = "subbab/detailSubbab/".$id_bab."?status=0";
		redirect($text, 'refresh');
	}

	public function detailSubbab($id_bab){
		$this->load->model('subbab_model');
		$data['data'] = $this->subbab_model->getData($id_bab);

		$this->load->model('bab_model');
		$data['bab'] = $this->bab_model->getBab($id_bab);		

		$this->load->view('detail_subbab',$data);
	}

	public function editSubbab($id_subbab){

		$this->load->model('subbab_model');
		$data['data'] = $this->subbab_model->getSubbab($id_subbab);
		$this->load->view('edit_subbab',$data);
	}

	public function edit($id_subbab)
	{
		$id_bab = $_POST['id_bab'];
		$nomor_subbab = $_POST['nomor_subbab'];
		$nama_subbab = $_POST['nama_subbab'];

		$data = array(
			'id_bab' => $id_bab,
		   	'nomor_subbab' => $nomor_subbab,
		   	'nama_subbab' => $nama_subbab
		);

		$this->load->model('subbab_model');
		$this->subbab_model->update($id_subbab, $data);

		$text = "subbab/editSubbab/".$id_subbab."?status=0";
		redirect($text, 'refresh');
	}
	

	public function hapusSubbab($id_subbab)
	{
		$this->load->model('subbab_model');
		$data['data'] = $this->subbab_model->getSubbab($id_subbab);
		$text = "subbab/detailSubbab/".$data['data'][0]->id_bab;
		$this->subbab_model->delete($id_subbab);

		redirect($text, 'refresh');
	}
}