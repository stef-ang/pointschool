package com.pointschool.pointschool;

/**
 * Created by Krilido on 3/13/2015.
 */
public class Subbab {
    int id_subbab;
    int id_bab;
    int nomor_subbab;
    String nama_subbab;

    public Subbab(){

    }

    public Subbab(int id, int bab, int no, String nama){
        this.id_subbab = id;
        this.id_bab = bab;
        this.nomor_subbab = no;
        this.nama_subbab = nama;
    }


    public int getId_subbab(){
        return this.id_subbab;
    }

    public void setId_subbab(int id){
        this.id_subbab = id;
    }

    public int getId_bab(){
        return this.id_bab;
    }

    public void setId_bab(int id){
        this.id_bab = id;
    }

    public int getNomor_subbab(){
        return this.nomor_subbab;
    }

    public void setNomor_subbab(int id){
        this.nomor_subbab = id;
    }

    public String getNama_subbab(){
        return this.nama_subbab;
    }

    public void setNama_subbab(String nama){
        this.nama_subbab = nama;
    }
}
