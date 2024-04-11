package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_P_HD_nhiemvubatkhathi extends AppCompatActivity {
    Button btnDatve;
    ImageView iMuiten;
    TextView txtNhiemvu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phd_nhiemvubatkhathi);
        btnDatve = findViewById(R.id.btnDatve);
        iMuiten = findViewById(R.id.iMuiten);
        txtNhiemvu = findViewById(R.id.txtNhiemvu);

        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_HD_nhiemvubatkhathi.this, activity_datve.class);
                intent.putExtra("tenPhim", txtNhiemvu.getText().toString());
                startActivity(intent);

            }
        });
        iMuiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_HD_nhiemvubatkhathi.this, activity_TL_hanhdong.class);
                startActivity(intent);

            }
        });
    }
}