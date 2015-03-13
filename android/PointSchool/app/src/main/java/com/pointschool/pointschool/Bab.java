package com.pointschool.pointschool;

/**
 * Created by Krilido on 3/13/2015.
 */
public class Bab {

    int id_bab;
    int id_kelas;
    int id_mapel;
    int nomor_bab;
    String nama_bab;

    public Bab(){

    }

    public Bab(int id, int kel, int mapel, int no, String nama){
        this.id_mapel = mapel;
        this.id_bab = id;
        this.id_kelas = kel;
        this.nomor_bab = no;
        this.nama_bab = nama;
    }

    public int getid_bab(){
        return this.id_bab;
    }

    public void setId_bab(int id){
        this.id_bab = id;
    }

    public int getId_kelas(){
        return this.id_kelas;
    }

    public void setId_kelas(int id){
        this.id_kelas = id;
    }

    public int getId_mapel(){
        return this.id_mapel;
    }

    public void setId_mapel(int id){
        this.id_mapel = id;
    }

    public int getNomor_bab(){
        return this.nomor_bab;
    }

    public void setNomor_bab(int id){
        this.nomor_bab = id;
    }

    public String getNama_bab(){
        return this.nama_bab;
    }

    public void setNama_bab(String nama){
        this.nama_bab = nama;
    }

}

