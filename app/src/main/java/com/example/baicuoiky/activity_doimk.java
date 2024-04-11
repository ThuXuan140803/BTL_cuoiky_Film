package com.example.baicuoiky;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class activity_doimk extends AppCompatActivity {
    private EditText extMkhientai, extMkmoi, extMknhaplai;
    private Button btnDoiMK,btnHuydoiMK;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doimk);

        mAuth = FirebaseAuth.getInstance();
        extMkhientai = findViewById(R.id.extMkhientai);
        extMkmoi = findViewById(R.id.extMkmoi);
        extMknhaplai = findViewById(R.id.extMknhaplai);
        btnDoiMK = findViewById(R.id.btnDoiMK);
        btnHuydoiMK = findViewById(R.id.btnHuydoiMK);

        btnDoiMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doimk();
            }
        });

        btnHuydoiMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_doimk.this, activity_taikhoan.class);
                startActivity(i);
            }
        });
    }

    private void doimk() {
        FirebaseUser user = mAuth.getCurrentUser();

        if (user != null) {
            String oldPassword = extMkhientai.getText().toString().trim();
            String newPassword = extMkmoi.getText().toString().trim();
            String confirmNewPassword = extMknhaplai.getText().toString().trim();

            if (TextUtils.isEmpty(oldPassword) || TextUtils.isEmpty(newPassword) || TextUtils.isEmpty(confirmNewPassword)) {
                Toast.makeText(getApplicationContext(), "Vui lòng nhập mật khẩu cũ, mật khẩu mới và xác nhận mật khẩu mới", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!newPassword.equals(confirmNewPassword)) {
                Toast.makeText(getApplicationContext(), "Mật khẩu mới và xác nhận mật khẩu mới không khớp", Toast.LENGTH_SHORT).show();
                return;
            }

            user.updatePassword(newPassword).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(Task<Void> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Mật khẩu đã được thay đổi thành công", Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Thay đổi mật khẩu không thành công", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}