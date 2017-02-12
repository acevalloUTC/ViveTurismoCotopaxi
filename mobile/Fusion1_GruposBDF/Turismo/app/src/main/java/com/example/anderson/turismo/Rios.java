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

public class Rios extends ActionBarActivity {

    int[] imagenCircuitoDelSol = {
            R.drawable.d_circuitodelsol_riouno,
            R.drawable.d_circuitodelsol_riodos,
            R.drawable.d_circuitodelsol_riotres,
            R.drawable.d_circuitodelsol_riocuatro,
            R.drawable.d_circuitodelsol_rioquinto
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
        setContentView(R.layout.activity_rios);

        ActionBar actionBar = getSupportActionBar();
        //    actionBar.setDisplayHomeAsUpEnabled(true);  //ir atras

        Bundle extras = getIntent().getExtras();
        //currentViewPager = extras.getInt("currentViewPager");
        //        nombreCircuito = extras.getString("nombreCircuito");
        Log.i("ramiro", "currentViewPager: " + currentViewPager);


        /**INDICAR TITULO **/
//        actionBar.setTitle(nombreCircuito);

        lista1 = (ListView) findViewById(R.id.listView_listarRios);
        switch (currentViewPager){
            case 0: //circuito chico
                titulo = getResources().getStringArray(R.array.circuitodelsol_titulo);
                contenido = getResources().getStringArray(R.array.circuitodelsol_contenido);
                adapter = new ListViewAdapter(this, imagenCircuitoDelSol, titulo, contenido);
                break;
            case 1: //circuito lunar
                titulo = getResources().getStringArray(R.array.circuitodelsol_titulo);
                contenido = getResources().getStringArray(R.array.circuitodelsol_contenido);
                adapter = new ListViewAdapter(this, imagenCircuitoDelSol, titulo, contenido);
                break;

            case 2: //ruta del vino
                titulo = getResources().getStringArray(R.array.circuitodelsol_titulo);
                contenido = getResources().getStringArray(R.array.circuitodelsol_contenido);
                adapter = new ListViewAdapter(this, imagenCircuitoDelSol, titulo, contenido);
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
                Intent i = new Intent(getApplicationContext(), ListarUnRio.class);
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

            View itemView = inflater.inflate(R.layout.single_post_rios, parent, false);

            // Locate the TextViews in listview_item.xml
            imgImg = (ImageView) itemView.findViewById(R.id.imagen_single_post_rios);
            txtTitle = (TextView) itemView.findViewById(R.id.tv_titulo_single_post_rios);
            txtContenido = (TextView) itemView.findViewById(R.id.tv_contenido_single_post_rios);

            // Capture position and set to the TextViews
            imgImg.setImageResource(imagenes[position]);
            txtTitle.setText(titulos[position]);
            txtContenido.setText(contenido[position]);

            return itemView;
        }
    }
}
