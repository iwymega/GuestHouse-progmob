package com.megantara.guesthouse;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LokasiAdapter extends RecyclerView.Adapter<LokasiAdapter.LokasiViewHolder>{
    private ArrayList<Lokasi> dataList;
    private LokasiAdapter.RecyclerViewClickListener listener;

    public LokasiAdapter(ArrayList<Lokasi> dataList, LokasiAdapter.RecyclerViewClickListener listener) {
        this.dataList = dataList;
        this.listener = listener;
    }

    @Override
    public LokasiAdapter.LokasiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_lokasi, parent, false);
        return new LokasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LokasiAdapter.LokasiViewHolder holder, int position) {
        holder.txtLokasi.setText(dataList.get(position).getLokasi());
        holder.imgLokasi.setImageResource(dataList.get(position).getImg_lokasi());
        holder.txtDeskripsiLokasi.setText(dataList.get(position).getDeskripsiLokasi());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


    public class LokasiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView txtLokasi, txtDeskripsiLokasi;
        private ImageView imgLokasi;

        public LokasiViewHolder(View itemView) {
            super(itemView);
            txtLokasi = (TextView) itemView.findViewById(R.id.txt_lokasi);
            imgLokasi = (ImageView) itemView.findViewById(R.id.img_lokasi);
            txtDeskripsiLokasi = (TextView) itemView.findViewById(R.id.txt_deskripsi_lokasi);

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
