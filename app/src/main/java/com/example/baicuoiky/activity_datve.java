package com.example.baicuoiky;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.NumberFormat;
import java.util.Locale;

public class activity_datve extends AppCompatActivity {
    TextView txtEmail, txtTenphim, txtGiave;
    EditText edtSoluong, edtTongtien;
    Button btnthanhtoan, btnHuy;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datve);

        mAuth = FirebaseAuth.getInstance();

        txtEmail = findViewById(R.id.txtEmail);
        txtTenphim = findViewById(R.id.txtTenphim);
        edtSoluong = findViewById(R.id.edtSoluong);
        edtTongtien = findViewById(R.id.edtTongtien);
        txtGiave = findViewById(R.id.txtGiave);
        btnthanhtoan = findViewById(R.id.btnthanhtoan);
        btnHuy = findViewById(R.id.btnHuy);

        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            String email = user.getEmail();
            txtEmail.setText(email);
        }

        Intent intent = getIntent();
        if (intent != null) {
            String tenPhim = intent.getStringExtra("tenPhim");
            if (tenPhim != null) {
                txtTenphim.setText(tenPhim);
            }
        }

        edtSoluong.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // No need to handle before text changed
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // No need to handle on text changed
            }

            @Override
            public void afterTextChanged(Editable editable) {
                updateTotalAmount();
            }
        });

        btnthanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Đặt vé thành công", Toast.LENGTH_SHORT).show();
                String tenPhim = txtTenphim.getText().toString();
                String soLuongVe = edtSoluong.getText().toString();
                String tongTien = edtTongtien.getText().toString();

                Intent intent = new Intent(activity_datve.this, activity_hoadon.class);
                intent.putExtra("soLuongVe", soLuongVe);
                intent.putExtra("tenPhim", tenPhim);
                intent.putExtra("tongTien", tongTien);
                startActivity(intent);

//                FirebaseDatabase database = FirebaseDatabase.getInstance();
//                DatabaseReference bookingsRef = database.getReference("bookings");
//
//                Datve booking = new Datve();
//                booking.setMovieName(tenPhim);
//                booking.setQuantity(Integer.parseInt(soLuongVe));
//                booking.setTotalAmount(Double.parseDouble(tongTien));
//
//                bookingsRef.push().setValue(booking)
//                        .addOnSuccessListener(new OnSuccessListener<Void>() {
//                            @Override
//                            public void onSuccess(Void aVoid) {
//                                Toast.makeText(getApplicationContext(), "Lưu dữ liệu đặt vé thành công", Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .addOnFailureListener(new OnFailureListener() {
//                            @Override
//                            public void onFailure(@NonNull Exception e) {
//                                Toast.makeText(getApplicationContext(), "Lưu dữ liệu đặt vé không thành công", Toast.LENGTH_SHORT).show();
//                            }
//                        });

            }
        });

        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_datve.this, activity_theloai.class);
                startActivity(intent);
            }
        });
    }

    private void updateTotalAmount() {
        String quantityText = edtSoluong.getText().toString();
        int quantity = 0;
        if (!quantityText.isEmpty()) {
            quantity = Integer.parseInt(quantityText);
        }

        double totalAmount = calculateTotalAmount(quantity);
        String formattedTotalAmount = formatCurrency(totalAmount);
        edtTongtien.setText(formattedTotalAmount);
    }

    private double calculateTotalAmount(int quantity) {
        double pricePerUnit = 60000;
        return quantity * pricePerUnit;
    }

    private String formatCurrency(double amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
        return currencyFormatter.format(amount);
    }
}