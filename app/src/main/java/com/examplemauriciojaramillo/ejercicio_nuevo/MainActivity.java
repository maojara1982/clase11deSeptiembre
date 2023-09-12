package com.examplemauriciojaramillo.ejercicio_nuevo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int cedula;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cedula = findViewById(R.id.cedula);

        Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);
        //datos a enviar
        enviarDatos.putExtra("nombre",nombre);
        enviarDatos.putExtra("cedula",cedula);
        startActivity(enviarDatos);

    }
}