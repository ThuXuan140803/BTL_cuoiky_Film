package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class activity_hoadon extends AppCompatActivity {

    Button btnTrangchu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoadon);
        btnTrangchu = findViewById(R.id.btnTrangchu);
        btnTrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHD = new Intent(activity_hoadon.this, activity_theloai.class);
                startActivity(intentHD);

            }
        });
    }
}