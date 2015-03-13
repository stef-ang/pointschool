package com.pointschool.pointschool;

/**
 * Created by Krilido on 3/13/2015.
 */
public class Soal {

    int id_soal;
    int id_paket_soal;
    int nomor_soal;
    String id_file_soal;
    String pilihan1;
    String pilihan2;
    String pilihan3;
    String pilihan4;
    String pilihan5;
    String pembahasan_soal;
    String catatan_soal;

    public Soal(){

    }

    public Soal(int id, int paket, int no, String id_file, String Pilhan1, String Pilhan2, String Pilhan3, String Pilhan4, String Pilhan5, String pembahasan, String catatan) {
        this.id_paket_soal = paket;
        this.id_soal = id;
        this.nomor_soal = no;
        this.id_file_soal = id_file;
        this.pembahasan_soal = pembahasan;
        this.catatan_soal = catatan;
        this.pilihan1 = Pilhan1;
        this.pilihan2 = Pilhan2;
        this.pilihan3 = Pilhan3;
        this.pilihan4 = Pilhan4;
        this.pilihan5 = Pilhan5;
    }

    public int getId_soal(){
        return this.id_soal;
    }

    public void setId_soal(int id){
        this.id_soal = id;
    }

    public int getId_paket_soal(){
        return this.id_paket_soal;
    }

    public void setId_paket_soal(int id){
        this.id_paket_soal = id;
    }

    public int getNomor_soal(){
        return this.nomor_soal;
    }

    public void setNomor_soal(int id){
        this.nomor_soal = id;
    }

    public String getId_file_soal(){
        return this.id_file_soal;
    }

    public void setId_file_soal(String nama){
        this.id_file_soal = nama;
    }

    public String getPembahasan_soal(){
        return this.pembahasan_soal;
    }

    public void setPembahasan_soal(String pem){
        this.pembahasan_soal = pem;
    }

    public String getCatatan_soal(){
        return this.catatan_soal;
    }

    public void setCatatan_soal(String cat){
        this.catatan_soal = cat;
    }

    public String getPilihan1(){
        return this.pilihan1;
    }

    public void setPilihan1(String pem){
        this.pilihan1 = pem;
    }

    public String getPilihan2(){
        return this.pilihan1;
    }

    public void setPilihan2(String pem){
        this.pilihan1 = pem;
    }

    public String getPilihan3(){
        return this.pilihan1;
    }

    public void setPilihan3(String pem){
        this.pilihan1 = pem;
    }

    public String getPilihan4(){
        return this.pilihan1;
    }

    public void setPilihan4(String pem){
        this.pilihan1 = pem;
    }

    public String getPilihan5(){
        return this.pilihan1;
    }

    public void setPilihan5(String pem){
        this.pilihan1 = pem;
    }



}


