package com.example.tugaspertama;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TabungActivity extends AppCompatActivity {

    private final static double PHI = 3.14;
    private Button      btnHitung;
    private EditText    etJariJari, etTinggi;
    private TextView    tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        btnHitung   = findViewById(R.id.btn_hitung);
        etJariJari  = findViewById(R.id.et_jari_jari);
        etTinggi    = findViewById(R.id.et_tinggi);
        tvHasil     = findViewById(R.id.tv_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double jariJari = Double.parseDouble(etJariJari.getText().toString()) ;
                    double tinggi   = Double.parseDouble(etTinggi.getText().toString());
                    double hasil    = PHI * jariJari * jariJari * tinggi;

                    String sHasil   = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
