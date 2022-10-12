package com.example.sewa_hotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    Button btnCheckIn, btnCheckOut, btnSearch;
    Spinner spinner;
    private String mSpinnerLabel = "";
    private static final String TAG = SecondActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        spinner = findViewById(R.id.spinner_room);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource (android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Find Hotel");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        btnSearch = findViewById(R.id.buttonSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_checkIn = btnCheckIn.getText().toString();
                String str_checkOut = btnCheckOut.getText().toString();
                String str_rooms = mSpinnerLabel;
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("checkIn", str_checkIn);
                intent.putExtra("checkOut", str_checkOut);
                intent.putExtra("rooms", str_rooms);
                startActivity(intent);
            }
        });

    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, "onNothingSelected: ");
    }


    public void showCheckInDatePickerDialog(View view) {
        DialogFragment newFragment = new DatePickerCheckIn();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void showCheckOutDatePickerDialog(View view) {
        DialogFragment newFragment = new DatePickerCheckOut();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void processDatePickerCheckInResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        btnCheckIn = findViewById(R.id.buttonCheckIn);
        btnCheckIn.setText(dateMessage);
    }

    public void processDatePickerCheckOutResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        String dateMessage2 = (month_string + "/" + day_string + "/" + year_string);
        btnCheckOut = findViewById(R.id.buttonCheckOut);
        btnCheckOut.setText(dateMessage2);
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}