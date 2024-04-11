package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_P_KD_quycai extends AppCompatActivity {
    Button btnDatve;
    ImageView iMuiten;
    TextView txtQuycai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pkd_quycai);
        btnDatve = findViewById(R.id.btnDatve);
        iMuiten = findViewById(R.id.iMuiten);
        txtQuycai = findViewById(R.id.txtQuycai);

        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_KD_quycai.this, activity_datve.class);
                intent.putExtra("tenPhim", txtQuycai.getText().toString());
                startActivity(intent);

            }
        });
        iMuiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_KD_quycai.this, activity_TL_kinhdi.class);
                startActivity(intent);

            }
        });
    }
}