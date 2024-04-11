package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_P_TC_mai extends AppCompatActivity {
    Button btnDatve;
    ImageView iMuiten;
    TextView txtMai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptc_mai);
        btnDatve = findViewById(R.id.btnDatve);
        iMuiten = findViewById(R.id.iMuiten);
        txtMai = findViewById(R.id.txtMai);

        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_P_TC_mai.this, activity_datve.class);
                i.putExtra("tenPhim", txtMai.getText().toString());
                startActivity(i);
            }
        });

        iMuiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_P_TC_mai.this, activity_TL_tinhcam.class);
                startActivity(i);
            }
        });
    }
}