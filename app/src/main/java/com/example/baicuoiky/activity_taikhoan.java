package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class activity_taikhoan extends AppCompatActivity {
    TextView txtEmail;
    Button btnphim,btntaikhoan,btntheloai;
    Button btnDoimk,btnDangxuat;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taikhoan);
        txtEmail = findViewById(R.id.txtEmail);
        btnphim = findViewById(R.id.btnGH);
        btntheloai = findViewById(R.id.btntheloai);
        btnDoimk = findViewById(R.id.btnDoimk);
        btnDangxuat = findViewById(R.id.btnDangxuat);
        mAuth = FirebaseAuth.getInstance();

        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            String email = user.getEmail();
            txtEmail.setText(email);
        }
        btnphim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTKP = new Intent(activity_taikhoan.this, activity_phim.class);
                startActivity(intentTKP);

            }
        });
        btntheloai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTKTL = new Intent(activity_taikhoan.this, activity_theloai.class);
                startActivity(intentTKTL);

            }
        });

        btnDoimk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTKTL = new Intent(activity_taikhoan.this, activity_doimk.class);
                startActivity(intentTKTL);

            }
        });

        btnDangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Toast.makeText(activity_taikhoan.this, "Đăng xuất thành công", Toast.LENGTH_LONG).show();
                Intent intentTKTL = new Intent(activity_taikhoan.this, MainActivity.class);
                startActivity(intentTKTL);
                finish();

            }
        });

    }
}