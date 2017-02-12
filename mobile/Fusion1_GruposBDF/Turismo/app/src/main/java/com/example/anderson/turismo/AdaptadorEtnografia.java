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

public class AdaptadorEtnografia  extends AppCompatActivity {
    Intent intent;
    Bundle bundle;
    DatosEtnografia sitio;
    private ArrayList<DatosEtnografia> sitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_etno);

        ListView list = (ListView)findViewById(R.id.listviewEtno);
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
        private ArrayList<DatosEtnografia> sitios;

        public MyListAdapter(Activity activity, ArrayList<DatosEtnografia> sitios) {
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
            View view = inflater.inflate(R.layout.list_item_etnograficas, null, true);

            final DatosEtnografia etno = sitios.get(position);
            ImageView image = (ImageView) view.findViewById(R.id.imagenListSitiosEtno);
            TextView tvTitulo = (TextView) view.findViewById(R.id.txtListTituloEtno);
            TextView tvUbicacion = (TextView) view.findViewById(R.id.txtListUbicacionEtno);

            image.setImageResource(etno.getImagen());
            tvTitulo.setText(etno.getTitulo());
            tvUbicacion.setText(etno.getUbicacion());//.substring(0, 50) + "..."

            final LinearLayout linearElement = (LinearLayout) view.findViewById(R.id.linearElement);
            linearElement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    intent = new Intent(activity, MostrarEtnografia.class);
                    intent.putExtra("ETNO", etno);
                    activity.startActivity(intent);
                }
            });
            return view;
        }
    }
    private void annadirSitios() {
        sitios.add(new DatosEtnografia(R.drawable.a2, "Gastronomía Típica de Pujilí","Uno de los principales platos es el hornado que viene acompañado de tostado, plátano maduro, mote y tortillas de papa su precio varía entre USD 3.00 y USD 5.00, este plato se lo encuentra los días sábados y domingos en el mercado central.", "Se encuentra ubicado en el centro de canton Pujili"));
        sitios.add(new DatosEtnografia(R.drawable.b2, "Festividades del Corpus Christi", "Las octavas del Corpus Christi es una celebración de fondo religioso, de gran significancia para el mundo católico.  A la llegada de los españoles con el objeto de evangelizar a los indígenas se fusionaron las fiestas aborígenes del Inti Raymi con el Corpus Christi que se lleva a cabo 60 días después de la pascua de Resurrección.","Se lleva a cabo en el centro del cantón Pujili, a 10 km de Latacunga, a una altitud de 2956 m.s.n.m."));
        sitios.add(new DatosEtnografia(R.drawable.c2, "Reencuentro Panguense","Desde 1989 el 10 de agosto de cada año, se realiza el evento  denominado el Reeencuentro Panguense, el cual hace referencia a que se debe volver esta es una fecha en que todos quienes emigraron a otras ciudades regresan para celebrar las fiestas de su Cantón.","La fiesta se lleva a cabo en la cabecera cantonal de Pangua, Parroquia el Corazón."));
        sitios.add(new DatosEtnografia(R.drawable.d2, "Feria de Zumbahua","La feria de Zumbahua es el lugar donde se puede observar la expresión cultural local, a través de la gente que participa en ella desde tempranas horas de la mañana, especialmente en la plaza Rumiñahui donde se concentran los comerciantes para la compra y venta de productos, entre  los principales se encuentran las papas y cebolla.","Se encuentra ubicado a 52 km del Cantón Pujili, en la Parroquia Zumbahua, a una altitud de 3377 m.s.n.m." ));
        sitios.add(new DatosEtnografia(R.drawable.e2, "Galerias Artesanales de Tigua", "En este sitio se pueden adquirir algunos tipos de artesanías como: cuadros pintados en cuero de borrego con paisajes del sector y leyendas tradicionales, como la del Cóndor Enamorado, máscaras de madera con figuras de animales como: perros, lobos y diablos, con vistosos colores, así como también gorras, guantes, bufandas, tejidos en lana.","Se encuentra ubicado a 10 km de Zumbahua en la vía Zumbahua Pujili."));
        sitios.add(new DatosEtnografia(R.drawable.f2, "Alfarería La Victoria", "La mayoría de artesanos de la cerámica en la Parroquia tiene una historia de herencia familiar en cuanto a la elaboración de objetos de barro, ya que las técnicas del trabajo con el barro han sido transmitidas por medio de la observación y la practica al ayudar en los talleres familiares.", "Se encuentra ubicada a 3 km de la ciudad de Pujili, en la Parroquia La Victoria, a una altitud de 3008 m.s.m.n."));
         }

}


