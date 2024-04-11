package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_P_HH_minion extends AppCompatActivity {
    Button btnDatve;
    ImageView iMuiten;
    TextView txtMinion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phh_minion);

        btnDatve = findViewById(R.id.btnDatve);
        iMuiten = findViewById(R.id.iMuiten);
        txtMinion = findViewById(R.id.txtMinion);

        btnDatve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_HH_minion.this, activity_datve.class);
                intent.putExtra("tenPhim", txtMinion.getText().toString());
                startActivity(intent);

            }
        });
        iMuiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_P_HH_minion.this, activity_TL_hoathinh.class);
                startActivity(intent);

            }
        });
    }
}