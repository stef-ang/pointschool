<?php
class Rest extends CI_Controller {

	public function index()
	{
		$table = $this->input->post("table");
		if($table){
			$this->load->model('rest_model');
			$result = $this->rest_model->getTable($table);
			echo json_encode($result);
		}
		else echo "ERROR ";
	}

	
}