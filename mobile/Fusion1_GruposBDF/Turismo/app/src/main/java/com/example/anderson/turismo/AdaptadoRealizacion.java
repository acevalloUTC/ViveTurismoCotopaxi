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
 * Created by LUCHEEINS on 29/1/2017.
 */

public class AdaptadoRealizacion extends AppCompatActivity {
    Intent intent;
    Bundle bundle;
    DatosRealizados sitio;
    private ArrayList<DatosRealizados> sitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_realiza);

        ListView list = (ListView)findViewById(R.id.listviewReal);
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
        private ArrayList<DatosRealizados> sitios;

        public MyListAdapter(Activity activity, ArrayList<DatosRealizados> sitios) {
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
            View view = inflater.inflate(R.layout.list_item_realizacion, null, true);

            final DatosRealizados real = sitios.get(position);
            ImageView image = (ImageView) view.findViewById(R.id.imagenListSitiosReal);
            TextView tvTitulo = (TextView) view.findViewById(R.id.txtListTituloReal);
            TextView tvUbicacion = (TextView) view.findViewById(R.id.txtListUbicacionReal);

            image.setImageResource(real.getImagen());
            tvTitulo.setText(real.getTitulo());
            tvUbicacion.setText(real.getUbicacion());//.substring(0, 50) + "..."

            final LinearLayout linearElement = (LinearLayout) view.findViewById(R.id.linearElement);
            linearElement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent = new Intent(activity, MostrarRealizacion.class);
                    intent.putExtra("REAL", real);
                    activity.startActivity(intent);
                }
            });
            return view;
        }
    }
    private void annadirSitios() {
        sitios.add(new DatosRealizados(R.drawable.a4, "Centro Recreacíonal Nagsiche","Su infraestructura se encuentra conformarla por dos piscinas: un grande, cuya característica especial es su piso de madera que permite la circulación del agua, y una piscina para niños al lado sur. cuenta con camerinos, área de duchas, cuartos de vestir y almacén. ","Se encuentra en el Cantón Salcedo a 1,3 Km al noroeste del parque de Panzateo, junto a la conjunción de los rios Nagstche y Cutuchi." ));
        sitios.add(new DatosRealizados(R.drawable.c4,"Producción de chocho de la Parroquia Chugchilán","Principalmente las comunidades de Guayama San Pedro. Guayama Grande y otros lugares de la parroquia se dedican a la producción de chocho, a partir de la intervención de varias ONGs, entre ellas CESA y Maquita Cushunchic para la conformación de redes de producción y comercialización.","Se encuentra en la parroquial de Chugchllán. a una altitud de 3063 m.s.n.m."));
        sitios.add(new DatosRealizados(R.drawable.d4,"Mirador Shalalá","Esta obra técnica constituye una verdadera oportunidad para ofrecer al visitante la opción de apreciar la Laguna de Quilotoa desde el punto más alto y prominente de la caldera en el cráter en que esta se forma.","El mirador se encuentra en el borde de la Laguna Quilotoa. Parroquia Zumbahua, Comunidad Snaialá."));
        sitios.add(new DatosRealizados(R.drawable.e4,"Producción de Quesos de la Parroquia Chugchilán","La producción quesera en la parroquia y especialmente en el sector de Chínalo tuvo su origen en los proyectos Implementados por organizaciones no gubernamentales como OMG Operación Mato Grosso con la utilización de técnicas suizas, lo cual ha atraído la atención de turistas nacionales y extranjeros donde pueden observar, participar del proceso de elaboración y degustar sus productos.", "En la Comunidad de Chínalo, parroquia Chugchilán." ));

    }
}
