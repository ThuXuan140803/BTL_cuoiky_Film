package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_P_TC_hacanhnoianh extends AppCompatActivity {
    Button btnDatve;
    ImageView iMuiten;
    TextView txtHacanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptc_hacanhnoianh);

        btnDatve = findViewById(R.id.btnDatve);
        iMuiten = findViewById(R.id.iMuiten);
        txtHacanh = findViewById(R.id.txtHacanh);

        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_P_TC_hacanhnoianh.this, activity_datve.class);
                i.putExtra("tenPhim", txtHacanh.getText().toString());
                startActivity(i);
            }
        });

        iMuiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_P_TC_hacanhnoianh.this, activity_TL_tinhcam.class);
                startActivity(i);
            }
        });
    }
}