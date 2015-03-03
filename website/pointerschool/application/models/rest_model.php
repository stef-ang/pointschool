<?php 
class Rest_model extends CI_Model {
	public function getTable($table){
		$query = $this->db->get($table);
		return $query->result();
	}
}
