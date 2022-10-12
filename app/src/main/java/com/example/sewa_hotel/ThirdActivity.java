package com.example.sewa_hotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Hotel> list = new ArrayList<>();
    TextView checkIn, checkOut, rooms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        recyclerView = findViewById(R.id.rvData);
        recyclerView.setHasFixedSize(true);

        list.addAll(HotelData.getListData());
        showRecyclerList();

        checkIn = findViewById(R.id.checkInInfo);
        checkOut = findViewById(R.id.checkOutInfo);
        rooms = findViewById(R.id.roomsInfo);

        Intent intent = getIntent();
        String str_1 = intent.getStringExtra("checkIn");
        String str_2 = intent.getStringExtra("checkOut");
        String str_3 = intent.getStringExtra("rooms");

        checkIn.setText("Check-in date: " + str_1);
        checkOut.setText("Check-out date: " + str_2);
        rooms.setText("Number of rooms: " + str_3);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Choose Hotel");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterDataHotel adapterDataHotel = new AdapterDataHotel(this, list);
        recyclerView.setAdapter(adapterDataHotel);

        adapterDataHotel.setOnItemClickCallback(new AdapterDataHotel.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hotel hotel) {
               Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
               intent.putExtra(FourthActivity.ITEM_EXTRA, hotel);
               startActivity(intent);
            }
        });
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}