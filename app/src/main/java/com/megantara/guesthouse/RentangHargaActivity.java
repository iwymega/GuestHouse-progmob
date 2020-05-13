package com.megantara.guesthouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RentangHargaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RentangHargaAdapter adapter;
    private ArrayList<RentangHarga> rentangHargaArrayList;
    private RentangHargaAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentang_harga);

        /*RecyclerView*/
        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_rentang_harga);

        setOnClickListener();

        adapter = new RentangHargaAdapter(rentangHargaArrayList, listener);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RentangHargaActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new RentangHargaAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), LokasiActivity.class);
                intent.putExtra("rentangHarga", rentangHargaArrayList.get(position).getRentangHarga());
                intent.putExtra("jumlahKamar", rentangHargaArrayList.get(position).getJumlahKamar());
                startActivity(intent);
            }
        };
    }

    private void addData() {
        /*Menerima Data Jumlah Kamar*/
        String jumlahKamar;

        Bundle extras = getIntent().getExtras();
        jumlahKamar = extras.getString("JumlahKamar");

        /*Memasukan ke array*/
        rentangHargaArrayList = new ArrayList<>();
        rentangHargaArrayList.add(new RentangHarga("IDR 100K - 200K / Night", jumlahKamar));
        rentangHargaArrayList.add(new RentangHarga("IDR 200K - 300K / Night", jumlahKamar));
        rentangHargaArrayList.add(new RentangHarga("IDR 300K - 400K / Night", jumlahKamar));
        rentangHargaArrayList.add(new RentangHarga("IDR 400K - 500K / Night", jumlahKamar));
        rentangHargaArrayList.add(new RentangHarga("IDR 500K - 600K / Night", jumlahKamar));
        rentangHargaArrayList.add(new RentangHarga("IDR 600K - 700K / Night", jumlahKamar));
        rentangHargaArrayList.add(new RentangHarga("IDR 700K - 800K / Night", jumlahKamar));
        rentangHargaArrayList.add(new RentangHarga("IDR 800K - 900K / Night", jumlahKamar));
        rentangHargaArrayList.add(new RentangHarga("> 900K / Night", jumlahKamar));
    }
}
