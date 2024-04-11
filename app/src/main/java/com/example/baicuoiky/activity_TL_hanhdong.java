package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_TL_hanhdong extends AppCompatActivity {
    ImageView iKong,iFast,iNhiemvu,iLinh,iVe;

    TextView txtKong,txtFast,txtNhiemvu,txtLinh;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tl_hanhdong);

        iKong = findViewById(R.id.iKong);
        iNhiemvu = findViewById(R.id.iNhiemvu);
        iFast = findViewById(R.id.iFast);
        iLinh = findViewById(R.id.iLinh);
        iVe = findViewById(R.id.iVe);
        txtKong = findViewById(R.id.txtKong);
        txtFast = findViewById(R.id.txtFast);
        txtNhiemvu = findViewById(R.id.txtNhiemvu);
        txtLinh = findViewById(R.id.txtFast);

        iKong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hanhdong.this, activity_P_HD_kong.class);
                startActivity(i);
            }
        });

        txtKong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hanhdong.this, activity_P_HD_kong.class);
                startActivity(i);
            }
        });

        iFast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hanhdong.this, activity_P_HD_fast.class);
                startActivity(i);
            }
        });

        txtFast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hanhdong.this, activity_P_HD_fast.class);
                startActivity(i);
            }
        });

        iNhiemvu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hanhdong.this, activity_P_HD_nhiemvubatkhathi.class);
                startActivity(i);
            }
        });

        txtNhiemvu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hanhdong.this, activity_P_HD_nhiemvubatkhathi.class);
                startActivity(i);
            }
        });

        iLinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hanhdong.this, activity_P_HD_linhbantia.class);
                startActivity(i);
            }
        });

        txtLinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hanhdong.this, activity_P_HD_linhbantia.class);
                startActivity(i);
            }
        });

        iVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hanhdong.this, activity_theloai.class);
                startActivity(i);
            }
        });
    }
}