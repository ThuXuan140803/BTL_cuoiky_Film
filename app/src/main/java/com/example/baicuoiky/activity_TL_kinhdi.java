package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class activity_TL_kinhdi extends AppCompatActivity {
    ImageView iDenmang,iTrochoi,iDiembao,iQuycai,iVe;

    TextView txtDenmang,txtTrochoi,txtDiembao,txtQuycai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tl_kinhdi);

        iDenmang = findViewById(R.id.iDenmang);
        iTrochoi = findViewById(R.id.iTrochoi);
        iDiembao = findViewById(R.id.iDiembao);
        iQuycai = findViewById(R.id.iQuycai);
        iVe = findViewById(R.id.iVe);
        txtDenmang = findViewById(R.id.txtDenmang);
        txtTrochoi = findViewById(R.id.txtTrochoi);
        txtDiembao = findViewById(R.id.txtDiembao);
        txtQuycai = findViewById(R.id.txtQuycai);

        iDenmang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_kinhdi.this, activity_P_KD_denmang.class);
                startActivity(i);
            }
        });

        txtDenmang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_kinhdi.this, activity_P_KD_denmang.class);
                startActivity(i);
            }
        });

        iTrochoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_kinhdi.this, activity_P_KD_trochoichetchoc.class);
                startActivity(i);
            }
        });

        txtTrochoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_kinhdi.this, activity_P_KD_trochoichetchoc.class);
                startActivity(i);
            }
        });

        iDiembao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_kinhdi.this, activity_P_KD_diembao.class);
                startActivity(i);
            }
        });

        txtDiembao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_kinhdi.this, activity_P_KD_diembao.class);
                startActivity(i);
            }
        });

        iQuycai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_kinhdi.this, activity_P_KD_quycai.class);
                startActivity(i);
            }
        });

        txtQuycai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_kinhdi.this, activity_P_KD_quycai.class);
                startActivity(i);
            }
        });

        iVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_kinhdi.this, activity_theloai.class);
                startActivity(i);
            }
        });
    }
}