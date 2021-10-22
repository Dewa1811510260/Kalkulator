package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    EditTextNumber et1, et2;
    Button btTambah, btKurang, btkali, btBagi;
    TextView tvhasil;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1=(EditText) findVIewById(R.id.editTextNumber1);
        et2=(EditText) findVIewById(R.id.editTextNumber2);
        tvhasil=(TextView) findVIewById(R.id.textViewHasil);
        btTambah=(Button) findVIewById(R.id.buttonTambah3);
        btKurang=(Button) findVIewById(R.id.buttonKurang);
        btKali=(Button) findVIewById(R.id.buttonKali);
        btBagi=(Button) findVIewById(R.id.buttonBagi);

        btTambah.setonClickListener(new View.OnClickLidtener()) {
          @Override
          Pulic void onClick(View View) {
              double bil1, bil2, hasil;
              bil1=Double.valueOf(et1.getText().toString().trim());
              bil2=Double.valueOf(et2.getText().toString().trim());
              hasil=bil1+bil2;
              String hasil1=String.valueOf(hasil);
              tvHasil.setText(hasil1);
           }
        }};

    btKurang.setOnClickListener(new View.OnClickListener() {
        @Override
        Pulic void onClick(View View) {
            double bil1, bil2, hasil;
            bil1=Double.valueOf(et1.getText().toString().trim());
            bil2=Double.valueOf(et2.getText().toString().trim());
            hasil=bil1-bil2;
            String hasil1=String.valueOf(hasil);
            tvHasil.setText(hasil1);
    }
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            Pulic void onClick(View View) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1*bil2;
                String hasil1=String.valueOf(hasil);
                tvHasil.setText(hasil1);
}
            btBagi.setOnClickListener(new View.OnClickListener() {
                @Override
                Pulic void onClick(View View) {
                    double bil1, bil2, hasil;
                    bil1=Double.valueOf(et1.getText().toString().trim());
                    bil2=Double.valueOf(et2.getText().toString().trim());
                    hasil=bil1/bil2;
                    String hasil1=String.valueOf(hasil);
                    tvHasil.setText(hasil1);