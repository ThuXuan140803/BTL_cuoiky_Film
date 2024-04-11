package com.example.baicuoiky;

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

public class activity_quenmk extends AppCompatActivity {
    private EditText extEmail;
    private Button btnGuimk;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quenmk);

        mAuth = FirebaseAuth.getInstance();
        extEmail = findViewById(R.id.extEmail);
        btnGuimk = findViewById(R.id.btnGuimk);

        btnGuimk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guilaiMK();
            }
        });
    }

    private void guilaiMK() {
        String email = extEmail.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Vui lòng nhập email của bạn", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(Task<Void> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Hướng dẫn đặt lại mật khẩu đã được gửi đến email của bạn", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Failed to send reset email!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}