package com.example.baicuoiky;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText edtemail, edtmatkhau;
    private FirebaseAuth mAuth;
    Button btndangnhap, btndangky;
    TextView txtquenmatkhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        edtemail = findViewById(R.id.edtemail);
        edtmatkhau = findViewById(R.id.edtmatkhau);
        btndangnhap = findViewById(R.id.btndangnhap);
        btndangky = findViewById(R.id.btndangky);
        txtquenmatkhau = findViewById(R.id.txtquenmatkhau);

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_dangky.class);
                startActivity(i);
            }
        });

        txtquenmatkhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_quenmk.class);
                startActivity(i);
            }
        });

    }

    private void login() {
        String email, pass;
        email = edtemail.getText().toString();
        pass = edtmatkhau.getText().toString();
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Vui lòng nhập email!!!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "Vui lòng nhập password!!!", Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, activity_theloai.class);
                    startActivity(intent);
                    finish(); // Để kết thúc activity hiện tại sau khi chuyển đến activity_dangky
                } else {
                    Toast.makeText(getApplicationContext(), "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}