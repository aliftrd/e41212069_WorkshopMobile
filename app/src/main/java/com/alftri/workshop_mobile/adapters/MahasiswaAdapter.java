package com.alftri.workshop_mobile.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.alftri.workshop_mobile.R;
import com.alftri.workshop_mobile.models.MahasiswaModel;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
   private ArrayList<MahasiswaModel> datas;

   public MahasiswaAdapter(ArrayList<MahasiswaModel> datas) {
       this.datas = datas;
   }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_row_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtNim.setText(datas.get(position).getNim());
        holder.txtNama.setText(datas.get(position).getNama());
        holder.txtEmail.setText(datas.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return (datas != null) ? datas.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
       private TextView txtNim, txtNama, txtEmail;

       public MahasiswaViewHolder(View view) {
           super(view);

           txtNim = (TextView) view.findViewById(R.id.txt_nim_mahasiswa);
           txtNama = (TextView) view.findViewById(R.id.txt_nama_mahasiswa);
           txtEmail = (TextView) view.findViewById(R.id.txt_email_mahasiswa);
       }
    }
}
