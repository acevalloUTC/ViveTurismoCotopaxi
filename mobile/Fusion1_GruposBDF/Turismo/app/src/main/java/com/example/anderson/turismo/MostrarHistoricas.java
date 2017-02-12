package com.example.anderson.turismo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JWEB.NET on 09/01/2017.
 */

public class MostrarHistoricas extends AppCompatActivity {
    private TextView textViewTituloH;
    private ImageView imageViewH;
    private TextView textViewInformacionH;
    private TextView textViewUbicacionH;

    DatosHistoricas sitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_historicas);

        textViewTituloH = (TextView) findViewById(R.id.textViewtituloHisto);
        imageViewH = (ImageView) findViewById(R.id.imageViewHisto);
        textViewInformacionH= (TextView) findViewById(R.id.textViewInformacionHisto);
        textViewUbicacionH= (TextView) findViewById(R.id.textViewUbicacionHisto);


        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        sitios = (DatosHistoricas) bundle.getSerializable("HISTO");
        //etno = (DatosEtnografia) getIntent().getExtras().getSerializable("ETNO");

        textViewTituloH.setText(sitios.titulo);
        textViewInformacionH.setText(sitios.descripcion);
        textViewUbicacionH.setText(sitios.ubicacion);
        imageViewH.setImageResource(sitios.imagen);

    }

}
