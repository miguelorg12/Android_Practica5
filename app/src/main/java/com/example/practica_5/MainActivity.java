package com.example.practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;
import android.os.CountDownTimer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer = findViewById(R.id.mTextField);
        new CountDownTimer(6000, 1000) {
            public void onTick(long millisUntilFinished) {
                timer.setText("Empezar a jugar en: " + millisUntilFinished / 1000);
            }
            public void onFinish() {
                timer.setText("Comenzando!");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        }.start();
    }
}