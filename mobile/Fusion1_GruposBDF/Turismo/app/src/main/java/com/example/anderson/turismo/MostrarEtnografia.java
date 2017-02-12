package com.example.anderson.turismo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JWEB.NET on 06/01/2017.
 */

public class MostrarEtnografia extends AppCompatActivity {
    TextView textViewTituloE;
    ImageView imageViewE;
    TextView textViewInformacionE;
    TextView textViewUbicacionE;
    DatosEtnografia etno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_etnograficas);

        textViewTituloE = (TextView) findViewById(R.id.textViewtituloEtno);
        imageViewE = (ImageView) findViewById(R.id.imageViewEtno);
        textViewInformacionE = (TextView) findViewById(R.id.textViewInformacionEtno);
        textViewUbicacionE = (TextView) findViewById(R.id.textViewUbicacionEtno);

        etno = (DatosEtnografia) getIntent().getExtras().getSerializable("ETNO");

        textViewTituloE.setText(etno.titulo);
        textViewInformacionE.setText(etno.descripcion);
        textViewUbicacionE.setText(etno.ubicacion);
        imageViewE.setImageResource(etno.imagen);

    }
}


