package com.example.baicuoiky;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.os.Bundle;

public class activity_thanhtoan extends AppCompatActivity {
    ImageView imageQR;
    Button btnHuyTT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanhtoan);
        imageQR = findViewById(R.id.imageQR);
        btnHuyTT = findViewById(R.id.btnHuyTT);

        imageQR.setOnClickListener(new View.OnClickListener() {
            private View dialogView;
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(activity_thanhtoan.this);
                mydialog.setTitle("Xác nhận thanh toán");
                mydialog.setMessage("Bạn có chắc chắn thanh toán không?");
                mydialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(activity_thanhtoan.this, "Thanh toán thành công.", Toast.LENGTH_LONG).show();
                        Intent intentTT = new Intent(activity_thanhtoan.this, activity_hoadon.class);
                        startActivity(intentTT);
                    }
                });
                mydialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                mydialog.show();

            }
        });
        btnHuyTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHTT = new Intent(activity_thanhtoan.this, activity_datve.class);
                startActivity(intentHTT);
            }
        });
    }
}