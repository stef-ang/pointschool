<?php 
class Bab_model extends CI_Model {
	public function getData(){
		$this->db->select('*');
		$this->db->from('bab');
		$this->db->join('kelas','kelas.id_kelas = bab.id_kelas');
		$this->db->join('mapel','mapel.id_mapel = bab.id_mapel');
		$query = $this->db->get();
		return $query->result();
	}


	public function insert($data){
		$this->db->insert('bab',$data);
	}

	public function getBab($id_bab){
		$this->db->join('kelas','kelas.id_kelas = bab.id_kelas');
		$this->db->join('mapel','mapel.id_mapel = bab.id_mapel');
		$query = $this->db->get_where('bab', array('id_bab' => $id_bab));
		return $query->result();
	}

	public function update($id_bab,$data){
		$this->db->where('id_bab', $id_bab);
		$this->db->update('bab', $data);
	}

	public function delete($id_bab){
		$this->db->delete('bab', array('id_bab' => $id_bab)); 
	}
}
