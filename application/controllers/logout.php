<?php
class Logout extends CI_Controller {

	public function index()
	{
		$username = $this->session->userdata('username');
		$data =  array('username' => $username);
		$this->session->unset_userdata($data);
		$this->session->sess_destroy();
		redirect('login', 'refresh');
	}
}
