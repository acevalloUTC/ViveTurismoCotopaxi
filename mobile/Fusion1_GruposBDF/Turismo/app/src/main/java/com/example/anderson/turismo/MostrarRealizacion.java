package com.example.anderson.turismo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JWEB.NET on 09/01/2017.
 */

public class MostrarRealizacion extends AppCompatActivity {
    private TextView textViewTituloR;
    private ImageView imageViewR;
    private TextView textViewInformacionR;
    private TextView textViewUbicacionR;

    DatosRealizados real;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_realizacion);

        textViewTituloR = (TextView) findViewById(R.id.textViewtituloReal);
        imageViewR = (ImageView) findViewById(R.id.imageViewReal);
        textViewInformacionR= (TextView) findViewById(R.id.textViewInformacionReal);
        textViewUbicacionR= (TextView) findViewById(R.id.textViewUbicacionReal);


        real = (DatosRealizados) getIntent().getExtras().getSerializable("REAL");

        textViewTituloR.setText(real.titulo);
        textViewInformacionR.setText(real.descripcion);
        textViewUbicacionR.setText(real.ubicacion);
        imageViewR.setImageResource(real.imagen);


    }

}