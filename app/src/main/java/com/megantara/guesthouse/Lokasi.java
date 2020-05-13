package com.megantara.guesthouse;

public class Lokasi {
    private String lokasi;
    private String rentangHarga;
    private String jumlahKamar;
    private int img_lokasi;
    private String deskripsiLokasi;

    public Lokasi(String lokasi, String rentangHarga, String jumlahKamar, int img_lokasi, String deskripsiLokasi) {
        this.lokasi = lokasi;
        this.jumlahKamar = jumlahKamar;
        this.rentangHarga = rentangHarga;
        this.img_lokasi = img_lokasi;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    public String getLokasi(){
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getRentangHarga(){
        return rentangHarga;
    }

    public void setRentangHarga(String rentangHarga) {
        this.rentangHarga = rentangHarga;
    }

    public String getJumlahKamar(){
        return jumlahKamar;
    }

    public void setJumlahKamar(String jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public int getImg_lokasi() {
        return img_lokasi;
    }

    public void setImg_lokasi(int img_lokasi) {
        this.img_lokasi = img_lokasi;
    }

    public String getDeskripsiLokasi(){
        return deskripsiLokasi;
    }

    public void setDeskripsiLokasi(String deskripsiLokasi) {
        this.deskripsiLokasi = deskripsiLokasi;
    }
}
