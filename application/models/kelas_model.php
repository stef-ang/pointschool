<?php 
class Kelas_model extends CI_Model {
	public function getData(){
		$query = $this->db->get('kelas');
		return $query->result();
	}


	public function insert($data){
		$this->db->insert('kelas',$data);
	}

	public function getKelas($id_kelas){
		$query = $this->db->get_where('kelas', array('id_kelas' => $id_kelas));
		return $query->result();
	}

	public function update($id_kelas,$data){
		$this->db->where('id_kelas', $id_kelas);
		$this->db->update('kelas', $data);
	}

	public function delete($id_kelas){
		$this->db->delete('kelas', array('id_kelas' => $id_kelas)); 
	}
}
