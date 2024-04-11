package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class activity_phim extends AppCompatActivity {
    Button btnphim,btntaikhoan,btntheloai;
    ImageView iMai,iKong,iKungfu,iDenmang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phim);
        btnphim = findViewById(R.id.btnGH);
        btntheloai = findViewById(R.id.btntheloai);
        btntaikhoan = findViewById(R.id.btntaikhoan);
        iMai = findViewById(R.id.iMai);
        iKong = findViewById(R.id.iKong);
        iKungfu = findViewById(R.id.iKungfu);
        iDenmang = findViewById(R.id.iDenmang);

        btntheloai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPTL = new Intent(activity_phim.this, activity_theloai.class);
                startActivity(intentPTL);

            }
        });
        btntaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPTK = new Intent(activity_phim.this, activity_taikhoan.class);
                startActivity(intentPTK);

            }
        });

        iMai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_phim.this, activity_P_TC_mai.class);
                startActivity(intent);

            }
        });

        iKong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_phim.this, activity_P_HD_kong.class);
                startActivity(intent);

            }
        });

        iKungfu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_phim.this, activity_P_HH_kungfu.class);
                startActivity(intent);

            }
        });

        iDenmang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_phim.this, activity_P_KD_denmang.class);
                startActivity(intent);

            }
        });

    }
}