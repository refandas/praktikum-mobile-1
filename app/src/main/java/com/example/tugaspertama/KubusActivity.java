package com.example.tugaspertama;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class KubusActivity extends AppCompatActivity {

    private Button      btnHitungKubus;
    private EditText    etSisi;
    private TextView    tvHasilKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        btnHitungKubus  = findViewById(R.id.btn_hitung_kubus);
        etSisi          = findViewById(R.id.et_sisi);
        tvHasilKubus    = findViewById(R.id.tv_hasil_kubus);

        btnHitungKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double sisi     = Double.parseDouble(etSisi.getText().toString());
                    double hasil    = Math.pow(sisi, 3);
                    String sHasil   = String.valueOf(hasil);

                    tvHasilKubus.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
