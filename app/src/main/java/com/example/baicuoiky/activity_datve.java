package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class activity_datve extends AppCompatActivity {
    Button btnthanhtoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datve);
        btnthanhtoan = findViewById(R.id.btnthanhtoan);
        btnthanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_datve.this, activity_thanhtoan.class);
                startActivity(intentDK);

            }
        });
    }
}