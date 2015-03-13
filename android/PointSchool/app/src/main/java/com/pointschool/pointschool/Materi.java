package com.pointschool.pointschool;

/**
 * Created by Krilido on 3/13/2015.
 */
public class Materi {

    int id_materi;
    int id_subbab;
    int nomor_materi;
    int id_file_materi;
    String catatan_materi;

    public Materi(){

    }

    public Materi(int id_mat, int id_sub, int nomor, int id_file, String catatan_materi){
        this.id_materi = id_mat;
        this.id_subbab = id_sub;
        this.nomor_materi = nomor;
        this.id_file_materi = id_file;
        this.catatan_materi = catatan_materi;
    }

    public int getId_materi(){
        return this.id_materi;
    }

    public void setId_materi(int id){
        this.id_materi = id;
    }

    public int getId_subbab(){
        return this.id_subbab;
    }

    public void setId_subbab(int id){
        this.id_subbab = id;
    }

    public int getNomor_materi(){
        return this.nomor_materi;
    }

    public void setNomor_materi(int id){
        this.nomor_materi = id;
    }
    public int getId_file_materi(){
        return this.id_file_materi;
    }

    public void setId_file_materi(int id){
        this.id_file_materi = id;
    }

    public String getCatatan_materi(){
        return this.catatan_materi;
    }

    public void setCatatan_materi(String nama){

    }
}
