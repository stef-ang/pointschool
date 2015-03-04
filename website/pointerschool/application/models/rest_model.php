<?php 
class Rest_model extends CI_Model {
	public function getAllTable(){
		$tables = $this->db->list_tables();
		return $tables;
	}
	public function getTable($table){
		$query = $this->db->get($table);
		return $query->result();
	}
}
