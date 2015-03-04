<?php
class Rest extends CI_Controller {

	public function index()
	{
		$table = $this->input->post("table");
		$this->load->model('rest_model');
		$tables = $this->rest_model->getAllTable();
		if($table=="show"){
			$result = $tables;
		}
		else if(in_array($table,$tables)){
			
			$result = $this->rest_model->getTable($table);
			
		}
		else{
			echo "ERROR TABLE NOT FOUND";
			return;
		}
		echo json_encode($result);
	}

	
}