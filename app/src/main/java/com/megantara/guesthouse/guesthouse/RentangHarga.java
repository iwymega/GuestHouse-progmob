package com.megantara.guesthouse;

public class RentangHarga {
    private String rentangHarga;
    private String jumlahKamar;

    public RentangHarga(String rentangHarga, String jumlahKamar) {
        this.rentangHarga = rentangHarga;
        this.jumlahKamar = jumlahKamar;
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
}
