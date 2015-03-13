package com.pointschool.pointschool;

/**
 * Created by Krilido on 3/13/2015.
 */
public class Kelas {
    int id_kelas;
    int nomor_kelas;
    String nama_kelas;

    public Kelas(){


    }

    public Kelas(int id, int no, String nama){
        this.id_kelas = id;
        this.nomor_kelas = no;
        this.nama_kelas = nama;
    }

    public int getId_kelas(){
        return this.id_kelas;
    }

    public void setId_kelas(int id){
        this.id_kelas = id;
    }

    public int getNomor_kelas(){
        return this.nomor_kelas;
    }

    public void setNomor_kelas(int id){
        this.nomor_kelas = id;
    }

    public String getNama_kelas(){
        return this.nama_kelas;
    }

    public void setNama_kelas(String nama){
        this.nama_kelas = nama;
    }
}
