package com.pointschool.pointschool;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Krilido on 3/13/2015.
 */
public class Bab implements Parcelable{

    int id_bab;
//    int id_kelas;
//    int id_mapel;
    int nomor_bab;
    String nama_bab;

    public Bab(){
        super();
    }

    public Bab(int id, int no, String nama){
        super();
//        this.id_mapel = mapel;
        this.id_bab = id;
//        this.id_kelas = kel;
        this.nomor_bab = no;
        this.nama_bab = nama;
    }

    public Bab(int no, String nama){
        this.nomor_bab = no;
        this.nama_bab = nama;
    }

    private Bab(Parcel in){
        this.id_bab = in.readInt();
        this.nomor_bab = in.readInt();
        this.nama_bab = in.readString();
    }

    public int getid_bab(){
        return this.id_bab;
    }

    public void setId_bab(int id){
        this.id_bab = id;
    }
/*
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
*/
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

    @Override
    public String toString(){
        return "id:" + id_bab + ", nomor:" + nomor_bab + ", Nama:" + nama_bab;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags){
        parcel.writeInt(getid_bab());
        parcel.writeInt(getNomor_bab());
        parcel.writeString(getNama_bab());
     }

    public static final Parcelable.Creator<Bab> CREATOR = new Parcelable.Creator<Bab>(){
        public  Bab createFromParcel(Parcel in){
            return new Bab(in);
        }

        public Bab[] newArray(int size){
            return new Bab[size];
        }
    };

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id_bab;
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
        Bab other = (Bab) obj;
        if (id_bab != other.id_bab)
            return false;
        return true;
    }
}

