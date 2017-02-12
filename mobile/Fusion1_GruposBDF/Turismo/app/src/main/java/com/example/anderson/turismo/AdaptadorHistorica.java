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

public class AdaptadorHistorica extends AppCompatActivity {

    Intent intent;
    Bundle bundle;
    DatosHistoricas sitio;
    private ArrayList<DatosHistoricas> sitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_historicas);

        ListView list = (ListView)findViewById(R.id.listvieHisto);
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
        private ArrayList<DatosHistoricas> sitios;

        public MyListAdapter(Activity activity, ArrayList<DatosHistoricas> sitios) {
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
            View view = inflater.inflate(R.layout.list_item_historicas, null, true);

            final DatosHistoricas histo= sitios.get(position);
            ImageView image = (ImageView) view.findViewById(R.id.imagenListSitiosHisto);
            TextView tvTitulo = (TextView) view.findViewById(R.id.txtListTituloHisto);
            TextView tvUbicacion = (TextView) view.findViewById(R.id.txtListUbicacionHisto);

            image.setImageResource(histo.getImagen());
            tvTitulo.setText(histo.getTitulo());
            tvUbicacion.setText(histo.getUbicacion());//.substring(0, 50) + "..."

            final LinearLayout linearElement = (LinearLayout) view.findViewById(R.id.linearElement);
            linearElement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent = new Intent(activity, MostrarHistoricas.class);
                    intent.putExtra("HISTO", histo);
                    activity.startActivity(intent);
                }
            });
            return view;
        }
    }
    private void annadirSitios() {
        sitios.add(new DatosHistoricas(R.drawable.a3, "Iglesia de Sigchos", "La Iglesia Matriz del Cantón Sigchos tiene una edificación de arte románica, cuenta con una dimensión aproximada de 50m de longitud, por 16m de ancho, el piso del presbiterio es de azulejo que asemeja a piedras naturales, el piso de la nave central de color crema y las paredes son de ladrillo visto. ","Se encuentra ubicada en la cabecera cantonal de Sigchos, a una altitud de 2887 m.s.n.m."));
        sitios.add(new DatosHistoricas(R.drawable.j3, "Proyecto Arqueologico Machay","Se dice que este sitio fue la última morada del Inca Atahualpa luego de la violenta muerta que sufriera en el cusco en manos de los españoles. Machay significa santuario en el que se encuentra  el Malqui (momia) en el sitio se ha encontrado pedazos de cerámica, que datan de la época del pueblo inca.", "se encuentra ubicado al nororiente de la Parroquia Guasaganda, a una hora de La Mana, a una altitud de 957 m.s.n.m."));
        sitios.add(new DatosHistoricas(R.drawable.c3,"Estación del Tren Latacunga","La Estación de Tren es una de las paradas ferroviarias más tradicionales del Ecuador, fue inaugurada el 22 de junio de 1907 con la llegada de un tren que partió desde Quito, actualmente la estación esta restaurada y habilitada, en la ruta de la Avenida de los Volcanes.", "se encuentra ubicado en la Ciudad de Latacunga, parroquia urbana Eloy Alfaro, a una altitud de 2693 m.s.n.m."));
        sitios.add(new DatosHistoricas(R.drawable.d3, "Edificio del Colegio Vicente León","Fue creado por el presidente Juan José Flores  el 7 de mayo de 1840 y fue inaugurado el 24 de mayo de 1977. El conjunto se alza sobre una manzana del centro histórico de la ciudad, a una cuadra del parque del mismo nombre.", "El edificio está ubicado en la calle Belisario Quevedo, entre Padre Manuel Salcedo de la Ciudad de Latacunga a 2786 m.s.n.m."));
        sitios.add(new DatosHistoricas(R.drawable.e3, "Edificio de la Gobernación de Cotopaxi","Es un edificio de dos plantas en el cual se ha utilizado material volcánico como piedra pómez conjuntamente con piedra de agua, adobe y madera. El edificio ha albergado durante los últimos años a las funciones y servicios gubernamentales, principalmente a las oficinas de la Gobernación de Cotopaxi y actualmente se encuentra en proceso de rehabilitación como bien patrimonial.","Se encuentra al costado occidental del Parque Vicente León, entre las calles Quito y General Maldonado de la Ciudad de Latacunga, a una altitud de 2785 m.s.n.m."));
        sitios.add(new DatosHistoricas(R.drawable.f3, "Iglesia de San Agustin","El templo actual se edificó en1850, después de la destrucción de varias edificaciones conocido inicialmente como San Bernabé. En el interior del templo se encuentra un altar con una réplica de la Virgen del Quinche y San Agustín, el altar está construido en madera y pan de oro.","Se encuentra ubicada en la parroquia urbana La Matriz del Cantón Latacunga, a una altitud de 2785 m.s.n.m. en el centro histórico de la ciudad."));
        sitios.add(new DatosHistoricas(R.drawable.g3, "Iglesia La Merced","Es un lugar donde se encuentra la Virgen Protectora de Volcán “Virgen de la Merced”. Su edificación inicio en 1648, mediante la solicitud a Felipe VI, construida sobre el plano de una cruz latina de una sola nave con dos cruceros. El altar está decorado con la técnica de pan de oro, de estilo barroco y bizantino en una de las paredes se encuentra una imagen que representa la protección de la Virgen a la Ciudad de Latacunga. ", "Se encuentra ubicada en la parroquia urbana La Matriz del Cantón Latacunga, a una altitud de 2789 m.s.n.m. en el centro histórico de la ciudad."));
        sitios.add(new DatosHistoricas(R.drawable.h3, "Centro Histórico de Latacunga","El centro histórico de Latacunga es una reunión de elementos constructivos y arquitectónicos coloniales levantados a partir de la conquista española,  nombrado Patrimonio Cultural del Ecuador en 1982. Abarca alrededor de 30 manzanas en torno al parque Vicente León, donde se hallan las edificaciones coloniales y republicanas más antiguas de la ciudad..","Se encuentra en el centro de la ciudad de Latacunga a una altitud de 2786 m.s.n.m."));
        sitios.add(new DatosHistoricas(R.drawable.i3,"Colección de Piezas Arqueológicas del Arq. Germán Albán","Desde más de 20 años se ha ido coleccionando deferentes objetos arquitectónicos encontrados en la zona de La Mana.", "se encuentra ubicado en el centro cantonal de La Mana, a una altitud de 215 m.s.n.m."));

    }
}
