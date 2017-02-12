package com.example.anderson.turismo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by LUCHEEINS on 23/1/2017.
 */

public class MostrarAcontecimiento  extends AppCompatActivity {
    TextView textViewTituloE;
    ImageView imageViewE;
    TextView textViewInformacionE;
    TextView textViewUbicacionE;
    DatosAcontecimientos acont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_acontecimientos);

        textViewTituloE = (TextView) findViewById(R.id.textViewtituloAcon);
        imageViewE = (ImageView) findViewById(R.id.imageViewAcon);
        textViewInformacionE = (TextView) findViewById(R.id.textViewInformacionAcon);
        textViewUbicacionE = (TextView) findViewById(R.id.textViewUbicacionAcon);

        acont = (DatosAcontecimientos)getIntent().getExtras().getSerializable("ACONT");

        textViewTituloE.setText(acont.titulo);
        textViewInformacionE.setText(acont.descripcion);
        textViewUbicacionE.setText(acont.ubicacion);
        imageViewE.setImageResource(acont.imagen);
        /*textViewTituloE.setText(acont.getTitulo());
        textViewInformacionE.setText(acont.getDescripcion());
        textViewUbicacionE.setText(acont.getUbicacion());
        imageViewE.setImageResource(acont.getImagen());*/

    }
    }
