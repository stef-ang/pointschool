package com.pointschool.pointschool;

/**
 * Created by Krilido on 3/13/2015.
 */
public class PaketSoal {

    int id_paket_soal;
    int id_bab;
    int nomor_paket_soal;
    String nama_paket_soal;
    String level_soal;

    public PaketSoal(){

    }

    public  PaketSoal(int id, int bab, int no, String nama, String level){
        this.id_paket_soal = id;
        this.id_bab = bab;
        this.nomor_paket_soal = no;
        this.nama_paket_soal = nama;
        this.level_soal = level;
    }

    public int getid_bab(){
        return this.id_bab;
    }

    public void setId_bab(int id){
        this.id_bab = id;
    }

    public int getId_paket_soal(){
        return this.id_paket_soal;
    }

    public void setId_paket_soal(int id){
        this.id_paket_soal = id;
    }

    public int getNomor_paket_soal(){
        return this.nomor_paket_soal;
    }

    public void setNomor_paket_soal(int id){
        this.nomor_paket_soal = id;
    }

    public String getNama_paket_soal(){
        return this.nama_paket_soal;
    }

    public void setNama_paket_soal(String nama){
        this.nama_paket_soal = nama;
    }

    public String getLevel_soal(){
        return this.level_soal;
    }

    public void setLevel_soal(String level){
        this.level_soal = level;
    }

}
