<?php
class Dashboard extends CI_Controller {

	public function index()
	{
		
		if (!$this->session->userdata('username')) {
			redirect('login', 'refresh');
		} else {
			$header['title'] = "Dashboard";
			$this->load->view('header_sidebar',$header);
			
			$this->load->view('dashboard_view');
			$this->load->view('footer');
		}
	}
}