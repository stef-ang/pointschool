<?php 
class Login_model extends CI_Model {
	public function checkdata($username, $password){
		
		$this->db->where('username', $username);
		$this->db->where('password', $password);
		$this->db->from('admin');
		return $this->db->count_all_results();
	}
}
