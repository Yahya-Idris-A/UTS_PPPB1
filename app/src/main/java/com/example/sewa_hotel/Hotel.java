package com.example.sewa_hotel;

import android.os.Parcel;
import android.os.Parcelable;

public class Hotel implements Parcelable {
    private String nama;
    private String harga;
    private String deskripsi;
    private String fasilitas;
    private int photo;

    public Hotel(){

    }
    protected Hotel(Parcel in) {
        nama = in.readString();
        harga = in.readString();
        deskripsi = in.readString();
        fasilitas = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Hotel> CREATOR = new Creator<Hotel>() {
        @Override
        public Hotel createFromParcel(Parcel in) {
            return new Hotel(in);
        }

        @Override
        public Hotel[] newArray(int size) {
            return new Hotel[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(harga);
        parcel.writeString(deskripsi);
        parcel.writeString(fasilitas);
        parcel.writeInt(photo);
    }
}
