<?php 
class Subbab_model extends CI_Model {
	public function getData($id_bab){
		$query = $this->db->get_where('subbab',array('id_bab' => $id_bab));
		return $query->result();
	}

	public function insert($data){
		$this->db->insert('subbab',$data);
	}

	public function getSubbab($id_subbab){
		$query = $this->db->get_where('subbab',array('id_subbab' => $id_subbab));
		return $query->result();
	}

	public function delete($id_subbab){
		$this->db->delete('subbab', array('id_subbab' => $id_subbab)); 
	}

	public function update($id_subbab,$data){
		$this->db->where('id_subbab', $id_subbab);
		$this->db->update('subbab', $data);
	}
}
