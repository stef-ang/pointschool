<?php
class Login extends CI_Controller {

	public function index()
	{
		$this->load->view('login_view');
	}
	public function do_login()
	{

		$username = $_POST['username'];
		$password = $_POST['password'];

		$this->load->model('login_model');
		if ($this->login_model->checkdata($username,$password)==1){
			$header['title'] = "Dashboard";
			$this->load->view('header_sidebar',$header);
			
			$this->load->view('dashboard_view');
			$this->load->view('footer');	
		}
		else{
			$this->load->view('login_view');
		}

	}
}
