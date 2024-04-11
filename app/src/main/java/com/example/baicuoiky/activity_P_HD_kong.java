package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_P_HD_kong extends AppCompatActivity {
    Button btnDatve;
    ImageView iMuiten;
    TextView txtKong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phd_kong);

        btnDatve = findViewById(R.id.btnDatve);
        iMuiten = findViewById(R.id.iMuiten);
        txtKong = findViewById(R.id.txtKong);

        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_HD_kong.this, activity_datve.class);
                intent.putExtra("tenPhim", txtKong.getText().toString());
                startActivity(intent);

            }
        });
        iMuiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_HD_kong.this, activity_TL_hanhdong.class);
                startActivity(intent);

            }
        });
    }
}