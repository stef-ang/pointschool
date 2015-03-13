package com.pointschool.pointschool;

/**
 * Created by Krilido on 3/13/2015.
 */
public class Mapel {

    int id_mapel;
    String nama_mapel;

    public Mapel(){

    }

    public Mapel (int id, String nama){
        this.id_mapel = id;
        this.nama_mapel = nama;

    }

    public Mapel(String nama){
        this.nama_mapel = nama;
    }

    public int getID(){
        return this.id_mapel;
    }

    public void setID(int id){
        this.id_mapel = id;
    }

    public String getNama(){
        return this.nama_mapel;
    }

    public void setID(String nama){
        this.nama_mapel = nama;
    }
}
