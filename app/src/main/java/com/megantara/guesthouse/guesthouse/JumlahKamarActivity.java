package com.megantara.guesthouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JumlahKamarActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private JumlahKamarAdapter adapter;
    private ArrayList<JumlahKamar> jumlahKamarArrayList;
    private JumlahKamarAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumlah_kamar);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_jumlah_kamar);

        setOnClickListener();

        adapter = new JumlahKamarAdapter(jumlahKamarArrayList, listener);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(JumlahKamarActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new JumlahKamarAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), RentangHargaActivity.class);
                intent.putExtra("JumlahKamar", jumlahKamarArrayList.get(position).getJumlahKamar());
                startActivity(intent);
            }
        };
    }

    private void addData() {
        jumlahKamarArrayList = new ArrayList<>();
        jumlahKamarArrayList.add(new JumlahKamar("1 Room"));
        jumlahKamarArrayList.add(new JumlahKamar("2 Room"));
        jumlahKamarArrayList.add(new JumlahKamar("3 Room"));
        jumlahKamarArrayList.add(new JumlahKamar("4 Room"));
        jumlahKamarArrayList.add(new JumlahKamar("5 Room"));
        jumlahKamarArrayList.add(new JumlahKamar("6 Room"));
        jumlahKamarArrayList.add(new JumlahKamar(">6 Room"));
    }
}
