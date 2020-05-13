package com.megantara.guesthouse;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JumlahKamarAdapter extends RecyclerView.Adapter<JumlahKamarAdapter.JumlahKamarViewHolder> {
    private ArrayList<JumlahKamar> dataList;
    private RecyclerViewClickListener listener;

    public JumlahKamarAdapter(ArrayList<JumlahKamar> dataList, RecyclerViewClickListener listener) {
        this.dataList = dataList;
        this.listener = listener;
    }

    @Override
    public JumlahKamarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_jumlah_kamar, parent, false);
        return new JumlahKamarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(JumlahKamarViewHolder holder, int position) {
        holder.txtJumlahKamar.setText(dataList.get(position).getJumlahKamar());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


    public class JumlahKamarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView txtJumlahKamar;

        public JumlahKamarViewHolder(View itemView) {
            super(itemView);
            txtJumlahKamar = (TextView) itemView.findViewById(R.id.txt_jumlah_kamar);
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
