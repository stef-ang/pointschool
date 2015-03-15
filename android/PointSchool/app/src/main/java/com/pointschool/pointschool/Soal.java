package com.pointschool.pointschool;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Krilido on 3/13/2015.
 *
 */


public class Soal implements Parcelable {

    int id_soal;
//    int id_paket_soal;
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
        super();
    }

    public Soal(int id, int no, String id_file, String Pilhan1, String Pilhan2, String Pilhan3, String Pilhan4, String Pilhan5, String pembahasan, String catatan) {
        super();
//        this.id_paket_soal = paket;
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

    public Soal(int no, String id_file, String Pilhan1, String Pilhan2, String Pilhan3, String Pilhan4, String Pilhan5, String pembahasan, String catatan) {
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

    private Soal(Parcel in){
        super();
//        this.id_paket_soal = paket;
        this.id_soal = in.readInt();
        this.nomor_soal = in.readInt();
        this.id_file_soal = in.readString();
        this.pembahasan_soal = in.readString();
        this.catatan_soal = in.readString();
        this.pilihan1 = in.readString();
        this.pilihan2 = in.readString();
        this.pilihan3 = in.readString();
        this.pilihan4 = in.readString();
        this.pilihan5 = in.readString();
    }


    public int getId_soal(){
        return this.id_soal;
    }

    public void setId_soal(int id){
        this.id_soal = id;
    }
/*
    public int getId_paket_soal(){
        return this.id_paket_soal;
    }

    public void setId_paket_soal(int id){
        this.id_paket_soal = id;
    }
*/
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
        return this.pilihan2;
    }

    public void setPilihan2(String pem){
        this.pilihan2 = pem;
    }

    public String getPilihan3(){
        return this.pilihan3;
    }

    public void setPilihan3(String pem){
        this.pilihan3 = pem;
    }

    public String getPilihan4(){
        return this.pilihan4;
    }

    public void setPilihan4(String pem){
        this.pilihan4 = pem;
    }

    public String getPilihan5(){
        return this.pilihan5;
    }

    public void setPilihan5(String pem){
        this.pilihan5 = pem;
    }

    @Override
    public String toString(){
        return "id:" + id_soal + ", nomor:" + nomor_soal + ", idFile:" + id_file_soal + ", Pembahasan:" + pembahasan_soal + ", catatan:" + catatan_soal + ", Pilihan 1:" + pilihan1 + ", Pilihan 2:" + pilihan2 + ", Pilihan 3:" + pilihan3 + ", Pilihan 4:" + pilihan4 + ", Pilihan 5:" + pilihan5;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags){
        parcel.writeInt(getId_soal());
        parcel.writeInt(getNomor_soal());
        parcel.writeString(getId_file_soal());
        parcel.writeString(getPembahasan_soal());
        parcel.writeString(getCatatan_soal());
        parcel.writeString(getPilihan1());
        parcel.writeString(getPilihan2());
        parcel.writeString(getPilihan3());
        parcel.writeString(getPilihan4());
        parcel.writeString(getPilihan5());
    }

    public static final Parcelable.Creator<Soal> CREATOR = new Parcelable.Creator<Soal>(){
        public Soal createFromParcel(Parcel in){
            return new Soal(in);
        }

        public Soal[] newArray(int size){
            return new Soal[size];
        }
    };

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id_soal;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Soal other = (Soal) obj;
        if (id_soal != other.id_soal)
            return false;
        return true;
    }

}


