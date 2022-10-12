package com.example.sewa_hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class FourthActivity extends AppCompatActivity {
    ImageView hotelImage;
    TextView nama, deskripsi, fasilitas, harga;
    public static final String ITEM_EXTRA = "item_extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        hotelImage = findViewById(R.id.gambarHotel4th);
        nama = findViewById(R.id.namaHotel4th);
        deskripsi = findViewById(R.id.deskripsi);
        fasilitas = findViewById(R.id.fasilitas);
        harga = findViewById(R.id.price);

        Hotel hotel = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (hotel != null){
            Glide.with(this)
                    .load(hotel.getPhoto())
                    .apply(new RequestOptions().override(100, 100))
                    .into(hotelImage);
            nama.setText(hotel.getNama());
            harga.setText(hotel.getHarga());
            deskripsi.setText(hotel.getDeskripsi());
            fasilitas.setText(hotel.getFasilitas());
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Hotel Details");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}