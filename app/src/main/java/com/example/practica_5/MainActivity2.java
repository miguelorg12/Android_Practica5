package com.example.practica_5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    TextView Ganadas1, Ganadas2;
    ImageView espacio1, espacio2, espacio3, espacio4, espacio5, espacio6, espacio7, espacio8, espacio9;
    Button reiniciar;
    int turno = 1;
    int ganadas1 = 0;
    int ganadas2 = 0;
    int[] tablero = new int[9];
    int[][] combinaciones = new int[][]{
        {0,1,2},
        {3,4,5},
        {6,7,8},
        {0,4,8},
        {2,4,6},
        {0,3,6},
        {1,4,7},
        {2,5,8}
    };
    boolean ganador = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Ganadas1 = findViewById(R.id.ganadorplayer1);
        Ganadas2 = findViewById(R.id.ganadorplayer2);
        espacio1 = findViewById(R.id.espacio1);
        espacio2 = findViewById(R.id.espacio2);
        espacio3 = findViewById(R.id.espacio3);
        espacio4 = findViewById(R.id.espacio4);
        espacio5 = findViewById(R.id.espacio5);
        espacio6 = findViewById(R.id.espacio6);
        espacio7 = findViewById(R.id.espacio7);
        espacio8 = findViewById(R.id.espacio8);
        espacio9 = findViewById(R.id.espacio9);
        reiniciar = findViewById(R.id.reiniciar);
        reiniciar.setOnClickListener(v -> {
            reiniciar();
        });
        espacio1.setOnClickListener(v -> {
            if(tablero[0] == 0 && !ganador){
                if(turno == 1){
                    espacio1.setImageResource(R.drawable.circulo);
                    tablero[0] = 1;
                    turno = 2;
                }else{
                    espacio1.setImageResource(R.drawable.equis);
                    tablero[0] = 2;
                    turno = 1;
                }
                verificar();
            }
        });
        espacio2.setOnClickListener(v -> {
            if(tablero[1] == 0 && !ganador){
                if(turno == 1){
                    espacio2.setImageResource(R.drawable.circulo);
                    tablero[1] = 1;
                    turno = 2;
                }else{
                    espacio2.setImageResource(R.drawable.equis);
                    tablero[1] = 2;
                    turno = 1;
                }
                verificar();
            }
        });
        espacio3.setOnClickListener(v -> {
            if(tablero[2] == 0 && !ganador){
                if(turno == 1){
                    espacio3.setImageResource(R.drawable.circulo);
                    tablero[2] = 1;
                    turno = 2;
                }else{
                    espacio3.setImageResource(R.drawable.equis);
                    tablero[2] = 2;
                    turno = 1;
                }
                verificar();
            }
        });
        espacio4.setOnClickListener(v -> {
            if(tablero[3] == 0 && !ganador){
                if(turno == 1){
                    espacio4.setImageResource(R.drawable.circulo);
                    tablero[3] = 1;
                    turno = 2;
                }else{
                    espacio4.setImageResource(R.drawable.equis);
                    tablero[3] = 2;
                    turno = 1;
                }
                verificar();
            }
        });
        espacio5.setOnClickListener(v -> {
            if(tablero[4] == 0 && !ganador){
                if(turno == 1){
                    espacio5.setImageResource(R.drawable.circulo);
                    tablero[4] = 1;
                    turno = 2;
                }else{
                    espacio5.setImageResource(R.drawable.equis);
                    tablero[4] = 2;
                    turno = 1;
                }
                verificar();
            }
        });
        espacio6.setOnClickListener(v -> {
            if(tablero[5] == 0 && !ganador){
                if(turno == 1){
                    espacio6.setImageResource(R.drawable.circulo);
                    tablero[5] = 1;
                    turno = 2;
                }else{
                    espacio6.setImageResource(R.drawable.equis);
                    tablero[5] = 2;
                    turno = 1;
                }
                verificar();
            }
        });
        espacio7.setOnClickListener(v -> {
            if(tablero[6] == 0 && !ganador){
                if(turno == 1){
                    espacio7.setImageResource(R.drawable.circulo);
                    tablero[6] = 1;
                    turno = 2;
                }else{
                    espacio7.setImageResource(R.drawable.equis);
                    tablero[6] = 2;
                    turno = 1;
                }
                verificar();
            }
        });
        espacio8.setOnClickListener(v -> {
            if(tablero[7] == 0 && !ganador){
                if(turno == 1){
                    espacio8.setImageResource(R.drawable.circulo);
                    tablero[7] = 1;
                    turno = 2;
                }else{
                    espacio8.setImageResource(R.drawable.equis);
                    tablero[7] = 2;
                    turno = 1;
                }
                verificar();
            }
        });
        espacio9.setOnClickListener(v -> {
            if(tablero[8] == 0 && !ganador){
                if(turno == 1){
                    espacio9.setImageResource(R.drawable.circulo);
                    tablero[8] = 1;
                    turno = 2;
                }else{
                    espacio9.setImageResource(R.drawable.equis);
                    tablero[8] = 2;
                    turno = 1;
                }
                verificar();
            }
        });
    }
    public void reiniciar(){
        ganador = false;
        turno = 1;
        tablero = new int[9];
        espacio1.setImageResource(R.drawable.transparente);
        espacio2.setImageResource(R.drawable.transparente);
        espacio3.setImageResource(R.drawable.transparente);
        espacio4.setImageResource(R.drawable.transparente);
        espacio5.setImageResource(R.drawable.transparente);
        espacio6.setImageResource(R.drawable.transparente);
        espacio7.setImageResource(R.drawable.transparente);
        espacio8.setImageResource(R.drawable.transparente);
        espacio9.setImageResource(R.drawable.transparente);

    }
    public void verificar(){
        for(int i = 0; i < combinaciones.length; i++){
            if(tablero[combinaciones[i][0]] == tablero[combinaciones[i][1]] && tablero[combinaciones[i][1]] == tablero[combinaciones[i][2]] && tablero[combinaciones[i][0]] != 0){
                ganador = true;
                if(tablero[combinaciones[i][0]] == 1){
                    ganadas1++;
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Ganador");
                    builder.setMessage("El jugador 1 ha ganado");
                    builder.setPositiveButton("Aceptar", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                    Ganadas1.setText("" + ganadas1);
                    reiniciar();

                }else{
                    ganadas2++;
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Ganador");
                    builder.setMessage("El jugador 2 ha ganado");
                    builder.setPositiveButton("Aceptar", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                    Ganadas2.setText("" + ganadas2);
                    reiniciar();
                }
            }
        }
    }
}