package com.example.tugaspertama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnVTabung, btnVKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVKubus   = findViewById(R.id.btn_vkubus);
        btnVTabung  = findViewById(R.id.btn_vtabung);

        btnVKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), KubusActivity.class);
                startActivity(intent);
            }
        });

        btnVTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TabungActivity.class);
                startActivity(intent);
            }
        });
    }
}
