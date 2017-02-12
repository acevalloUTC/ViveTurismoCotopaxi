package com.example.anderson.turismo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Fenomenos extends ActionBarActivity {


    int[] imagenCircuitoLunar = {
            R.drawable.b_circuito_fenomenos_uno,
            R.drawable.b_circuito_fenomenos_dos,
            R.drawable.b_circuito_fenomenos_tres,
            R.drawable.b_circuito_fenomenos_cuatro
    };

    int[] imagenRutaDelVino = {
            R.drawable.c_rutadelvino_montana_uno,
            R.drawable.c_rutadelvino_montana_dos,
            R.drawable.c_rutadelvino_montana_tres,
            R.drawable.c_rutadelvino_montana_cuatro,
            R.drawable.c_rutadelvino_montana_cinco,
            R.drawable.c_rutadelvino_montana_seis,
            R.drawable.c_rutadelvino_montana_siete
    };

    int[] imagenCircuitoDelSol = {
            R.drawable.circuitodelsol_riouno,
            R.drawable.circuitodelsol_riodos,
            R.drawable.circuitodelsol_riotres,
            R.drawable.circuitodelsol_riocuatro,
            R.drawable.circuitodelsol_rioquinto,
            R.drawable.circuitodelsol_cavasdezonda
    };

    int[] imagenCircuitoVerde = {
            R.drawable.circuitoverde_areauno,
            R.drawable.circuitoverde_areados,
            R.drawable.circuitoverde_areatres,
            R.drawable.circuitoverde_tudcum,
            R.drawable.circuitoverde_cuestadelviento,
            R.drawable.circuitoverde_jachal,
            R.drawable.circuitoverde_huaco
    };

    int[] imagenCircuitoDelRio = {
            R.drawable.circuitodelrio_calingasta,
            R.drawable.circuitodelrio_barreal,
            R.drawable.circuitodelrio_pampa,
            R.drawable.circuitodelrio_obsevatorio
    };

    String[] titulo;
    String[] contenido;

    private ListView lista1;
    ListViewAdapter adapter;

    int currentViewPager;
    String nombreCircuito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenomenos);

        ActionBar actionBar = getSupportActionBar();
        //    actionBar.setDisplayHomeAsUpEnabled(true);  //ir atras

        Bundle extras = getIntent().getExtras();
        //currentViewPager = extras.getInt("currentViewPager");
        //        nombreCircuito = extras.getString("nombreCircuito");
        Log.i("ramiro", "currentViewPager: " + currentViewPager);


        /**INDICAR TITULO **/
//        actionBar.setTitle(nombreCircuito);

        lista1 = (ListView) findViewById(R.id.listView_listarFenomenos);
        switch (currentViewPager){
            case 0: //circuito chico
                titulo = getResources().getStringArray(R.array.circuitolunar_titulo);
                contenido = getResources().getStringArray(R.array.circuitolunar_contenido);
                adapter = new ListViewAdapter(this, imagenCircuitoLunar, titulo, contenido);
                break;
            case 1: //circuito lunar
                titulo = getResources().getStringArray(R.array.circuitolunar_titulo);
                contenido = getResources().getStringArray(R.array.circuitolunar_contenido);
                adapter = new ListViewAdapter(this, imagenCircuitoLunar, titulo, contenido);
                break;

            case 2: //ruta del vino
                titulo = getResources().getStringArray(R.array.rutadelvino_titulo);
                contenido = getResources().getStringArray(R.array.rutadelvino_contenido);
                adapter = new ListViewAdapter(this, imagenRutaDelVino, titulo, contenido);
                break;

            case 3: //circuito del sol
                titulo = getResources().getStringArray(R.array.circuitodelsol_titulo);
                contenido = getResources().getStringArray(R.array.circuitodelsol_contenido);
                adapter = new ListViewAdapter(this, imagenCircuitoDelSol, titulo, contenido);
                break;

            case 4: //circuito verde
                titulo = getResources().getStringArray(R.array.circuitoverde_titulo);
                contenido = getResources().getStringArray(R.array.circuitoverde_contenido);
                adapter = new ListViewAdapter(this, imagenCircuitoVerde, titulo, contenido);
                break;



            default:
                Toast.makeText(getApplicationContext(), "no esta cargado, pronto lo estarÃ¡", Toast.LENGTH_SHORT).show();
        }
        lista1.setAdapter(adapter);

        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), ListarUnFenomeno.class);
                i.putExtra("idcircuito",currentViewPager);
                i.putExtra("position", position);
                i.putExtra("nombreCircuito", nombreCircuito);
                i.putExtra("nombreSubCircuito", titulo[position]);
                startActivity(i);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);


            }
        });
    }


    /******************* LISTVIEW ADAPTER **************************/

    public class ListViewAdapter extends BaseAdapter {
        // Declare Variables
        Context context;
        int[] imagenes;
        String[] titulos;
        String[] contenido;
        LayoutInflater inflater;

        public ListViewAdapter(Context context, int[] imagenes, String[] titulos, String[] contenido ) {
            this.context = context;
            this.imagenes = imagenes;
            this.titulos = titulos;
            this.contenido = contenido;
        }

        @Override
        public int getCount() {
            return titulos.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            // Declare Variables
            ImageView imgImg;
            TextView txtTitle;
            TextView txtContenido;

            //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View itemView = inflater.inflate(R.layout.single_post_fenomenos, parent, false);

            // Locate the TextViews in listview_item.xml
            imgImg = (ImageView) itemView.findViewById(R.id.imagen_single_post_fenomeno);
            txtTitle = (TextView) itemView.findViewById(R.id.tv_titulo_single_post_fenomeno);
            txtContenido = (TextView) itemView.findViewById(R.id.tv_contenido_single_post_fenomeno);

            // Capture position and set to the TextViews
            imgImg.setImageResource(imagenes[position]);
            txtTitle.setText(titulos[position]);
            txtContenido.setText(contenido[position]);

            return itemView;
        }
    }
}
