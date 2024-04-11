package com.example.baicuoiky;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class activity_dangky extends AppCompatActivity {
    private EditText txthoten, txttendn, txtsdt, txtemail, txtmk;
    private Button btndangky;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
        mAuth = FirebaseAuth.getInstance();
        txthoten = findViewById(R.id.txthoten);
        txttendn = findViewById(R.id.txttendn);
        txtsdt = findViewById(R.id.txtsdt);
        txtemail = findViewById(R.id.txtemail);
        txtmk = findViewById(R.id.txtmk);
        btndangky = findViewById(R.id.btndangky);

        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangky();
            }
        });
    }

    private void dangky() {
        String hoten, tendn, sdt, email, pass;
        hoten = txthoten.getText().toString();
        tendn = txttendn.getText().toString();
        sdt = txtsdt.getText().toString();
        email = txtemail.getText().toString();
        pass = txtmk.getText().toString();
        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(hoten) || TextUtils.isEmpty(tendn) || TextUtils.isEmpty(sdt) || TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "Vui lòng nhập đủ thông tin!!!", Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(activity_dangky.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Để kết thúc activity hiện tại sau khi chuyển đến MainActivity
                } else {
                    Toast.makeText(getApplicationContext(), "Đăng ký không thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}