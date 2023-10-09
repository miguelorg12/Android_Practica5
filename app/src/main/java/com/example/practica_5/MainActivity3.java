package com.example.practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;
import android.os.CountDownTimer;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    TextView ganador1, ganador2, textoregreso, avisoganar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ganador1 = findViewById(R.id.ganadorplayer1);
        ganador2 = findViewById(R.id.ganadorplayer2);
        textoregreso = findViewById(R.id.volverajugar);
        avisoganar = findViewById(R.id.textoganador);
        Bundle bundle = getIntent().getExtras();
        int ganadas1 = bundle.getInt("ganadas1");
        int ganadas2 = bundle.getInt("ganadas2");
        ganador1.setText("" + ganadas1);
        ganador2.setText("" + ganadas2);

        if (ganadas1 > ganadas2) {
            avisoganar.setText("Ganador: Jugador 1");
        } else if (ganadas1 < ganadas2) {
            avisoganar.setText("Ganador: Jugador 2");
        } else {
            avisoganar.setText("Empate");
        }
        new CountDownTimer(7000, 1000) {
            public void onTick(long millisUntilFinished) {
                textoregreso.setText("Regresando al juego en: " + millisUntilFinished / 1000);
            }
            public void onFinish() {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
                textoregreso.setText("Regresando!");
                finish();
            }
        }.start();
    }
}