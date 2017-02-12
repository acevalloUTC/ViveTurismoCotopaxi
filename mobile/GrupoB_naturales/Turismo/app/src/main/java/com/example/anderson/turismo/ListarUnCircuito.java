package com.example.anderson.turismo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Anderson on 20/11/2016.
 */
public class ListarUnCircuito extends ActionBarActivity {

    private ImageView imgImagen;
    private TextView txtTitulo, txtContenido;
    String[] titulo;
    String[] contenido;

    private int[] imagenCircuitoChico = {
            R.drawable.a_circuitochico_laguna_uno,
            R.drawable.a_circuitochico_laguna_dos,
            R.drawable.a_circuitochico_laguna_tres,
            R.drawable.a_circuitochico_laguna_cuatro,
            R.drawable.a_circuitochico_laguna_cinco,
    };

    private int[] imagenCircuitoLunar = {
            R.drawable.circuitolunar_fenomenouno,
            R.drawable.circuitolunar_fenomenodos,
            R.drawable.circuitolunar_fenomenotres,
            R.drawable.circuitolunar_fenomenocuatro
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
            R.drawable.circuitodelsol_jardindelospoetas,
            R.drawable.circuitodelsol_autodromodezonda,
            R.drawable.circuitodelsol_cavasdezonda
    };

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
        setContentView(R.layout.listar_un_circuito);

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

        txtTitulo = (TextView) findViewById(R.id.tv_titulo_listaruncircuito);
        txtContenido = (TextView) findViewById(R.id.tv_contenido_listaruncircuito);
        imgImagen = (ImageView) findViewById(R.id.iv_imagen_listaruncircuito);

        switch (idcircuito){
            case 0: //circuito chico
                titulo = getResources().getStringArray(R.array.circuitochico_titulo);
                contenido = getResources().getStringArray(R.array.circuitochico_contenido_completo);
                imgImagen.setImageResource(imagenCircuitoChico[position]);
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
