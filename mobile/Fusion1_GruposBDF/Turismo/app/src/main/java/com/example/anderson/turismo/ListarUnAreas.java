package com.example.anderson.turismo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Anderson on 03/01/2017.
 */
public class ListarUnAreas extends ActionBarActivity {
    private ImageView imgImagen;
    private TextView txtTitulo, txtContenido;
    String[] titulo;
    String[] contenido;



    private int[] imagenCircuitoVerde = {
            R.drawable.circuitoverde_areauno,
            R.drawable.circuitoverde_areados,
            R.drawable.circuitoverde_areatres

    };

    private int[] imagenCircuitoDelRio = {
            R.drawable.circuitodelrio_calingasta,
            R.drawable.circuitodelrio_barreal,
            R.drawable.circuitodelrio_pampa,
            R.drawable.circuitodelrio_obsevatorio
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_un_areas);

        ActionBar actionBar = getSupportActionBar();
       // actionBar.setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        int idcircuito = extras.getInt("idcircuito");
        final int position = extras.getInt("position");
        String nombreCircuito = extras.getString("nombreCircuito");
        String nombreSubCircuito = extras.getString("nombreSubCircuito");

        //Log.i("ramiro", "listar un circuito idcircuito" + idcircuito);
        //Log.i("ramiro", "listar un circuito position " + position);

        /**INDICAR TITULO Y SUBTITULO**/
        //actionBar.setTitle(nombreCircuito);
        //actionBar.setSubtitle(nombreSubCircuito);

        txtTitulo = (TextView) findViewById(R.id.tv_titulo_listarunareas);
        txtContenido = (TextView) findViewById(R.id.tv_contenido_listarunareas);
        imgImagen = (ImageView) findViewById(R.id.iv_imagen_listarunareas);

        switch (idcircuito){
            case 0: //circuito chico
                titulo = getResources().getStringArray(R.array.circuitoverde_titulo);
                contenido = getResources().getStringArray(R.array.circuitoverde_contenido_completo);
                imgImagen.setImageResource(imagenCircuitoVerde[position]);
                break;
            case 1: //circuito lunar
                titulo = getResources().getStringArray(R.array.circuitoverde_titulo);
                contenido = getResources().getStringArray(R.array.circuitoverde_contenido_completo);
                imgImagen.setImageResource(imagenCircuitoVerde[position]);
                break;

            case 2: //ruta del vino
                titulo = getResources().getStringArray(R.array.circuitoverde_titulo);
                contenido = getResources().getStringArray(R.array.circuitoverde_contenido_completo);
                imgImagen.setImageResource(imagenCircuitoVerde[position]);
                break;

            case 3: //circuito del sol
                titulo = getResources().getStringArray(R.array.circuitoverde_titulo);
                contenido = getResources().getStringArray(R.array.circuitoverde_contenido_completo);
                imgImagen.setImageResource(imagenCircuitoVerde[position]);
                break;

            case 4: //circuito verde
                titulo = getResources().getStringArray(R.array.circuitoverde_titulo);
                contenido = getResources().getStringArray(R.array.circuitoverde_contenido_completo);
                imgImagen.setImageResource(imagenCircuitoVerde[position]);
                break;



            default:
                Toast.makeText(getApplicationContext(), "no esta cargado, pronto lo estarÃ¡", Toast.LENGTH_SHORT).show();
        }
        txtTitulo.setText(titulo[position]);
        txtContenido.setText(contenido[position]);
    }
}
