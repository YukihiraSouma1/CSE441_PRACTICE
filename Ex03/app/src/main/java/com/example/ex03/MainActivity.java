package com.example.ex03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    Button btncong, btnhieu, btntich, btnthuong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edta);
        edt2 = findViewById(R.id.edtb);
        edt3 = findViewById(R.id.edtc);
        btncong = findViewById(R.id.btncong);
        btnhieu = findViewById(R.id.btnhieu);
        btnthuong = findViewById(R.id.btnthuong);
        btntich = findViewById(R.id.btntich);
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            int a = Integer.parseInt("0"+edt1.getText());
            int b = Integer.parseInt("0"+edt2.getText());
// TODO Auto-generated method stub
            edt3.setText("a + b =" +(a+b));
        }
        });
        btnhieu.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            int a = Integer.parseInt("0"+edt1.getText());
            int b = Integer.parseInt("0"+edt2.getText());
// TODO Auto-generated method stub
            edt3.setText("a - b =" +(a-b));
        }
        });
        btntich.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            int a = Integer.parseInt("0"+edt1.getText());
            int b = Integer.parseInt("0"+edt2.getText());
// TODO Auto-generated method stub
            edt3.setText("a * b =" +(a*b));
        }
        });
        btnthuong.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                int a = Integer.parseInt("0" + edt1.getText());
                int b = Integer.parseInt("0" + edt2.getText());
                if (b == 0)
                {
                    edt3.setText("B phai khac 0");
                }
                else
                {
                    edt3.setText("a / b =" + (a / b));
                }


              }
        });
    }
}