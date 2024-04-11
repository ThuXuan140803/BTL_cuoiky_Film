package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_P_HD_fast extends AppCompatActivity {
    Button btnDatve;
    ImageView iMuiten;
    TextView txtFast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phd_fast);

        btnDatve = findViewById(R.id.btnDatve);
        iMuiten = findViewById(R.id.iMuiten);
        txtFast = findViewById(R.id.txtFast);

        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_HD_fast.this, activity_datve.class);
                intent.putExtra("tenPhim", txtFast.getText().toString());
                startActivity(intent);
            }
        });

        iMuiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_HD_fast.this, activity_TL_hanhdong.class);
                startActivity(intent);
            }
        });
    }
}