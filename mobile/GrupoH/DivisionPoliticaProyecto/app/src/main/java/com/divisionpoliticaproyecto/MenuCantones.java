package com.divisionpoliticaproyecto;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuCantones extends AppCompatActivity {

    ListViewAdapter adapter;

    /**
     * estos strings contienen el contenido de los titulos
     * subtitulos y la imagenes de la lista de los cantones de cotopaxi
     */

    String[] titulo = new String[]{
            "Latacunga",
            "Saquisilí",
            "Pujilí",
            "Salcedo",
            "La Mana",
            "Sigchos",
            "Pangua"
    };

    String[] subtitulo = new String[] {
            "subtitulo1",
            "subtitulo2",
            "subtitulo3",
            "subtitulo4",
            "subtitulo5",
            "subtitulo6",
            "subtitulo7"
    };

    int[] imagen = {
            R.drawable.latacunga,
            R.drawable.saquisili,
            R.drawable.pujili,
            R.drawable.salcedo,
            R.drawable.lamana,
            R.drawable.sigchos,
            R.drawable.pangua
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cantones);

        //con estas lineas se visualiza el boton atras de la parte superior izquierda
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListView lista = (ListView)findViewById(R.id.listaCantones);

        //colocanto un adaptador para el listView
        adapter = new ListViewAdapter(this, titulo, subtitulo, imagen);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getApplicationContext(),"Ingresando al cantón.",Toast.LENGTH_SHORT).show();

                int opsion = position + 1;
                switch (opsion)
                {
                    case 1:
                        Intent mostrarCanton1 = new Intent(MenuCantones.this, Latacunga.class);
                        startActivity(mostrarCanton1);
                        break;
                    case 2:
                        Intent mostrarCanton2 = new Intent(MenuCantones.this, Saquisili.class);
                        startActivity(mostrarCanton2);
                        break;
                    case 3:
                        Intent mostrarCanton3 = new Intent(MenuCantones.this, Pujili.class);
                        startActivity(mostrarCanton3);
                        break;
                    case 4:
                        Intent mostrarCanton4 = new Intent(MenuCantones.this, Salcedo.class);
                        startActivity(mostrarCanton4);
                        break;
                    case 5:
                        Intent mostrarCanton5 = new Intent(MenuCantones.this, Lamana.class);
                        startActivity(mostrarCanton5);
                        break;
                    case 6:
                        Intent mostrarCanton6 = new Intent(MenuCantones.this, Sigchos.class);
                        startActivity(mostrarCanton6);
                        break;
                    case 7:
                        Intent mostrarCanton7 = new Intent(MenuCantones.this, Pangua.class);
                        startActivity(mostrarCanton7);
                        break;

                }



            }
        });

    }

    /**
     * con esta funcion se activa el boton atras para que regrese a la anterior activiti
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                Log.i("ActionBar", "Atrás!");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * esta clase permite colocar en una lista 3 objetos
     * en este caso
     * imagen, titulo y subtitulo
     */
    public class ListViewAdapter extends BaseAdapter {
        // Declare Variables
        Context context;
        String[] titulos;
        int[] imagenes;
        String[] subtitulo;

        LayoutInflater inflater;


        /**
         * Constructor de la clase ListViewAdapter
         * @param context
         * @param titulos
         * @param subtitulo
         * @param imagenes
         */
        public ListViewAdapter(Context context, String[] titulos, String[] subtitulo, int[] imagenes) {
            this.context = context;
            this.titulos = titulos;
            this.imagenes = imagenes;
            this.subtitulo = subtitulo;
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
            TextView txtTitle;
            ImageView imgImg;
            TextView txtSubtitulo;

            //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View itemView = inflater.inflate(R.layout.list_row, parent, false);

            /**
             * aqui se mapea los objetos textView y ImageView
             * y se los enlaza con el titulo, imagen y subtitulo
             * de el archivo de diseño xml List_row
             */
            txtTitle = (TextView) itemView.findViewById(R.id.titulo);
            imgImg = (ImageView) itemView.findViewById(R.id.imagen);
            txtSubtitulo = (TextView) itemView.findViewById(R.id.subtitulo);

            // aqui se captura la posicion de cada titulo, subtitulo y imagen
            txtTitle.setText(titulos[position]);
            txtSubtitulo.setText(subtitulo[position]);
            imgImg.setImageResource(imagenes[position]);

            return itemView;
        }
    }


}
