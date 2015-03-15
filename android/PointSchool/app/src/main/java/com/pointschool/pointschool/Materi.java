package com.pointschool.pointschool;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Krilido on 3/13/2015.
 */
public class Materi implements Parcelable {

    int id_materi;
//    int id_subbab;
    int nomor_materi;
    String id_file_materi;
    String catatan_materi;

    public Materi(){
        super();
    }

    public Materi(int id_mat, int nomor, String id_file, String catatan_materi){
        super();
        this.id_materi = id_mat;
      //  this.id_subbab = id_sub;
        this.nomor_materi = nomor;
        this.id_file_materi = id_file;
        this.catatan_materi = catatan_materi;
    }

    public Materi(int nomor, String id_file, String catatan){
        this.nomor_materi = nomor;
        this.id_file_materi = id_file;
        this.catatan_materi = catatan;
    }

    private Materi(Parcel in){
        super();
        this.id_materi = in.readInt();
        this.nomor_materi = in.readInt();
        this.id_file_materi = in.readString();
        this.catatan_materi = in.readString();

    }

    public int getId_materi(){
        return this.id_materi;
    }

    public void setId_materi(int id){
        this.id_materi = id;
    }
/*
    public int getId_subbab(){
        return this.id_subbab;
    }

    public void setId_subbab(int id){
        this.id_subbab = id;
    }
*/
    public int getNomor_materi(){
        return this.nomor_materi;
    }

    public void setNomor_materi(int id){
        this.nomor_materi = id;
    }
    public String getId_file_materi(){
        return this.id_file_materi;
    }

    public void setId_file_materi(String id){
        this.id_file_materi = id;
    }

    public String getCatatan_materi(){
        return this.catatan_materi;
    }

    public void setCatatan_materi(String materi){
        this.catatan_materi = materi;
    }

    @Override
    public String toString(){
        return "id:" + id_materi + ", nomor:" + nomor_materi + ", idFile:" + id_file_materi + ", catatan:" + catatan_materi;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags){
        parcel.writeInt(getId_materi());
        parcel.writeInt(getNomor_materi());
        parcel.writeString(getId_file_materi());
        parcel.writeString(getCatatan_materi());
    }

    public static final Parcelable.Creator<Materi> CREATOR = new Parcelable.Creator<Materi>(){
        public  Materi createFromParcel(Parcel in){
            return new Materi(in);
        }

        public Materi[] newArray(int size){
            return new Materi[size];
        }
    };

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id_materi;
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
        Materi other = (Materi) obj;
        if (id_materi != other.id_materi)
            return false;
        return true;
    }

}
