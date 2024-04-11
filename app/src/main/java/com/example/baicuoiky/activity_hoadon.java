package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class activity_hoadon extends AppCompatActivity {
    TextView txtEmail,txtTenphim,txtSoluong,txtTongtien;
    Button btnTrangchu;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoadon);
        txtEmail = findViewById(R.id.txtEmail);
        txtTenphim = findViewById(R.id.txtTenphim);
        txtSoluong = findViewById(R.id.txtSoluong);
        btnTrangchu = findViewById(R.id.btnTrangchu);
        txtTongtien = findViewById(R.id.txtTongtien);
        mAuth = FirebaseAuth.getInstance();

        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            String email = user.getEmail();
            txtEmail.setText(email);
        }

        Intent intent = getIntent();
        String tenPhim = intent.getStringExtra("tenPhim");
        String soLuongVe = intent.getStringExtra("soLuongVe");
        String tongTien = intent.getStringExtra("tongTien");

        txtTenphim.setText(tenPhim);
        txtSoluong.setText(soLuongVe);
        txtTongtien.setText(tongTien);

        btnTrangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHD = new Intent(activity_hoadon.this, activity_theloai.class);
                startActivity(intentHD);

            }
        });
    }
}