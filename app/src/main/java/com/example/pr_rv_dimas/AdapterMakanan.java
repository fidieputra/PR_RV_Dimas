package com.example.pr_rv_dimas;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.MakananViewHolder> {
    Context context;

    @NonNull
    @Override
    public MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.grid_view, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MakananViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder {
        public MakananViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
