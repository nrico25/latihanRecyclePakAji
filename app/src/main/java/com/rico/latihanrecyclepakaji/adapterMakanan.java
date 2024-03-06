package com.rico.latihanrecyclepakaji;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class adapterMakanan extends RecyclerView.Adapter<adapterMakanan.ViewHolder> {
    Context context;
    List<modelMakanan> listData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public adapterMakanan(List<modelMakanan> listData, Context context){
        this.listData = listData;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final modelMakanan itemsFood = this.listData.get(position);
        holder.nameFood.setText(itemsFood.getNameFood());
        holder.desFood.setText(itemsFood.getDesFood());
        Glide.with(holder.view).load(itemsFood.getImageUrl()).into(holder.imageUrl);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        View view;
        ImageView imageUrl;
        TextView  nameFood;
        TextView  desFood;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            view = itemView;
            imageUrl = itemView.findViewById(R.id.ivMakanan);
            nameFood = itemView.findViewById(R.id.tvnameFood);
            desFood = itemView.findViewById(R.id.tvDeskripsiFood);
            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            if(mClickListener != null)mClickListener.onItemClick(v, getAdapterPosition());


        }

    }
    modelMakanan getItem(int id){
        return listData.get(id);
    }
    void setClickListener(ItemClickListener itemClickListener){
        this.mClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
