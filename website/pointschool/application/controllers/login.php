<?php
class Login extends CI_Controller {

	public function index()
	{
		$this->load->view('login_view');
	}
	public function do_login()
	{
		redirect('dashboard');
	}
}
