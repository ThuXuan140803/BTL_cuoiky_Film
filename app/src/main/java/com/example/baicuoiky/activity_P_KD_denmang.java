package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_P_KD_denmang extends AppCompatActivity {
    Button btnDatve;
    ImageView iMuiten;
    TextView txtDenmang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pkd_denmang);
        btnDatve = findViewById(R.id.btnDatve);
        iMuiten = findViewById(R.id.iMuiten);
        txtDenmang = findViewById(R.id.txtDenmang);

        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_KD_denmang.this, activity_datve.class);
                intent.putExtra("tenPhim", txtDenmang.getText().toString());
                startActivity(intent);

            }
        });
        iMuiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_KD_denmang.this, activity_TL_kinhdi.class);
                startActivity(intent);

            }
        });
    }
}