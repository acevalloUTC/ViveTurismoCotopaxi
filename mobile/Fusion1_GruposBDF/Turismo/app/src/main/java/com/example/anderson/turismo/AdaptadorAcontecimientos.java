package com.example.anderson.turismo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JWEB.NET on 21/01/2017.
 */

public class AdaptadorAcontecimientos extends AppCompatActivity {

    Intent intent;
    Bundle bundle;
    DatosAcontecimientos sitio;
    private ArrayList<DatosAcontecimientos> sitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_acont);

        ListView list = (ListView)findViewById(R.id.listviewAcont);
        sitios = new ArrayList<>();
        annadirSitios();

        MyListAdapter adapter = new MyListAdapter(this,sitios);
        list.setAdapter(adapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
    }

    class MyListAdapter extends BaseAdapter {
        Intent intent;
        private Activity activity;
        private ArrayList<DatosAcontecimientos> sitios;

        public MyListAdapter(Activity activity, ArrayList<DatosAcontecimientos> sitios) {
            this.activity = activity;
            this.sitios = sitios;
        }


        @Override
        public int getCount() {
            return sitios.size();
        }

        @Override
        public Object getItem(int position) {
            return sitios.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View converView, ViewGroup parent) {
            LayoutInflater inflater = activity.getLayoutInflater();
            View view = inflater.inflate(R.layout.list_item_acont, null, true);

            final DatosAcontecimientos acont = sitios.get(position);
            ImageView image = (ImageView) view.findViewById(R.id.imageViewAcont);
            TextView tvTitulo = (TextView) view.findViewById(R.id.tvTituloAcont);
            TextView tvUbicacion = (TextView) view.findViewById(R.id.tvUbicacionAcont);

            image.setImageResource(acont.getImagen());
            tvTitulo.setText(acont.getTitulo());
            tvUbicacion.setText(acont.getUbicacion());//.substring(0, 50) + "..."

            final LinearLayout linearElement = (LinearLayout) view.findViewById(R.id.linearElement);
            linearElement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent = new Intent(activity, MostrarAcontecimiento.class);
                    intent.putExtra("ACONT", acont);
                    activity.startActivity(intent);
                }
            });
            return view;
        }
    }



    private void annadirSitios() {
        sitios.add(new DatosAcontecimientos(R.drawable.a, "Fiestas del Carnaval de la Mana", "La fiesta del folklor, la cultura y la alegría es el carnaval. Estas fiestas duran de 2 a 3 días con actividades para todo ámbito social", "Se desarrolla en el centro cantonal de la mana"));
        sitios.add(new DatosAcontecimientos(R.drawable.b, "Mama Negra", "Es la fiesta con la cual los habitantes de la ciudad de Latacunga celebran año tras año el aniversario de su independencia o fiesta política", "Se desarrolla en el centro de la ciudad de Latacunga, en un recorrido que avanza  hasta la avenida Unidad nacional"));
        sitios.add(new DatosAcontecimientos(R.drawable.c, "Festividades de la Virgen del Quinche", "Las actividades programadas están a cargo del comité de Fiestas del Cantón, Duran casi un mes con diferentes eventos. Se realizan varias actividades populares y religiosas, acompañado de Toros de pueblo, música de banda, juegos pirotécnicos.", "Se desarrollan en la cabecera cantonal de Saquisili a 13 km del Cantón Latacunga."));
        sitios.add(new DatosAcontecimientos(R.drawable.d, "Fiesta de Navidad Los Caporales", "Estas festividades se realizan en navidad, del 22 al 25 de diciembre; dirigida por dos priostes llamados El Compadre y la Comadre como tradición antigua en adoracion al niño Jesus Con la ayuda de los Yuras. Los Yuras son escogidos por los Priostes, quienes durante todo el año se encargan de buscar a los participantes.", "Se desarrolla en el centro parroquial de Angamarca"));
        sitios.add(new DatosAcontecimientos(R.drawable.e, "Pista de Parapente Potrerillo", "Se desarrolla eventos programados por los clubes de parapente en la provincia de Cotopaxi.", "se encuentra ubicada a 9km del centro parroquial de Belisario Quevedo"));

    }

    }
