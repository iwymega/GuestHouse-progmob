package com.megantara.guesthouse;

public class Guesthouse {
    private String nama;
    private String jumlahKamar;
    private String lokasi;
    private int icon;
    private String harga;
    private int hargaInt;
    private String kecamatan;
    private int jumlahKamarInt;
    private String facility1;
    private String facility2;
    private String facility3;
    private String facility4;
    private String wisata1;
    private String wisata2;
    private String wisata3;
    private String wisata4;

    public Guesthouse(String nama, String jumlahKamar, String lokasi, int icon, String harga, int hargaInt, String kecamatan, int jumlahKamarInt, String facility1, String facility2, String facility3, String facility4, String wisata1, String wisata2, String wisata3, String wisata4) {
        this.nama = nama;
        this.jumlahKamar = jumlahKamar;
        this.lokasi = lokasi;
        this.icon = icon;
        this.harga = harga;
        this.hargaInt = hargaInt;
        this.kecamatan = kecamatan;
        this.jumlahKamarInt = jumlahKamarInt;
        this.facility1 = facility1;
        this.facility2 = facility2;
        this.facility3 = facility3;
        this.facility4 = facility4;
        this.wisata1 = wisata1;
        this.wisata2 = wisata2;
        this.wisata3 = wisata3;
        this.wisata4 = wisata4;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlahKamar() {
        return jumlahKamar;
    }

    public void setJumlahKamar(String jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getHargaInt() {
        return hargaInt;
    }

    public void setHargaInt(int hargaInt) {
        this.hargaInt = hargaInt;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public int getJumlahKamarInt() {
        return jumlahKamarInt;
    }

    public void setJumlahKamarInt(int jumlahKamarInt) {
        this.jumlahKamarInt = jumlahKamarInt;
    }

    public String getFacility1() {
        return facility1;
    }

    public void setFacility1(String facility1) {
        this.facility1 = facility1;
    }

    public String getFacility2() {
        return facility2;
    }

    public void setFacility2(String facility2) {
        this.facility2 = facility2;
    }

    public String getFacility3() {
        return facility3;
    }

    public void setFacility3(String facility3) {
        this.facility3 = facility3;
    }

    public String getFacility4() {
        return facility4;
    }

    public void setFacility4(String facility4) {
        this.facility4 = facility4;
    }

    public String getWisata1() {
        return wisata1;
    }

    public void setWisata1(String wisata1) {
        this.wisata1 = wisata1;
    }

    public String getWisata2() {
        return wisata2;
    }

    public void setWisata2(String wisata2) {
        this.wisata2 = wisata2;
    }

    public String getWisata3() {
        return wisata3;
    }

    public void setWisata3(String wisata3) {
        this.wisata3 = wisata3;
    }

    public String getWisata4() {
        return wisata4;
    }

    public void setWisata4(String wisata4) {
        this.wisata4 = wisata4;
    }
}
