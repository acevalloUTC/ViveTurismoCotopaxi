package com.example.kenshi.informacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Naturales extends AppCompatActivity {

    private TextView Descripcion,Titulo;

    private String correctoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naturales);

        Descripcion = (TextView) findViewById(R.id.descrip);
        Titulo = (TextView) findViewById(R.id.titulo);

        Bundle getCorrecto = getIntent().getExtras();
       Descripcion.setText(String.valueOf(getCorrecto.get("valor2")));
        Titulo.setText(String.valueOf(getCorrecto.get("valor1")));

    }


}
