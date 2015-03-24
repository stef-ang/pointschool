<?php 
class Materi_model extends CI_Model {
	public function getData($id_subbab){
		$query = $this->db->get_where('materi',array('id_subbab' => $id_subbab));
		return $query->result();
	}

	public function insert($data){
		$this->db->insert('materi',$data);
	}

	public function getSubbab($id_subbab){
		$query = $this->db->get_where('subbab',array('id_subbab' => $id_subbab));
		return $query->result();
	}

	public function delete($id_materi){
		$this->db->delete('materi', array('id_materi' => $id_materi)); 
	}

	public function update($id_subbab,$data){
		$this->db->where('id_subbab', $id_subbab);
		$this->db->update('subbab', $data);
	}

	public function getMax(){
		$this->db->select_max('id_materi');
		$query = $this->db->get('materi');
		return $query->result();
	}

	public function getMateri($id_materi){
		$query = $this->db->get_where('materi',array('id_materi' => $id_materi));
		return $query->result();
	}
}
