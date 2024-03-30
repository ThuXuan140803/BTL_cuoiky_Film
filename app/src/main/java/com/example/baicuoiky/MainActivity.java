package com.example.baicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtemail,edtmatkhau;

    Button btndangnhap,btndangky;
    private String username;
    private String pwd;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtemail = findViewById(R.id.edtemail);
        edtmatkhau = findViewById(R.id.edtmatkhau);
        btndangnhap = findViewById(R.id.btndangnhap);
        btndangky = findViewById(R.id.btndangky);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtemail.getText().toString();
                String mk = edtmatkhau.getText().toString();
                username = "xuan1408@gmail.com";
                pwd = "10011408";
                if (email.equals("") && mk.equals(""))
                    Toast.makeText(MainActivity.this, "Vui lòng nhập thông tin", Toast.LENGTH_LONG).show();
                else if (email.equals(username) && mk.equals(pwd)) {
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_LONG).show();

                    Intent intentDS = new Intent(MainActivity.this, activity_theloai.class);
                    startActivity(intentDS);

                }
                else {
                    Toast.makeText(MainActivity.this, "Tên đăng nhập không tồn tại hoặc sai mật khẩu", Toast.LENGTH_LONG).show();
                }

            }
        });
        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDK = new Intent(MainActivity.this, activity_dangky.class);
                startActivity(intentDK);

            }
        });

    }
}