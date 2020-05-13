package com.megantara.guesthouse;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RentangHargaAdapter extends RecyclerView.Adapter<RentangHargaAdapter.RentangHargaViewHolder>{
    private ArrayList<RentangHarga> dataList;
    private RentangHargaAdapter.RecyclerViewClickListener listener;

    public RentangHargaAdapter(ArrayList<RentangHarga> dataList, RentangHargaAdapter.RecyclerViewClickListener listener) {
        this.dataList = dataList;
        this.listener = listener;
    }

    @Override
    public RentangHargaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_rentang_harga, parent, false);
        return new RentangHargaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RentangHargaAdapter.RentangHargaViewHolder holder, int position) {
        holder.txtRentangHarga.setText(dataList.get(position).getRentangHarga());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


    public class RentangHargaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView txtRentangHarga;

        public RentangHargaViewHolder(View itemView) {
            super(itemView);
            txtRentangHarga = (TextView) itemView.findViewById(R.id.txt_rentang_harga);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAdapterPosition());
        }
    }

    public interface RecyclerViewClickListener {
        void onClick(View v, int position);
    }
}
