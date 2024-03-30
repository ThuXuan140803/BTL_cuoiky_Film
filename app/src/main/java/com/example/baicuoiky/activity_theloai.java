package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.os.Bundle;

public class activity_theloai extends AppCompatActivity {
    ImageView iMovieMai,iMovieKungfu,iMovieGodzilla,iMovieDenmang;
    Button btnMovieMai,btnMovieKungfu,btnMovieGodzilla,btnMovieDenmang;
    Button btnphim,btntaikhoan,btntheloai;

    LinearLayout linearLayoutMai, linearLayoutKungfu, linearLayoutGodzilla,linearLayoutDenmang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theloai);
        iMovieMai = findViewById(R.id.iMovieMai);
        iMovieKungfu = findViewById(R.id.iMovieKungfu);
        iMovieGodzilla = findViewById(R.id.iMovieGodzilla);
        iMovieDenmang = findViewById(R.id.iMovieDenmang);
        btnMovieMai = findViewById(R.id.btnMovieMai);
        btnMovieKungfu = findViewById(R.id.btnMovieKungfu);
        btnMovieGodzilla = findViewById(R.id.btnMovieGodzilla);
        btnMovieDenmang = findViewById(R.id.btnMovieDenmang);
        linearLayoutMai = findViewById(R.id.linearLayoutMai);
        linearLayoutKungfu = findViewById(R.id.linearLayoutKungfu);
        linearLayoutGodzilla = findViewById(R.id.linearLayoutGodzilla);
        linearLayoutDenmang = findViewById(R.id.linearLayoutDenmang);
        btnphim = findViewById(R.id.btnphim);
        btntaikhoan = findViewById(R.id.btntaikhoan);

        iMovieMai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_phimmai.class);
                startActivity(intentDK);
            }
        });

        btnMovieMai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_phimmai.class);
                startActivity(intentDK);
            }
        });

        linearLayoutMai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_phimmai.class);
                startActivity(intentDK);
            }
        });

        iMovieKungfu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_kungfu.class);
                startActivity(intentDK);
            }
        });

        btnMovieKungfu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_kungfu.class);
                startActivity(intentDK);
            }
        });

        linearLayoutKungfu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_kungfu.class);
                startActivity(intentDK);
            }
        });

        iMovieGodzilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_kong.class);
                startActivity(intentDK);
            }
        });

        btnMovieGodzilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_kong.class);
                startActivity(intentDK);
            }
        });

        linearLayoutGodzilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_kong.class);
                startActivity(intentDK);
            }
        });

        iMovieDenmang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_denmang.class);
                startActivity(intentDK);
            }
        });

        btnMovieDenmang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_denmang.class);
                startActivity(intentDK);
            }
        });
        linearLayoutDenmang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_denmang.class);
                startActivity(intentDK);
            }
        });
        btnphim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_phim.class);
                startActivity(intentDK);
            }
        });

        btntaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(activity_theloai.this, activity_taikhoan.class);
                startActivity(intentDK);
            }
        });
    }

}