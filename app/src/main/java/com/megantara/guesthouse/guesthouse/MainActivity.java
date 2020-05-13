package com.megantara.guesthouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GuesthouseAdapter adapter;
    private ArrayList<Guesthouse> guesthouseArrayList;
    private GuesthouseAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        setOnClickListener();

        adapter = new GuesthouseAdapter(guesthouseArrayList, listener);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new GuesthouseAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("Nama", guesthouseArrayList.get(position).getNama());
                intent.putExtra("Image", guesthouseArrayList.get(position).getIcon());
                intent.putExtra("JumlahKamar", guesthouseArrayList.get(position).getJumlahKamar());
                intent.putExtra("Harga", guesthouseArrayList.get(position).getHarga());
                intent.putExtra("Lokasi", guesthouseArrayList.get(position).getLokasi());
                intent.putExtra("Facility1", guesthouseArrayList.get(position).getFacility1());
                intent.putExtra("Facility2", guesthouseArrayList.get(position).getFacility2());
                intent.putExtra("Facility3", guesthouseArrayList.get(position).getFacility3());
                intent.putExtra("Facility4", guesthouseArrayList.get(position).getFacility4());
                intent.putExtra("Wisata1", guesthouseArrayList.get(position).getWisata1());
                intent.putExtra("Wisata2", guesthouseArrayList.get(position).getWisata2());
                intent.putExtra("Wisata3", guesthouseArrayList.get(position).getWisata3());
                intent.putExtra("Wisata4", guesthouseArrayList.get(position).getWisata4());
                startActivity(intent);
            }
        };
    }

    private void addData() {
        /*Menerima Data Lokasi*/
        String jumlahKamar;
        String rentangHarga;
        String lokasi;

        Bundle extras = getIntent().getExtras();
        jumlahKamar = extras.getString("jumlahKamar");
        rentangHarga = extras.getString("rentangHarga");
        lokasi = extras.getString("lokasi");

        guesthouseArrayList = new ArrayList<>();
    /*room 1*/
        Guesthouse p24 = new Guesthouse("Lecuk Inn Ubud ", "1 Room", "Jalan Kajeng No 15", R.drawable.gh15, "100000", 100000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p16 = new Guesthouse("Frangipani Bungalow Ubud ", "1 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "100000", 100000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p32 = new Guesthouse("The Warji Bisma ", "1 Room", "Jalan Bisma Ubud", R.drawable.gh16, "100000", 100000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p33 = new Guesthouse("The Warji Bisma ", "1 Room", "Jalan Bisma Ubud", R.drawable.gh16, "200000", 200000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p34 = new Guesthouse("The Warji Bisma ", "1 Room", "Jalan Bisma Ubud", R.drawable.gh16, "300000", 300000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p35 = new Guesthouse("The Warji Bisma ", "1 Room", "Jalan Bisma Ubud", R.drawable.gh16, "400000", 400000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p36 = new Guesthouse("The Warji Bisma ", "1 Room", "Jalan Bisma Ubud", R.drawable.gh16, "500000", 500000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p37 = new Guesthouse("The Warji Bisma ", "1 Room", "Jalan Bisma Ubud", R.drawable.gh16, "600000", 600000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p38 = new Guesthouse("The Warji Bisma ", "1 Room", "Jalan Bisma Ubud", R.drawable.gh16, "700000", 700000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p39 = new Guesthouse("The Warji Bisma ", "1 Room", "Jalan Bisma Ubud", R.drawable.gh16, "800000", 800000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p40 = new Guesthouse("The Warji Bisma ", "1 Room", "Jalan Bisma Ubud", R.drawable.gh16, "1000000", 1000000, "Ubud", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p100 = new Guesthouse("Lullaby Bungalows ", "1 Room", "Jl. Labuansait No.39X, Pecatu", R.drawable.gh18, "100000", 100000, "Uluwatu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p101 = new Guesthouse("Lullaby Bungalows ", "1 Room", "Jl. Labuansait No.39X, Pecatu", R.drawable.gh18, "200000", 200000, "Uluwatu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p102 = new Guesthouse("Lullaby Bungalows ", "1 Room", "Jl. Labuansait No.39X, Pecatu", R.drawable.gh18, "300000", 300000, "Uluwatu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p103 = new Guesthouse("Lullaby Bungalows ", "1 Room", "Jl. Labuansait No.39X, Pecatu", R.drawable.gh18, "400000", 400000, "Uluwatu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p104 = new Guesthouse("Lullaby Bungalows ", "1 Room", "Jl. Labuansait No.39X, Pecatu", R.drawable.gh18, "500000", 500000, "Uluwatu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p105 = new Guesthouse("Lullaby Bungalows ", "1 Room", "Jl. Labuansait No.39X, Pecatu", R.drawable.gh18, "600000", 600000, "Uluwatu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p106 = new Guesthouse("Lullaby Bungalows ", "1 Room", "Jl. Labuansait No.39X, Pecatu", R.drawable.gh18, "700000", 700000, "Uluwatu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p107 = new Guesthouse("Lullaby Bungalows ", "1 Room", "Jl. Labuansait No.39X, Pecatu", R.drawable.gh18, "800000", 800000, "Uluwatu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p108 = new Guesthouse("Lullaby Bungalows ", "1 Room", "Jl. Labuansait No.39X, Pecatu", R.drawable.gh18, "1000000", 1000000, "Uluwatu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p219 = new Guesthouse("The Kayuri Guest House", "1 Room", "Jl. Munduk Catu, Canggu", R.drawable.gh25, "100000", 100000, "Canggu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p220 = new Guesthouse("The Kayuri Guest House", "1 Room", "Jl. Munduk Catu, Canggu", R.drawable.gh25, "200000", 100000, "Canggu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p221 = new Guesthouse("The Kayuri Guest House", "1 Room", "Jl. Munduk Catu, Canggu", R.drawable.gh25, "300000", 200000, "Canggu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p222 = new Guesthouse("The Kayuri Guest House", "1 Room", "Jl. Munduk Catu, Canggu", R.drawable.gh25, "400000", 300000, "Canggu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p223 = new Guesthouse("The Kayuri Guest House", "1 Room", "Jl. Munduk Catu, Canggu", R.drawable.gh25, "500000", 400000, "Canggu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p224 = new Guesthouse("The Kayuri Guest House", "1 Room", "Jl. Munduk Catu, Canggu", R.drawable.gh25, "600000", 500000, "Canggu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p225 = new Guesthouse("The Kayuri Guest House", "1 Room", "Jl. Munduk Catu, Canggu", R.drawable.gh25, "700000", 600000, "Canggu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p226 = new Guesthouse("The Kayuri Guest House", "1 Room", "Jl. Munduk Catu, Canggu", R.drawable.gh25, "800000", 700000, "Canggu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p227 = new Guesthouse("The Kayuri Guest House", "1 Room", "Jl. Munduk Catu, Canggu", R.drawable.gh25, "1000000", 1000000, "Canggu", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p272 = new Guesthouse("Villa Blubambu", "1 Room", "Jl. Camplung Tanduk No.66, Seminyak, Kuta", R.drawable.gh31, "100000", 100000, "Kuta", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p273 = new Guesthouse("Villa Blubambu", "1 Room", "Jl. Camplung Tanduk No.66, Seminyak, Kuta", R.drawable.gh31, "200000", 200000, "Kuta", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p274 = new Guesthouse("Villa Blubambu", "1 Room", "Jl. Camplung Tanduk No.66, Seminyak, Kuta", R.drawable.gh31, "300000", 300000, "Kuta", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p275 = new Guesthouse("Villa Blubambu", "1 Room", "Jl. Camplung Tanduk No.66, Seminyak, Kuta", R.drawable.gh31, "400000", 400000, "Kuta", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p276 = new Guesthouse("Villa Blubambu", "1 Room", "Jl. Camplung Tanduk No.66, Seminyak, Kuta", R.drawable.gh31, "500000", 500000, "Kuta", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p277 = new Guesthouse("Villa Blubambu", "1 Room", "Jl. Camplung Tanduk No.66, Seminyak, Kuta", R.drawable.gh31, "600000", 600000, "Kuta", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p278 = new Guesthouse("Villa Blubambu", "1 Room", "Jl. Camplung Tanduk No.66, Seminyak, Kuta", R.drawable.gh31, "700000", 700000, "Kuta", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p279 = new Guesthouse("Villa Blubambu", "1 Room", "Jl. Camplung Tanduk No.66, Seminyak, Kuta", R.drawable.gh31, "800000", 800000, "Kuta", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p280 = new Guesthouse("Villa Blubambu", "1 Room", "Jl. Camplung Tanduk No.66, Seminyak, Kuta", R.drawable.gh31, "1000000", 1000000, "Kuta", 1, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");

    /*room 2*/
        Guesthouse p9 = new Guesthouse("Sandat Bali Ubud Guesthouse", "2 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "500000", 500000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p17 = new Guesthouse("Frangipani Bungalow Ubud ", "2 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "200000", 200000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p12 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "700000", 700000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p109 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "100000", 100000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p110 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "200000", 200000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p111 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "300000", 300000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p112 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "400000", 400000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p113 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "500000", 500000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p114 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "600000", 600000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p115 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "800000", 800000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p116 = new Guesthouse("Cito Guesthouse", "2 Room", "Nyuh Kuning Street, Kuta, Bali", R.drawable.gh11, "1000000", 1000000, "Kuta", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p25 = new Guesthouse("Lecuk Inn Ubud ", "2 Room", "Jalan Kajeng No 15", R.drawable.gh15, "200000", 200000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p26 = new Guesthouse("Lecuk Inn Ubud ", "2 Room", "Jalan Kajeng No 15", R.drawable.gh15, "300000", 300000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p27 = new Guesthouse("Lecuk Inn Ubud ", "2 Room", "Jalan Kajeng No 15", R.drawable.gh15, "400000", 400000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p28 = new Guesthouse("Lecuk Inn Ubud ", "2 Room", "Jalan Kajeng No 15", R.drawable.gh15, "500000", 500000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p29 = new Guesthouse("Lecuk Inn Ubud ", "2 Room", "Jalan Kajeng No 15", R.drawable.gh15, "600000", 600000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p30 = new Guesthouse("Lecuk Inn Ubud ", "2 Room", "Jalan Kajeng No 15", R.drawable.gh15, "700000", 700000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p31 = new Guesthouse("Lecuk Inn Ubud ", "2 Room", "Jalan Kajeng No 15", R.drawable.gh15, "800000", 800000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p41 = new Guesthouse("The Warji Bisma ", "2 Room", "Jalan Bisma Ubud", R.drawable.gh16, "100000", 100000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p42 = new Guesthouse("The Warji Bisma ", "2 Room", "Jalan Bisma Ubud", R.drawable.gh16, "200000", 200000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p43 = new Guesthouse("The Warji Bisma ", "2 Room", "Jalan Bisma Ubud", R.drawable.gh16, "300000", 300000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p44 = new Guesthouse("The Warji Bisma ", "2 Room", "Jalan Bisma Ubud", R.drawable.gh16, "400000", 400000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p45 = new Guesthouse("The Warji Bisma ", "2 Room", "Jalan Bisma Ubud", R.drawable.gh16, "500000", 500000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p46 = new Guesthouse("The Warji Bisma ", "2 Room", "Jalan Bisma Ubud", R.drawable.gh16, "600000", 600000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p47 = new Guesthouse("The Warji Bisma ", "2 Room", "Jalan Bisma Ubud", R.drawable.gh16, "700000", 700000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p48 = new Guesthouse("The Warji Bisma ", "2 Room", "Jalan Bisma Ubud", R.drawable.gh16, "800000", 800000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p49 = new Guesthouse("The Warji Bisma ", "2 Room", "Jalan Bisma Ubud", R.drawable.gh16, "1000000", 1000000, "Ubud", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p165 = new Guesthouse("Three Monkeys Villas ", "2 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh19, "100000", 100000, "Uluwatu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p166 = new Guesthouse("Three Monkeys Villas ", "2 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh19, "200000", 200000, "Uluwatu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p167 = new Guesthouse("Three Monkeys Villas ", "2 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh19, "300000", 300000, "Uluwatu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p168 = new Guesthouse("Three Monkeys Villas ", "2 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh19, "400000", 400000, "Uluwatu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p169 = new Guesthouse("Three Monkeys Villas ", "2 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh19, "500000", 500000, "Uluwatu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p170 = new Guesthouse("Three Monkeys Villas ", "2 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh19, "600000", 600000, "Uluwatu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p171 = new Guesthouse("Three Monkeys Villas ", "2 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh19, "700000", 700000, "Uluwatu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p172 = new Guesthouse("Three Monkeys Villas ", "2 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh19, "800000", 800000, "Uluwatu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p173 = new Guesthouse("Three Monkeys Villas ", "2 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh19, "1000000", 1000000, "Uluwatu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p228 = new Guesthouse("Caroline Guest House", "2 Room", "Jl. Pantai Batu Mejan No.69", R.drawable.gh26, "100000", 100000, "Canggu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p229 = new Guesthouse("Caroline Guest House", "2 Room", "Jl. Pantai Batu Mejan No.69", R.drawable.gh26, "200000", 200000, "Canggu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p230 = new Guesthouse("Caroline Guest House", "2 Room", "Jl. Pantai Batu Mejan No.69", R.drawable.gh26, "300000", 300000, "Canggu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p231 = new Guesthouse("Caroline Guest House", "2 Room", "Jl. Pantai Batu Mejan No.69", R.drawable.gh26, "400000", 400000, "Canggu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p232 = new Guesthouse("Caroline Guest House", "2 Room", "Jl. Pantai Batu Mejan No.69", R.drawable.gh26, "500000", 500000, "Canggu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p233 = new Guesthouse("Caroline Guest House", "2 Room", "Jl. Pantai Batu Mejan No.69", R.drawable.gh26, "600000", 600000, "Canggu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p234 = new Guesthouse("Caroline Guest House", "2 Room", "Jl. Pantai Batu Mejan No.69", R.drawable.gh26, "700000", 700000, "Canggu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p235 = new Guesthouse("Caroline Guest House", "2 Room", "Jl. Pantai Batu Mejan No.69", R.drawable.gh26, "800000", 800000, "Canggu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p236 = new Guesthouse("Caroline Guest House", "2 Room", "Jl. Pantai Batu Mejan No.69", R.drawable.gh26, "1000000", 1000000, "Canggu", 2, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");

    /*room 3*/
        Guesthouse p1 = new Guesthouse("Soca Garden Guesthouse", "3 Room", "Sanggingan Street, Ubud, Bali", R.drawable.gh1, "500000", 500000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p2 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "500000", 500000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p117 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "100000", 500000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p118 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "200000", 200000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p119 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "300000", 300000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p120 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "400000", 400000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p121 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "600000", 500000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p122 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "700000", 600000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p123 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "800000", 700000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p124 = new Guesthouse("Umalas Guesthouse", "3 Room", "Bima Street, Canggu, Bali", R.drawable.gh1, "1000000", 1000000, "Canggu",3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Ubud Palace", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p5 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "1000000", 1000000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p125 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "100000", 100000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p126 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "200000", 200000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p127 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "300000", 300000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p128 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "400000", 400000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p129 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "500000", 500000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p130 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "600000", 600000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p131 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "700000", 700000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p132 = new Guesthouse("Manggis Sari Guesthouse", "3 room", "Suweta Street, Uluwatu, Bali", R.drawable.gh4, "800000", 800000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p8 = new Guesthouse("Kudos Guesthouse Ubud", "3 Room", "Arjuna Street, Ubud, Bali", R.drawable.gh7, "400000", 400000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p10 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "250000", 250000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p133 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "150000", 150000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p134 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "350000", 350000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p135 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "450000", 450000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p136 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "550000", 550000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p137 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "650000", 650000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p138 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "750000", 750000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p139 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "850000", 850000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p140 = new Guesthouse("Putu's Paradise Guesthouse", "3 Room", "Gotama Street, Uluwatu, Bali", R.drawable.gh9, "950000", 950000, "Uluwatu", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p18 = new Guesthouse("Frangipani Bungalow Ubud ", "3 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "300000", 300000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p14 = new Guesthouse("Ujung Ubud Guest House", "3 Room", "Sriwedari Street, Ubud, Bali", R.drawable.gh13, "300000", 300000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p50 = new Guesthouse("Danasari Homestay", "3 Room", "Jl. Hanoman No 43", R.drawable.gh17, "100000", 100000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p51 = new Guesthouse("Danasari Homestay", "3 Room", "Jl. Hanoman No 43", R.drawable.gh17, "200000", 200000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p52 = new Guesthouse("Danasari Homestay", "3 Room", "Jl. Hanoman No 43", R.drawable.gh17, "300000", 300000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p53 = new Guesthouse("Danasari Homestay", "3 Room", "Jl. Hanoman No 43", R.drawable.gh17, "400000", 400000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p54 = new Guesthouse("Danasari Homestay", "3 Room", "Jl. Hanoman No 43", R.drawable.gh17, "500000", 500000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p55 = new Guesthouse("Danasari Homestay", "3 Room", "Jl. Hanoman No 43", R.drawable.gh17, "600000", 600000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p56 = new Guesthouse("Danasari Homestay", "3 Room", "Jl. Hanoman No 43", R.drawable.gh17, "700000", 700000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p57 = new Guesthouse("Danasari Homestay", "3 Room", "Jl. Hanoman No 43", R.drawable.gh17, "800000", 800000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p58 = new Guesthouse("Danasari Homestay", "3 Room", "Jl. Hanoman No 43", R.drawable.gh17, "1000000", 1000000, "Ubud", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p281 = new Guesthouse("Kayun Hostel Downtown", "3 Room", "Jl. Raya Legian No.182, Kuta", R.drawable.gh32, "100000", 100000, "Kuta", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p282 = new Guesthouse("Kayun Hostel Downtown", "3 Room", "Jl. Raya Legian No.182, Kuta", R.drawable.gh32, "200000", 200000, "Kuta", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p283 = new Guesthouse("Kayun Hostel Downtown", "3 Room", "Jl. Raya Legian No.182, Kuta", R.drawable.gh32, "300000", 300000, "Kuta", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p284 = new Guesthouse("Kayun Hostel Downtown", "3 Room", "Jl. Raya Legian No.182, Kuta", R.drawable.gh32, "400000", 400000, "Kuta", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p285 = new Guesthouse("Kayun Hostel Downtown", "3 Room", "Jl. Raya Legian No.182, Kuta", R.drawable.gh32, "500000", 500000, "Kuta", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p286 = new Guesthouse("Kayun Hostel Downtown", "3 Room", "Jl. Raya Legian No.182, Kuta", R.drawable.gh32, "600000", 600000, "Kuta", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p287 = new Guesthouse("Kayun Hostel Downtown", "3 Room", "Jl. Raya Legian No.182, Kuta", R.drawable.gh32, "700000", 700000, "Kuta", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p288 = new Guesthouse("Kayun Hostel Downtown", "3 Room", "Jl. Raya Legian No.182, Kuta", R.drawable.gh32, "800000", 800000, "Kuta", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p289 = new Guesthouse("Kayun Hostel Downtown", "3 Room", "Jl. Raya Legian No.182, Kuta", R.drawable.gh32, "1000000", 1000000, "Kuta", 3, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
    /*room 4*/
        Guesthouse p3 = new Guesthouse("Kamala Ubud Guesthouse", "4 Room", "Monkey Forest Street, Ubud, Bali", R.drawable.gh2, "600000", 600000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p6 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "200000", 200000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p141 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "100000", 100000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p142 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "300000", 300000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p143 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "400000", 400000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p144 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "500000", 500000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p145 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "600000", 600000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p146 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "700000", 700000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p147 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "800000", 800000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p148 = new Guesthouse("Nyoman Sandi Guesthouse", "4 Room", "Hanoman Street, Canggu, Bali", R.drawable.gh5, "1000000", 1000000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p7 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "300000", 300000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p149 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "100000", 100000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p150 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "200000", 200000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p151 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "400000", 400000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p152 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "500000", 500000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p153 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "600000", 600000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p154 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "700000", 700000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p155 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "800000", 800000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p156 = new Guesthouse("Loka Sari Guest House", "4 Room", "Kuwera Street, Kuta, Bali", R.drawable.gh6, "1000000", 1000000, "Kuta", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p19 = new Guesthouse("Frangipani Bungalow Ubud ", "4 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "400000", 400000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p11 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "300000", 300000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p157 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "100000", 100000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p158 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "200000", 200000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p159 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "400000", 400000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p160 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "500000", 500000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p161 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "600000", 600000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p162 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "700000", 700000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p163 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "800000", 800000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p164 = new Guesthouse("Teba Homestay", "4 Room", "Berawa Street, Canggu, Bali", R.drawable.gh10, "1000000", 1000000, "Canggu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p59 = new Guesthouse("Sandat Bali Ubud Guesthouse", "4 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "100000", 100000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p60 = new Guesthouse("Sandat Bali Ubud Guesthouse", "4 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "200000", 200000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p61 = new Guesthouse("Sandat Bali Ubud Guesthouse", "4 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "300000", 300000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p62 = new Guesthouse("Sandat Bali Ubud Guesthouse", "4 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "400000", 400000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p63 = new Guesthouse("Sandat Bali Ubud Guesthouse", "4 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "500000", 500000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p64 = new Guesthouse("Sandat Bali Ubud Guesthouse", "4 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "600000", 600000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p65 = new Guesthouse("Sandat Bali Ubud Guesthouse", "4 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "700000", 700000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p66 = new Guesthouse("Sandat Bali Ubud Guesthouse", "4 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "800000", 800000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p67 = new Guesthouse("Sandat Bali Ubud Guesthouse", "4 Room", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "1000000", 1000000, "Ubud", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p174 = new Guesthouse("Puri Kelapa Guest House by BukitVista", "4 Room", "Pecatu", R.drawable.gh20, "100000", 100000, "Uluwatu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p175 = new Guesthouse("Puri Kelapa Guest House by BukitVista", "4 Room", "Pecatu", R.drawable.gh20, "200000", 200000, "Uluwatu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p176 = new Guesthouse("Puri Kelapa Guest House by BukitVista", "4 Room", "Pecatu", R.drawable.gh20, "300000", 300000, "Uluwatu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p177 = new Guesthouse("Puri Kelapa Guest House by BukitVista", "4 Room", "Pecatu", R.drawable.gh20, "400000", 400000, "Uluwatu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p178 = new Guesthouse("Puri Kelapa Guest House by BukitVista", "4 Room", "Pecatu", R.drawable.gh20, "500000", 500000, "Uluwatu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p179 = new Guesthouse("Puri Kelapa Guest House by BukitVista", "4 Room", "Pecatu", R.drawable.gh20, "600000", 600000, "Uluwatu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p180 = new Guesthouse("Puri Kelapa Guest House by BukitVista", "4 Room", "Pecatu", R.drawable.gh20, "700000", 700000, "Uluwatu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p181 = new Guesthouse("Puri Kelapa Guest House by BukitVista", "4 Room", "Pecatu", R.drawable.gh20, "800000", 8000000, "Uluwatu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p182 = new Guesthouse("Puri Kelapa Guest House by BukitVista", "4 Room", "Pecatu", R.drawable.gh20, "10000000", 10000000, "Uluwatu", 4, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
    /*room 5*/
        Guesthouse p20 = new Guesthouse("Frangipani Bungalow Ubud ", "5 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "500000", 500000, "Ubud", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p316 = new Guesthouse("Frangipani Bungalow Ubud ", "5 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "100000", 100000, "Ubud", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p317 = new Guesthouse("Frangipani Bungalow Ubud ", "5 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "200000", 200000, "Ubud", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p318 = new Guesthouse("Frangipani Bungalow Ubud ", "5 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "300000", 300000, "Ubud", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p319 = new Guesthouse("Frangipani Bungalow Ubud ", "5 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "400000", 400000, "Ubud", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p320 = new Guesthouse("Frangipani Bungalow Ubud ", "5 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "600000", 600000, "Ubud", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p321 = new Guesthouse("Frangipani Bungalow Ubud ", "5 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "700000", 700000, "Ubud", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p322 = new Guesthouse("Frangipani Bungalow Ubud ", "5 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "800000", 800000, "Ubud", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p323 = new Guesthouse("Frangipani Bungalow Ubud ", "5 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "1000000", 1000000, "Ubud", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p4 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "1000000", 1000000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p68 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "100000", 100000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p69 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "200000", 200000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p70 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "300000", 300000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p71 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "400000", 400000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p72 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "500000", 500000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p73 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "600000", 600000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p74 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "700000", 700000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p75 = new Guesthouse("The Village Guest House", "5 Room", "Kajeng Street, Kuta, Bali", R.drawable.gh3, "800000", 800000, "Kuta", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p183 = new Guesthouse("Satria Bungalow", "5 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh21, "100000", 1000000, "Uluwatu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p184 = new Guesthouse("Satria Bungalow", "5 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh21, "200000", 2000000, "Uluwatu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p185 = new Guesthouse("Satria Bungalow", "5 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh21, "300000", 3000000, "Uluwatu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p186 = new Guesthouse("Satria Bungalow", "5 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh21, "400000", 4000000, "Uluwatu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p187 = new Guesthouse("Satria Bungalow", "5 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh21, "500000", 5000000, "Uluwatu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p188 = new Guesthouse("Satria Bungalow", "5 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh21, "600000", 6000000, "Uluwatu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p189 = new Guesthouse("Satria Bungalow", "5 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh21, "700000", 7000000, "Uluwatu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p190 = new Guesthouse("Satria Bungalow", "5 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh21, "800000", 8000000, "Uluwatu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p191 = new Guesthouse("Satria Bungalow", "5 Room", "Jl. Pantai Jimbaran, Pecatu", R.drawable.gh21, "1000000", 1000000, "Uluwatu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p237 = new Guesthouse("Oka's Guest House Canggu", "5 Room", "Paping Short Cut, Jl. Nelayan, Canggu", R.drawable.gh27, "100000", 100000, "Canggu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p238 = new Guesthouse("Oka's Guest House Canggu", "5 Room", "Paping Short Cut, Jl. Nelayan, Canggu", R.drawable.gh27, "200000", 200000, "Canggu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p239 = new Guesthouse("Oka's Guest House Canggu", "5 Room", "Paping Short Cut, Jl. Nelayan, Canggu", R.drawable.gh27, "300000", 300000, "Canggu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p240 = new Guesthouse("Oka's Guest House Canggu", "5 Room", "Paping Short Cut, Jl. Nelayan, Canggu", R.drawable.gh27, "400000", 400000, "Canggu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p241 = new Guesthouse("Oka's Guest House Canggu", "5 Room", "Paping Short Cut, Jl. Nelayan, Canggu", R.drawable.gh27, "500000", 500000, "Canggu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p242 = new Guesthouse("Oka's Guest House Canggu", "5 Room", "Paping Short Cut, Jl. Nelayan, Canggu", R.drawable.gh27, "600000", 600000, "Canggu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p243 = new Guesthouse("Oka's Guest House Canggu", "5 Room", "Paping Short Cut, Jl. Nelayan, Canggu", R.drawable.gh27, "700000", 700000, "Canggu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p244 = new Guesthouse("Oka's Guest House Canggu", "5 Room", "Paping Short Cut, Jl. Nelayan, Canggu", R.drawable.gh27, "800000", 800000, "Canggu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p245 = new Guesthouse("Oka's Guest House Canggu", "5 Room", "Paping Short Cut, Jl. Nelayan, Canggu", R.drawable.gh27, "1000000", 1000000, "Canggu", 5, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
    /*room 6*/
        Guesthouse p21 = new Guesthouse("Frangipani Bungalow Ubud ", "6 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "100000", 100000, "Ubud", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p76 = new Guesthouse("Frangipani Bungalow Ubud ", "6 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "200000", 200000, "Ubud", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p77 = new Guesthouse("Frangipani Bungalow Ubud ", "6 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "300000", 300000, "Ubud", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p78 = new Guesthouse("Frangipani Bungalow Ubud ", "6 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "400000", 400000, "Ubud", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p79 = new Guesthouse("Frangipani Bungalow Ubud ", "6 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "500000", 500000, "Ubud", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p80 = new Guesthouse("Frangipani Bungalow Ubud ", "6 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "600000", 600000, "Ubud", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p81 = new Guesthouse("Frangipani Bungalow Ubud ", "6 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "700000", 700000, "Ubud", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p82 = new Guesthouse("Frangipani Bungalow Ubud ", "6 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "800000", 800000, "Ubud", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p83 = new Guesthouse("Frangipani Bungalow Ubud ", "6 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "1000000", 1000000, "Ubud", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p192 = new Guesthouse("Kampung Jimba", "6 Room", "Jl. Umpeng Sari, Pecatu", R.drawable.gh22, "100000", 100000, "Uluwatu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p193 = new Guesthouse("Kampung Jimba", "6 Room", "Jl. Umpeng Sari, Pecatu", R.drawable.gh22, "200000", 200000, "Uluwatu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p194 = new Guesthouse("Kampung Jimba", "6 Room", "Jl. Umpeng Sari, Pecatu", R.drawable.gh22, "300000", 300000, "Uluwatu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p195 = new Guesthouse("Kampung Jimba", "6 Room", "Jl. Umpeng Sari, Pecatu", R.drawable.gh22, "400000", 400000, "Uluwatu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p196 = new Guesthouse("Kampung Jimba", "6 Room", "Jl. Umpeng Sari, Pecatu", R.drawable.gh22, "500000", 500000, "Uluwatu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p197 = new Guesthouse("Kampung Jimba", "6 Room", "Jl. Umpeng Sari, Pecatu", R.drawable.gh22, "600000", 600000, "Uluwatu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p198 = new Guesthouse("Kampung Jimba", "6 Room", "Jl. Umpeng Sari, Pecatu", R.drawable.gh22, "700000", 700000, "Uluwatu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p199 = new Guesthouse("Kampung Jimba", "6 Room", "Jl. Umpeng Sari, Pecatu", R.drawable.gh22, "800000", 800000, "Uluwatu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p200 = new Guesthouse("Kampung Jimba", "6 Room", "Jl. Umpeng Sari, Pecatu", R.drawable.gh22, "1000000", 1000000, "Uluwatu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p246 = new Guesthouse("Serenity Eco Guesthouse and Yoga", "6 Room", "Jl. Nelayan, Canggu", R.drawable.gh28, "100000", 100000, "Canggu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p247 = new Guesthouse("Serenity Eco Guesthouse and Yoga", "6 Room", "Jl. Nelayan, Canggu", R.drawable.gh28, "200000", 200000, "Canggu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p248 = new Guesthouse("Serenity Eco Guesthouse and Yoga", "6 Room", "Jl. Nelayan, Canggu", R.drawable.gh28, "300000", 300000, "Canggu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p249 = new Guesthouse("Serenity Eco Guesthouse and Yoga", "6 Room", "Jl. Nelayan, Canggu", R.drawable.gh28, "400000", 400000, "Canggu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p250 = new Guesthouse("Serenity Eco Guesthouse and Yoga", "6 Room", "Jl. Nelayan, Canggu", R.drawable.gh28, "500000", 500000, "Canggu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p251 = new Guesthouse("Serenity Eco Guesthouse and Yoga", "6 Room", "Jl. Nelayan, Canggu", R.drawable.gh28, "600000", 600000, "Canggu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p252 = new Guesthouse("Serenity Eco Guesthouse and Yoga", "6 Room", "Jl. Nelayan, Canggu", R.drawable.gh28, "700000", 700000, "Canggu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p253 = new Guesthouse("Serenity Eco Guesthouse and Yoga", "6 Room", "Jl. Nelayan, Canggu", R.drawable.gh28, "800000", 800000, "Canggu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p254 = new Guesthouse("Serenity Eco Guesthouse and Yoga", "6 Room", "Jl. Nelayan, Canggu", R.drawable.gh28, "1000000", 1000000, "Canggu", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");

        Guesthouse p324 = new Guesthouse("Kuta EcoStay Guest House", "6 Room", "12 Gang Lotring, Jl. Pantai Kuta", R.drawable.gh33, "100000", 100000, "Kuta", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p290 = new Guesthouse("Kuta EcoStay Guest House", "6 Room", "12 Gang Lotring, Jl. Pantai Kuta", R.drawable.gh33, "200000", 200000, "Kuta", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p291 = new Guesthouse("Kuta EcoStay Guest House", "6 Room", "12 Gang Lotring, Jl. Pantai Kuta", R.drawable.gh33, "300000", 300000, "Kuta", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p292 = new Guesthouse("Kuta EcoStay Guest House", "6 Room", "12 Gang Lotring, Jl. Pantai Kuta", R.drawable.gh33, "400000", 400000, "Kuta", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p293 = new Guesthouse("Kuta EcoStay Guest House", "6 Room", "12 Gang Lotring, Jl. Pantai Kuta", R.drawable.gh33, "500000", 500000, "Kuta", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p294 = new Guesthouse("Kuta EcoStay Guest House", "6 Room", "12 Gang Lotring, Jl. Pantai Kuta", R.drawable.gh33, "600000", 600000, "Kuta", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p295 = new Guesthouse("Kuta EcoStay Guest House", "6 Room", "12 Gang Lotring, Jl. Pantai Kuta", R.drawable.gh33, "700000", 700000, "Kuta", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p296 = new Guesthouse("Kuta EcoStay Guest House", "6 Room", "12 Gang Lotring, Jl. Pantai Kuta", R.drawable.gh33, "800000", 800000, "Kuta", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p297 = new Guesthouse("Kuta EcoStay Guest House", "6 Room", "12 Gang Lotring, Jl. Pantai Kuta", R.drawable.gh33, "1000000", 1000000, "Kuta", 6, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");

    /*room 7*/
        Guesthouse p22 = new Guesthouse("Frangipani Bungalow Ubud ", "7 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "700000", 700000, "Ubud", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p84 = new Guesthouse("Frangipani Bungalow Ubud ", "7 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "100000", 100000, "Ubud", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p85 = new Guesthouse("Frangipani Bungalow Ubud ", "7 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "200000", 200000, "Ubud", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p86 = new Guesthouse("Frangipani Bungalow Ubud ", "7 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "300000", 300000, "Ubud", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p87 = new Guesthouse("Frangipani Bungalow Ubud ", "7 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "400000", 400000, "Ubud", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p88 = new Guesthouse("Frangipani Bungalow Ubud ", "7 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "500000", 500000, "Ubud", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p89 = new Guesthouse("Frangipani Bungalow Ubud ", "7 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "600000", 600000, "Ubud", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p90 = new Guesthouse("Frangipani Bungalow Ubud ", "7 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "800000", 800000, "Ubud", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p91 = new Guesthouse("Frangipani Bungalow Ubud ", "7 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "1000000", 1000000, "Ubud", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p201 = new Guesthouse("Oceanna - Bali", "7 Room", "Jl. Wong Bigo, Pecatu", R.drawable.gh23, "100000", 100000, "Uluwatu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p202 = new Guesthouse("Oceanna - Bali", "7 Room", "Jl. Wong Bigo, Pecatu", R.drawable.gh23, "200000", 200000, "Uluwatu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p203 = new Guesthouse("Oceanna - Bali", "7 Room", "Jl. Wong Bigo, Pecatu", R.drawable.gh23, "300000", 300000, "Uluwatu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p204 = new Guesthouse("Oceanna - Bali", "7 Room", "Jl. Wong Bigo, Pecatu", R.drawable.gh23, "400000", 400000, "Uluwatu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p205 = new Guesthouse("Oceanna - Bali", "7 Room", "Jl. Wong Bigo, Pecatu", R.drawable.gh23, "500000", 500000, "Uluwatu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p206 = new Guesthouse("Oceanna - Bali", "7 Room", "Jl. Wong Bigo, Pecatu", R.drawable.gh23, "600000", 600000, "Uluwatu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p207 = new Guesthouse("Oceanna - Bali", "7 Room", "Jl. Wong Bigo, Pecatu", R.drawable.gh23, "700000", 700000, "Uluwatu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p208 = new Guesthouse("Oceanna - Bali", "7 Room", "Jl. Wong Bigo, Pecatu", R.drawable.gh23, "800000", 800000, "Uluwatu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p209 = new Guesthouse("Oceanna - Bali", "7 Room", "Jl. Wong Bigo, Pecatu", R.drawable.gh23, "1000000", 1000000, "Uluwatu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p255 = new Guesthouse("The Nest Canggu - Surf Hostel and Homestay", "7 Room", "Jl. Nelayan No.8a, Canggu", R.drawable.gh29, "100000", 100000, "Canggu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p256 = new Guesthouse("The Nest Canggu - Surf Hostel and Homestay", "7 Room", "Jl. Nelayan No.8a, Canggu", R.drawable.gh29, "200000", 200000, "Canggu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p257 = new Guesthouse("The Nest Canggu - Surf Hostel and Homestay", "7 Room", "Jl. Nelayan No.8a, Canggu", R.drawable.gh29, "300000", 300000, "Canggu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p258 = new Guesthouse("The Nest Canggu - Surf Hostel and Homestay", "7 Room", "Jl. Nelayan No.8a, Canggu", R.drawable.gh29, "400000", 400000, "Canggu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p259 = new Guesthouse("The Nest Canggu - Surf Hostel and Homestay", "7 Room", "Jl. Nelayan No.8a, Canggu", R.drawable.gh29, "500000", 500000, "Canggu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p260 = new Guesthouse("The Nest Canggu - Surf Hostel and Homestay", "7 Room", "Jl. Nelayan No.8a, Canggu", R.drawable.gh29, "600000", 600000, "Canggu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p261 = new Guesthouse("The Nest Canggu - Surf Hostel and Homestay", "7 Room", "Jl. Nelayan No.8a, Canggu", R.drawable.gh29, "700000", 700000, "Canggu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p262 = new Guesthouse("The Nest Canggu - Surf Hostel and Homestay", "7 Room", "Jl. Nelayan No.8a, Canggu", R.drawable.gh29, "800000", 800000, "Canggu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p263 = new Guesthouse("The Nest Canggu - Surf Hostel and Homestay", "7 Room", "Jl. Nelayan No.8a, Canggu", R.drawable.gh29, "1000000", 1000000, "Canggu", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p298 = new Guesthouse("BUDHA'S GUEST HOUSE", "7 Room", "Gg. Pendawa No.4X, Kuta", R.drawable.gh34, "100000", 100000, "Kuta", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p299 = new Guesthouse("BUDHA'S GUEST HOUSE", "7 Room", "Gg. Pendawa No.4X, Kuta", R.drawable.gh34, "200000", 200000, "Kuta", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p300 = new Guesthouse("BUDHA'S GUEST HOUSE", "7 Room", "Gg. Pendawa No.4X, Kuta", R.drawable.gh34, "300000", 300000, "Kuta", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p301 = new Guesthouse("BUDHA'S GUEST HOUSE", "7 Room", "Gg. Pendawa No.4X, Kuta", R.drawable.gh34, "400000", 400000, "Kuta", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p302 = new Guesthouse("BUDHA'S GUEST HOUSE", "7 Room", "Gg. Pendawa No.4X, Kuta", R.drawable.gh34, "500000", 500000, "Kuta", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p303 = new Guesthouse("BUDHA'S GUEST HOUSE", "7 Room", "Gg. Pendawa No.4X, Kuta", R.drawable.gh34, "600000", 600000, "Kuta", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p304 = new Guesthouse("BUDHA'S GUEST HOUSE", "7 Room", "Gg. Pendawa No.4X, Kuta", R.drawable.gh34, "700000", 700000, "Kuta", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p305 = new Guesthouse("BUDHA'S GUEST HOUSE", "7 Room", "Gg. Pendawa No.4X, Kuta", R.drawable.gh34, "800000", 800000, "Kuta", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p306 = new Guesthouse("BUDHA'S GUEST HOUSE", "7 Room", "Gg. Pendawa No.4X, Kuta", R.drawable.gh34, "1000000", 1000000, "Kuta", 7, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
    /*room 8*/
        Guesthouse p13 = new Guesthouse("Sunari Guesthouse Ubud", "8 Room", "Sanggingan Street, Ubud, Bali", R.drawable.gh12, "400000", 400000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p15 = new Guesthouse("Nurada Cottage", "8 Room", "Jalan Raya Kedewatan, Ubud, Bali", R.drawable.gh13, "300000", 300000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p23 = new Guesthouse("Frangipani Bungalow Ubud ", "8 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "800000", 800000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p92 = new Guesthouse("Frangipani Bungalow Ubud ", "8 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "100000", 100000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p93 = new Guesthouse("Frangipani Bungalow Ubud ", "8 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "200000", 200000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p94 = new Guesthouse("Frangipani Bungalow Ubud ", "8 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "300000", 300000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p95 = new Guesthouse("Frangipani Bungalow Ubud ", "8 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "400000", 400000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p96 = new Guesthouse("Frangipani Bungalow Ubud ", "8 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "500000", 500000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p97 = new Guesthouse("Frangipani Bungalow Ubud ", "8 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "600000", 600000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p98 = new Guesthouse("Frangipani Bungalow Ubud ", "8 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "700000", 700000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p99 = new Guesthouse("Frangipani Bungalow Ubud ", "8 Room", "Jl. Bisma, Ubud, Bali", R.drawable.gh14, "1000000", 1000000, "Ubud", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "The Monkey Forest & Sanctuary Ubud", "Ubud Palace", "Campuhan Bridge Trekking", "Blanco Art Museum");
        Guesthouse p210 = new Guesthouse("The Gong Accommodations", "8 Room", "Uluwatu, Jl. Pantai Suluban, Pecatu", R.drawable.gh24, "100000", 100000, "Uluwatu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p211 = new Guesthouse("The Gong Accommodations", "8 Room", "Uluwatu, Jl. Pantai Suluban, Pecatu", R.drawable.gh24, "200000", 200000, "Uluwatu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p212 = new Guesthouse("The Gong Accommodations", "8 Room", "Uluwatu, Jl. Pantai Suluban, Pecatu", R.drawable.gh24, "300000", 300000, "Uluwatu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p213 = new Guesthouse("The Gong Accommodations", "8 Room", "Uluwatu, Jl. Pantai Suluban, Pecatu", R.drawable.gh24, "400000", 400000, "Uluwatu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p214 = new Guesthouse("The Gong Accommodations", "8 Room", "Uluwatu, Jl. Pantai Suluban, Pecatu", R.drawable.gh24, "500000", 500000, "Uluwatu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p215 = new Guesthouse("The Gong Accommodations", "8 Room", "Uluwatu, Jl. Pantai Suluban, Pecatu", R.drawable.gh24, "600000", 600000, "Uluwatu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p216 = new Guesthouse("The Gong Accommodations", "8 Room", "Uluwatu, Jl. Pantai Suluban, Pecatu", R.drawable.gh24, "700000", 700000, "Uluwatu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p217 = new Guesthouse("The Gong Accommodations", "8 Room", "Uluwatu, Jl. Pantai Suluban, Pecatu", R.drawable.gh24, "800000", 800000, "Uluwatu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");
        Guesthouse p218 = new Guesthouse("The Gong Accommodations", "8 Room", "Uluwatu, Jl. Pantai Suluban, Pecatu", R.drawable.gh24, "1000000", 1000000, "Uluwatu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Labuan Sait", "Pura Luhur Uluwatu", "ATV Bukit Sari", "New Kuta Golf");

        Guesthouse p325 = new Guesthouse("Sleepy Gecko Guest House", "8 Room", "Jl. Padanglinjong No.6, Canggu", R.drawable.gh30, "100000", 100000, "Canggu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p264 = new Guesthouse("Sleepy Gecko Guest House", "8 Room", "Jl. Padanglinjong No.6, Canggu", R.drawable.gh30, "200000", 200000, "Canggu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p265 = new Guesthouse("Sleepy Gecko Guest House", "8 Room", "Jl. Padanglinjong No.6, Canggu", R.drawable.gh30, "300000", 300000, "Canggu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p266 = new Guesthouse("Sleepy Gecko Guest House", "8 Room", "Jl. Padanglinjong No.6, Canggu", R.drawable.gh30, "400000", 400000, "Canggu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p267 = new Guesthouse("Sleepy Gecko Guest House", "8 Room", "Jl. Padanglinjong No.6, Canggu", R.drawable.gh30, "500000", 500000, "Canggu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p268 = new Guesthouse("Sleepy Gecko Guest House", "8 Room", "Jl. Padanglinjong No.6, Canggu", R.drawable.gh30, "600000", 600000, "Canggu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p269 = new Guesthouse("Sleepy Gecko Guest House", "8 Room", "Jl. Padanglinjong No.6, Canggu", R.drawable.gh30, "700000", 700000, "Canggu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p270 = new Guesthouse("Sleepy Gecko Guest House", "8 Room", "Jl. Padanglinjong No.6, Canggu", R.drawable.gh30, "800000", 800000, "Canggu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p271 = new Guesthouse("Sleepy Gecko Guest House", "8 Room", "Jl. Padanglinjong No.6, Canggu", R.drawable.gh30, "1000000", 1000000, "Canggu", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p307 = new Guesthouse("Stellar Capsules Seminyak", "8 Room", "Gg. Kahyangan No.4, Seminyak, Kuta", R.drawable.gh35, "100000", 100000, "Kuta", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p308 = new Guesthouse("Stellar Capsules Seminyak", "8 Room", "Gg. Kahyangan No.4, Seminyak, Kuta", R.drawable.gh35, "200000", 200000, "Kuta", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p309 = new Guesthouse("Stellar Capsules Seminyak", "8 Room", "Gg. Kahyangan No.4, Seminyak, Kuta", R.drawable.gh35, "300000", 300000, "Kuta", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p310 = new Guesthouse("Stellar Capsules Seminyak", "8 Room", "Gg. Kahyangan No.4, Seminyak, Kuta", R.drawable.gh35, "400000", 400000, "Kuta", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p311 = new Guesthouse("Stellar Capsules Seminyak", "8 Room", "Gg. Kahyangan No.4, Seminyak, Kuta", R.drawable.gh35, "500000", 500000, "Kuta", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p312 = new Guesthouse("Stellar Capsules Seminyak", "8 Room", "Gg. Kahyangan No.4, Seminyak, Kuta", R.drawable.gh35, "600000", 600000, "Kuta", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p313 = new Guesthouse("Stellar Capsules Seminyak", "8 Room", "Gg. Kahyangan No.4, Seminyak, Kuta", R.drawable.gh35, "700000", 700000, "Kuta", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p314 = new Guesthouse("Stellar Capsules Seminyak", "8 Room", "Gg. Kahyangan No.4, Seminyak, Kuta", R.drawable.gh35, "800000", 800000, "Kuta", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");
        Guesthouse p315 = new Guesthouse("Stellar Capsules Seminyak", "8 Room", "Gg. Kahyangan No.4, Seminyak, Kuta", R.drawable.gh35, "1000000", 1000000, "Kuta", 8, "Free Parking", "Free Wi-Fi", "Food & Drink", "Taxi Service Avaiable", "Pantai Batu Bolong", "Pura Tanah Lot", "Taman Budaya Garuda Wisnu Kencana (GWK-Bali)", "Kintamani");






        List<Guesthouse> guesthouse = Arrays.asList(
                p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25,
                p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50,
                p51, p52, p53, p54, p55 ,p56, p57, p58, p59, p60, p61, p62, p63, p64, p65, p66, p67, p68, p69, p70, p71, p72, p73, p74, p75,
                p76 ,p77 ,p78 ,p79 ,p80, p81 ,p82 ,p83 ,p84 ,p85, p86, p87, p88, p89, p90, p91, p92, p93, p94, p95, p96, p97, p98, p99, p100,
                p101, p102, p103, p104, p105, p106, p107, p108, p109, p110, p111, p112, p113, p114, p115, p116, p117, p118, p119, p120,
                p121, p122, p123, p124, p125, p126, p127, p128, p129, p130, p131, p132, p133, p134, p135, p136, p137, p138, p139, p140,
                p141, p142, p143, p144, p145, p146, p147, p148, p149, p150, p151, p152, p153, p154, p155, p156, p157, p158, p159, p160,
                p161, p162, p163, p164, p164, p165, p166, p167, p168, p169, p170, p171, p172, p173, p174, p175, p176, p177, p178, p179,
                p180, p181, p182, p183, p184, p185, p186, p187, p188, p189, p190, p191, p192, p193, p194, p195, p196, p197, p198, p199,
                p200, p201, p202, p203, p204, p205, p206, p207, p208, p209, p210, p211, p212, p213, p214, p215, p216, p217, p218, p219,
                p220, p221, p222, p223, p224, p225, p226, p227, p228, p229, p230, p231, p232, p233, p234, p235, p236, p237, p238, p239,
                p240, p241, p242, p243, p244, p245, p246, p247, p248, p249, p250, p251, p252, p253, p254, p255, p256, p257, p258, p259,
                p260, p261, p262, p263, p264, p265, p266, p267, p268, p269, p270, p271, p272, p273, p274, p275, p276, p277, p278, p279,
                p280, p281, p282, p283, p284, p285, p286, p287, p288, p289, p290, p291, p292, p293, p294, p295, p296, p297, p298, p299,
                p300, p301, p302, p303, p304, p305, p306, p307, p308, p309, p310, p311, p312, p313, p314, p315, p316, p317, p318, p319,
                p320, p321, p322, p323, p324, p325


        );

        if (jumlahKamar.equals("1 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 1 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("2 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 2 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("3 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 3 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("4 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 4 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("5 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 5 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else if (jumlahKamar.equals("6 Room")){
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() == 6 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        } else {
            if (rentangHarga.equals("IDR 100K - 200K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            } else {
                for (Guesthouse guesthouse1 : guesthouse) {
                    if (guesthouse1.getJumlahKamarInt() > 6 && guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                        guesthouseArrayList.add(guesthouse1);
                    }
                }
            }
        }

        /*if (rentangHarga.equals("IDR 100K - 200K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 100000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 100000 && guesthouse1.getHargaInt() < 200000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 200K - 300K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 200000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 200000 && guesthouse1.getHargaInt() < 300000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 300K - 400K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 300000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 300000 && guesthouse1.getHargaInt() < 400000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 400K - 500K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 400000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 400000 && guesthouse1.getHargaInt() < 500000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 500K - 600K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 500000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 500000 && guesthouse1.getHargaInt() < 600000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 600K - 700K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 600000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 600000 && guesthouse1.getHargaInt() < 700000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 700K - 800K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 700000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 700000 && guesthouse1.getHargaInt() < 800000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else if (rentangHarga.equals("IDR 800K - 900K / Night")){
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 800000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() == 900000 || guesthouse1.getJumlahKamar().equals(jumlahKamar) && guesthouse1.getKecamatan().equals(lokasi) && guesthouse1.getHargaInt() > 800000 && guesthouse1.getHargaInt() < 900000) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        } else {
            for (Guesthouse guesthouse1 : guesthouse) {
                if (guesthouse1.getHargaInt() > 900000 && guesthouse1.getKecamatan().equals(lokasi)) {
                    guesthouseArrayList.add(guesthouse1);
                }
            }
        }*/

        /*guesthouseArrayList.add(new Guesthouse("Soca Garden Guesthouse", "3 room 3 toilet", "Sanggingan Street, Ubud, Bali", R.drawable.gh1, "500000", 500000));
        guesthouseArrayList.add(new Guesthouse("Kamala Ubud Guesthouse", "4 room 2 toilet", "Monkey Forest Street, Ubud, Bali", R.drawable.gh2, "600000", 600000));
        guesthouseArrayList.add(new Guesthouse("The Village Guest House", "5 room 3 toilet", "Kajeng Street, Ubud, Bali", R.drawable.gh3, "1000000", 1000000));
        guesthouseArrayList.add(new Guesthouse("Manggis Sari Guesthouse", "3 room 2 toilet", "Suweta Street, Ubud, Bali", R.drawable.gh4, "900000", 900000));
        guesthouseArrayList.add(new Guesthouse("Nyoman Sandi Guesthouse", "4 room 3 toilet", "Hanoman Street, Ubud, Bali", R.drawable.gh5, "200000", 200000));
        guesthouseArrayList.add(new Guesthouse("Loka Sari Guest House", "4 room 2 toilet", "Kuwera Street, Ubud, Bali", R.drawable.gh6, "300000", 300000));
        guesthouseArrayList.add(new Guesthouse("Kudos Guesthouse Ubud", "3 room 3 toilet", "Arjuna Street, Ubud, Bali", R.drawable.gh7, "400000", 400000));
        guesthouseArrayList.add(new Guesthouse("Sandat Bali Ubud Guesthouse", "2 room 2 toilet", "Sambahan Street, Ubud, Bali", R.drawable.gh8, "500000", 500000));
        guesthouseArrayList.add(new Guesthouse("Putu's Paradise Guesthouse", "3 room 3 toilet", "Gotama Street, Ubud, Bali", R.drawable.gh9, "250000", 250000));
        guesthouseArrayList.add(new Guesthouse("Teba Homestay", "4 room 2 toilet", "Pengosekan, Ubud, Bali", R.drawable.gh10, "300000", 300000));
        guesthouseArrayList.add(new Guesthouse("Cito Guesthouse", "2 room 2 toilet", "Nyuh Kuning Street, Ubud, Bali", R.drawable.gh11, "700000", 700000));
        guesthouseArrayList.add(new Guesthouse("Sunari Guesthouse Ubud", "8 room 4 toilet", "Sanggingan Street, Ubud, Bali", R.drawable.gh12, "400000", 400000));
        guesthouseArrayList.add(new Guesthouse("Ujung Ubud Guest House", "3 room 3 toilet", "Sriwedari Street, Ubud, Bali", R.drawable.gh13, "300000", 300000));
        */
    }


}
