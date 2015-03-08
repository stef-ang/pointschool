<?php
class Materi extends CI_Controller {

	public function index()
	{
		$this->load->model('bab_model');
		$data['data'] = $this->bab_model->getData();
		$header['title']="Kelola Materi Pelajaran";
		$this->load->view('header_sidebar',$header);
		$this->load->view('materi_view',$data);
		$this->load->view('footer');
	}

	public function insert()
	{
		$id_subbab = $_POST['id_subbab'];
		$nomor_materi = $_POST['nomor_materi'];
		$catatan_materi = $_POST['catatan_materi'];
		$this->load->model('materi_model');
		$idx['data'] = $this->materi_model->getMax();
		$nomer = $idx['data']['0']->id_materi + 1;
		
		$txt = "./upload/".$id_subbab."/";
		if (!is_dir($txt))
		{
			mkdir($txt,777);
		}

		$allowedExts = array("gif", "jpeg", "jpg", "png");
		$temp = explode(".", $_FILES["file"]["name"]);
		$extension = end($temp);
		$newName = $nomer . "." . $extension;
		$path = $txt . $newName;
		//echo $path;
		
		$this->load->library('form_validation');
		$this->form_validation->set_rules('nomor_materi', 'Nomor Materi', 'required');
		$this->form_validation->set_message('required', 'Field %s harus diisi!');
		if ($this->form_validation->run() == FALSE)
		{
			$this->detailMateri($id_subbab);
		}
		else
		{

			move_uploaded_file($_FILES["file"]["tmp_name"],$path);
			$file_path = "upload/".$id_subbab."/".$newName;
			$data = array(
				'id_subbab' => $id_subbab,
			   	'nomor_materi' => $nomor_materi,
			   	'id_file_materi' => $file_path,
			   	'catatan_materi' => $catatan_materi
			);
			$this->materi_model->insert($data);
			$text = "materi/detailMateri/".$id_subbab."?status=0";
			redirect($text, 'refresh');
		}
	}

	public function detail($id_bab){
		$this->load->model('subbab_model');
		$data['data'] = $this->subbab_model->getData($id_bab);

		$this->load->model('bab_model');
		$data['bab'] = $this->bab_model->getBab($id_bab);		

		$header['title']="Kelola Materi Pelajaran";
		$this->load->view('header_sidebar',$header);
		$this->load->view('detail_materi1',$data);
		$this->load->view('footer');
	}

	public function detailMateri($id_subbab){
		$this->load->model('materi_model');
		$data['data'] = $this->materi_model->getData($id_subbab);

		$this->load->model('subbab_model');
		$data['subbab'] = $this->subbab_model->getSubbab($id_subbab);

		$this->load->model('bab_model');
		$data['bab'] = $this->bab_model->getBab($data['subbab'][0]->id_bab);		

		$header['title']="Kelola Sub-Bab Mata Pelajaran";
		$this->load->view('header_sidebar',$header);
		$this->load->view('detail_materi2',$data);
		$this->load->view('footer');
	}

	public function editMateri($id_materi){

		$this->load->model('materi_model');
		$data['data'] = $this->materi_model->getMateri($id_materi);

		$this->load->model('subbab_model');
		//$data['subbab'] = $this->subbab_model->getSubbab($data['data'][0]->id_bab);

		$header['title']="Kelola Materi Pelajaran";
		$this->load->view('header_sidebar',$header);
		$this->load->view('edit_materi',$data);
		$this->load->view('footer');
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

		$this->load->library('form_validation');
		$this->form_validation->set_rules('nomor_subbab', 'Nomor Sub-Bab', 'required');
		$this->form_validation->set_rules('nama_subbab', 'Nama Sub-Bab', 'required');
		$this->form_validation->set_message('required', 'Field %s harus diisi!');
		if ($this->form_validation->run() == FALSE)
		{
			$this->editSubbab($id_subbab);
		}
		else
		{

			$this->load->model('subbab_model');
			$this->subbab_model->update($id_subbab, $data);

			$text = "subbab/editSubbab/".$id_subbab."?status=0";
			redirect($text, 'refresh');
		}

		
	}
	

	public function hapusMateri($id_materi)
	{
		$this->load->model('materi_model');
		$data['data'] = $this->materi_model->getMateri($id_materi);
		$text = "materi/detailMateri/".$data['data'][0]->id_subbab;
		$this->materi_model->delete($id_materi);

		redirect($text, 'refresh');
	}
}