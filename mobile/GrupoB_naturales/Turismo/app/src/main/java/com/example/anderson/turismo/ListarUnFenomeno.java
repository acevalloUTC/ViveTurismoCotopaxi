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
public class ListarUnFenomeno extends ActionBarActivity {
    private ImageView imgImagen;
    private TextView txtTitulo, txtContenido;
    String[] titulo;
    String[] contenido;



    private int[] imagenCircuitoLunar = {
            R.drawable.b_circuito_fenomenos_uno,
            R.drawable.b_circuito_fenomenos_dos,
            R.drawable.b_circuito_fenomenos_tres,
            R.drawable.b_circuito_fenomenos_cuatro
    };

    private int[] imagenRutaDelVino = {
            R.drawable.c_rutadelvino_montana_uno,
            R.drawable.c_rutadelvino_montana_dos,
            R.drawable.c_rutadelvino_montana_tres,
            R.drawable.c_rutadelvino_montana_cuatro,
            R.drawable.c_rutadelvino_montana_cinco,
            R.drawable.c_rutadelvino_montana_seis,
            R.drawable.c_rutadelvino_montana_siete
    };

    private int[] imagenCircuitoDelSol = {
            R.drawable.circuitodelsol_riouno,
            R.drawable.circuitodelsol_riodos,
            R.drawable.circuitodelsol_riotres,
            R.drawable.circuitodelsol_riocuatro,
            R.drawable.circuitodelsol_rioquinto,
            R.drawable.circuitodelsol_cavasdezonda
    };

    private int[] imagenCircuitoVerde = {
            R.drawable.circuitoverde_areauno,
            R.drawable.circuitoverde_areados,
            R.drawable.circuitoverde_areatres,
            R.drawable.circuitoverde_tudcum,
            R.drawable.circuitoverde_cuestadelviento,
            R.drawable.circuitoverde_jachal,
            R.drawable.circuitoverde_huaco
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
        setContentView(R.layout.listar_un_fenomeno);

        ActionBar actionBar = getSupportActionBar();
        //actionBar.setDisplayHomeAsUpEnabled(true);

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

        txtTitulo = (TextView) findViewById(R.id.tv_titulo_listarunfenomeno);
        txtContenido = (TextView) findViewById(R.id.tv_contenido_listarunfenomeno);
        imgImagen = (ImageView) findViewById(R.id.iv_imagen_listarunfenomeno);

        switch (idcircuito){
            case 0: //circuito chico
                titulo = getResources().getStringArray(R.array.circuitolunar_titulo);
                contenido = getResources().getStringArray(R.array.circuitolunar_contenido_completo);
                imgImagen.setImageResource(imagenCircuitoLunar[position]);
                break;
            case 1: //circuito lunar
                titulo = getResources().getStringArray(R.array.circuitolunar_titulo);
                contenido = getResources().getStringArray(R.array.circuitolunar_contenido_completo);
                imgImagen.setImageResource(imagenCircuitoLunar[position]);
                break;

            case 2: //ruta del vino
                titulo = getResources().getStringArray(R.array.rutadelvino_titulo);
                contenido = getResources().getStringArray(R.array.rutadelvino_contenido_completo);
                imgImagen.setImageResource(imagenRutaDelVino[position]);
                break;

            case 3: //circuito del sol
                titulo = getResources().getStringArray(R.array.circuitodelsol_titulo);
                contenido = getResources().getStringArray(R.array.circuitodelsol_contenido_completo);
                imgImagen.setImageResource(imagenCircuitoDelSol[position]);
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
