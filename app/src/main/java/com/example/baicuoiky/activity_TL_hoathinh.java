package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_TL_hoathinh extends AppCompatActivity {
    ImageView iKung,iConan,iKhachsan,iMinion,iVe;

    TextView txtKung,txtConan,txtKhachsan,txtMinion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tl_hoathinh);

        iKung = findViewById(R.id.iKung);
        iConan = findViewById(R.id.iConan);
        iKhachsan = findViewById(R.id.iKhachsan);
        iMinion = findViewById(R.id.iMinion);
        iVe = findViewById(R.id.iVe);
        txtKung = findViewById(R.id.txtKung);
        txtConan = findViewById(R.id.txtConan);
        txtKhachsan = findViewById(R.id.txtKhachsan);
        txtMinion = findViewById(R.id.txtMinion);

        iKung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hoathinh.this, activity_P_HH_kungfu.class);
                startActivity(i);
            }
        });

        txtKung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hoathinh.this, activity_P_HH_kungfu.class);
                startActivity(i);
            }
        });

        iConan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hoathinh.this, activity_P_HH_conan.class);
                startActivity(i);
            }
        });

        txtConan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hoathinh.this, activity_P_HH_conan.class);
                startActivity(i);
            }
        });

        iKhachsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hoathinh.this, activity_P_HH_khachsanhuyenbi.class);
                startActivity(i);
            }
        });

        txtKhachsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hoathinh.this, activity_P_HH_khachsanhuyenbi.class);
                startActivity(i);
            }
        });

        iMinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hoathinh.this, activity_P_HH_minion.class);
                startActivity(i);
            }
        });

        txtMinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hoathinh.this, activity_P_HH_minion.class);
                startActivity(i);
            }
        });

        iVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_hoathinh.this, activity_theloai.class);
                startActivity(i);
            }
        });
    }
}