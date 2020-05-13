package com.megantara.guesthouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LokasiActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LokasiAdapter adapter;
    private ArrayList<Lokasi> lokasiArrayList;
    private LokasiAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);

        /*RecyclerView*/
        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_lokasi);

        setOnClickListener();

        adapter = new LokasiAdapter(lokasiArrayList, listener);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(LokasiActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new LokasiAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("rentangHarga", lokasiArrayList.get(position).getRentangHarga());
                intent.putExtra("jumlahKamar", lokasiArrayList.get(position).getJumlahKamar());
                intent.putExtra("lokasi", lokasiArrayList.get(position).getLokasi());
                startActivity(intent);
            }
        };
    }

    private void addData() {
        /*Menerima Data Jumlah Kamar*/
        String jumlahKamar;
        String rentangHarga;

        Bundle extras = getIntent().getExtras();
        jumlahKamar = extras.getString("jumlahKamar");
        rentangHarga = extras.getString("rentangHarga");

        /*Memasukan ke array*/
        lokasiArrayList = new ArrayList<>();
        lokasiArrayList.add(new Lokasi("Ubud", rentangHarga, jumlahKamar, R.drawable.ubud, "Gianyar Regency, Bali"));
        lokasiArrayList.add(new Lokasi("Uluwatu", rentangHarga, jumlahKamar, R.drawable.uluwatu_temple, "Badung Regency, Bali"));
        lokasiArrayList.add(new Lokasi("Canggu", rentangHarga, jumlahKamar, R.drawable.canggu, "Badung Regency, Bali"));
        lokasiArrayList.add(new Lokasi("Kuta", rentangHarga, jumlahKamar, R.drawable.kuta, "Badung Regency, Bali"));
    }
}
