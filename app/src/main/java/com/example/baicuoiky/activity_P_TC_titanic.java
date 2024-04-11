package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_P_TC_titanic extends AppCompatActivity {
    Button btnDatve;
    ImageView iMuiten;
    TextView txtTitanic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptc_titanic);

        btnDatve = findViewById(R.id.btnDatve);
        iMuiten = findViewById(R.id.iMuiten);
        txtTitanic = findViewById(R.id.txtTitanic);

        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_P_TC_titanic.this, activity_datve.class);
                i.putExtra("tenPhim", txtTitanic.getText().toString());
                startActivity(i);
            }
        });

        iMuiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_P_TC_titanic.this, activity_TL_tinhcam.class);
                startActivity(i);
            }
        });
    }
}