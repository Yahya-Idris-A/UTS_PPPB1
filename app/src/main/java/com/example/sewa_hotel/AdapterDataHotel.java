package com.example.sewa_hotel;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class AdapterDataHotel extends RecyclerView.Adapter<AdapterDataHotel.HolderData> {
    private ArrayList<Hotel> listHotel;
    LayoutInflater inflater;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public AdapterDataHotel(Context context, ArrayList<Hotel> list){
        this.listHotel = list;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.data_hotel, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        Hotel hotel = listHotel.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hotel.getPhoto())
                .apply(new RequestOptions().override(100, 100))
                .into(holder.hotelPhoto);
        holder.hotel.setText(hotel.getNama());
        holder.harga.setText(hotel.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listHotel.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHotel.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        ImageView hotelPhoto;
        TextView hotel, harga;
        public HolderData(@NonNull View itemView) {
            super(itemView);
            hotelPhoto = itemView.findViewById(R.id.gambarHotel);
            hotel = itemView.findViewById(R.id.namaHotel);
            harga = itemView.findViewById(R.id.hargaHotel);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Hotel data);
    }
}
