package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_TL_tinhcam extends AppCompatActivity {
    ImageView iMai,iTitanic,iHenho,iHacanh,iVe;

    TextView txtMai,txtTitanic,txtHenho,txtHacanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tl_tinhcam);
        iMai = findViewById(R.id.iMai);
        iTitanic = findViewById(R.id.iTitanic);
        iHenho = findViewById(R.id.iHenho);
        iHacanh = findViewById(R.id.iHacanh);
        iVe = findViewById(R.id.iVe);
        txtMai = findViewById(R.id.txtMai);
        txtTitanic = findViewById(R.id.txtTitanic);
        txtHenho = findViewById(R.id.txtHenho);
        txtHacanh = findViewById(R.id.txtHacanh);

        iMai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_tinhcam.this, activity_P_TC_mai.class);
                startActivity(i);
            }
        });

        txtMai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_tinhcam.this, activity_P_TC_mai.class);
                startActivity(i);
            }
        });

        iTitanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_tinhcam.this, activity_P_TC_titanic.class);
                startActivity(i);
            }
        });

        txtTitanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_tinhcam.this, activity_P_TC_titanic.class);
                startActivity(i);
            }
        });

        iHenho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_tinhcam.this, activity_P_TC_henho.class);
                startActivity(i);
            }
        });

        txtHenho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_tinhcam.this, activity_P_TC_henho.class);
                startActivity(i);
            }
        });

        iHacanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_tinhcam.this, activity_P_TC_hacanhnoianh.class);
                startActivity(i);
            }
        });

        txtHacanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_tinhcam.this, activity_P_TC_hacanhnoianh.class);
                startActivity(i);
            }
        });

        iVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_TL_tinhcam.this, activity_theloai.class);
                startActivity(i);
            }
        });
    }
}