package com.megantara.guesthouse;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView namaText = findViewById(R.id.detail_title);
        ImageView iconImg = findViewById(R.id.detail_icon);
        TextView jumlahKamarText = findViewById(R.id.detail_jumlah_kamar);
        TextView hargaText = findViewById(R.id.detail_harga);
        TextView lokasiText = findViewById(R.id.detail_lokasi);
        TextView facility1Text = findViewById(R.id.facility1);
        TextView facility2Text = findViewById(R.id.facility2);
        TextView facility3Text = findViewById(R.id.facility3);
        TextView facility4Text = findViewById(R.id.facility4);
        TextView wisata1Text = findViewById(R.id.wisata1);
        TextView wisata2Text = findViewById(R.id.wisata2);
        TextView wisata3Text = findViewById(R.id.wisata3);
        TextView wisata4Text = findViewById(R.id.wisata4);

        String nama = "Guesthouse name not set";
        int icon = R.drawable.gh1;
        String jumlahkamar = "Jumlah kamar not set";
        String harga = "Harga not set";
        String lokasi = "Lokasi not set";
        String facility1 = "facility1 not set";
        String facility2 = "facility2 not set";
        String facility3 = "facility3 not set";
        String facility4 = "facility4 not set";
        String wisata1 = "wisata1 not set";
        String wisata2 = "wisata2 not set";
        String wisata3 = "wisata3 not set";
        String wisata4 = "wisata4 not set";

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            nama = extras.getString("Nama");
            icon = extras.getInt("Image");
            jumlahkamar = extras.getString("JumlahKamar");
            harga = extras.getString("Harga");
            lokasi = extras.getString("Lokasi");
            facility1 = extras.getString("Facility1");
            facility2 = extras.getString("Facility2");
            facility3 = extras.getString("Facility3");
            facility4 = extras.getString("Facility4");
            wisata1 = extras.getString("Wisata1");
            wisata2 = extras.getString("Wisata2");
            wisata3 = extras.getString("Wisata3");
            wisata4 = extras.getString("Wisata4");

        }

        namaText.setText(nama);
        iconImg.setImageResource(icon);
        jumlahKamarText.setText(jumlahkamar);
        hargaText.setText(harga);
        lokasiText.setText(lokasi);
        facility1Text.setText(facility1);
        facility2Text.setText(facility2);
        facility3Text.setText(facility3);
        facility4Text.setText(facility4);
        wisata1Text.setText(wisata1);
        wisata2Text.setText(wisata2);
        wisata3Text.setText(wisata3);
        wisata4Text.setText(wisata4);
    }
}