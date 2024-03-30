package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class activity_phimmai extends AppCompatActivity {
    Button btnDatve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phimmai);
        btnDatve = findViewById(R.id.btnDatve);
        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_phimmai.this, activity_datve.class);
                startActivity(intentDK);

            }
        });
    }
}