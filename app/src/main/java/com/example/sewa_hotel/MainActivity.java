package com.example.sewa_hotel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Username, Password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.input_username);
        Password = findViewById(R.id.input_password);
        btnLogin = findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_user = Username.getText().toString();
                String str_pass = Password.getText().toString();
                if ((str_user.equals("mike@email.com")) && (str_pass.equals("abc123"))) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);
                    myAlertBuilder.setTitle("Login Gagal");
                    myAlertBuilder.setMessage("Username atau password salah, silahkan coba lagi");
                    myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getApplicationContext(), "Silahkan coba lagi", Toast.LENGTH_SHORT).show();
                        }
                    });
                    myAlertBuilder.show();
                }
            }
        });
    }
}