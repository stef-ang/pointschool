<?php 
class Mapel_model extends CI_Model {
	public function getData(){
		$query = $this->db->get('mapel');
		return $query->result();
	}


	public function insert($data){
		$this->db->insert('mapel',$data);
	}

	public function getMapel($id_mapel){
		$query = $this->db->get_where('mapel', array('id_mapel' => $id_mapel));
		return $query->result();
	}

	public function update($id_mapel,$data){
		$this->db->where('id_mapel', $id_mapel);
		$this->db->update('mapel', $data);
	}

	public function delete($id_mapel){
		$this->db->delete('mapel', array('id_mapel' => $id_mapel)); 
	}
}
