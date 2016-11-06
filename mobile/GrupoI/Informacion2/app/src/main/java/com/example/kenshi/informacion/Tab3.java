package com.example.kenshi.informacion;

/**
 * Created by Kenshi on 05/11/2016.
 */

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

public class Tab3 extends  Fragment {
    String mc1 = "Manifestación Cultural";
    String mc2 = "El núcleo de la cultura popular ecuatoriana es lo religioso mesclado con tradiciones aborígenes: centro de su sistema planetario a cuyo alrededor giran las costumbres, el turismo, las tradiciones en cuya esencia viven las tradiciones.";
    String sn1 = "Sitio Natural";
    String sn2 = "Un paisaje es la extensión de un terreno que se observa desde un determinado lugar y que estará conformado por las características naturales del entorno en cuestión como asimismo por la intervención del ser humano sobre el mismo, construcciones, daños ambientales, entre otras.";
    String pa1="Parapente";
    String pa2="El ala, y a veces todo el equipo, se llama así con el mismo nombre, parapente. La definición técnica sería algo así: planeador ligero flexible. Planeador porque no consta de motor y flexible porque no hay partes rígidas que compongan el ala, por lo que puede ser transportado en el maletero de un coche. ";
    String ji1="Juegos Infantiles";
    String ji2="Un espacio de recreación o una zona de juegos es un espacio público especialmente acondicionado para la realización de actividades recreativas libres, particularmente orientadas a los niños, y que incluyen juegos infantiles tales como columpios (o hamacas), toboganes, balancines (o subeybaja), tiovivos (o calesitas), etc";
    String es1="Escalada";
    String es2="La escalada, en montañismo, es una actividad que consiste en realizar ascensos sobre paredes de fuerte pendiente, valiéndose de la fuerza física y mental propia. Se considera escalada todo ascenso ya sea fácil, difícil o imposible de realizar (según el estado físico de la persona) con las extremidades inferiores (pies y piernas; en algunos casos también se podría llegar a utilizar la rodilla, por si hubiera alguna pared al lado) y las extremidades superiores (brazos y manos). ";
    String ag1="Agroturismo";
    String ag2="Agroturismo es un concepto que se forma a partir de dos términos: agro y turismo. En el primer caso, se trata de un elemento compositivo que alude al campo (un terreno no urbanizado donde se pueden realizar cultivos y criar animales). Turismo, por su parte, es aquello vinculado a los viajes que se llevan a cabo por ocio.";
    String re1="Restaurant";
    String re2="Un restaurante es un establecimiento comercial, en el mayor de los casos público, donde se paga por la comida y bebida para ser consumidas en el mismo local. Hoy en día existe una gran variedad de modalidades de servicio y tipos de cocina.";
    String vo1="Volcán";
    String vo2="La palabra volcán proviene de Vulcano. Se trata de un conducto que establece comunicación directa entre la superficie terrestre y los niveles profundos de la corteza terrestre. Los volcanes son aberturas que se encuentran en montañas o en la tierra; cada un cierto periodo de tiempo, expulsan lava, gases, cenizas y humo.";
    String co1="Colinas- Nevados";
    String co2="Un cerro o colina es una eminencia del terreno que, en general, no supera los 100 metros desde la base hasta la cima. Sin embargo, en algunos países de Sudamérica y Centroamérica se nombran como cerros algunos picos que incluso superan los 3.000 m de altitud.";
    String at1="Aguas termales";
    String at2="Estas aguas proceden de capas subterráneas de la Tierra que se encuentran a mayor temperatura, las cuales son ricas en diferentes componentes minerales y permiten su utilización en la terapéutica como baños, inhalaciones, irrigaciones, y calefacción. (ver Hidroterapia).";
    String ap1="Áreas protegidas";
    String ap2="Las áreas protegidas son espacios creados por la sociedad en su conjunto, articulando esfuerzos que garanticen la vida animal y vegetal en condiciones de bienestar, es decir, la conservación de la biodiversidad, así como el mantenimiento de los procesos ecológicos necesarios para su preservación y el desarrollo del ser humano.";
    String ca1="Cascada";
    String ca2="Se llama cascada, caída, catarata, salto de agua o caída de agua gigante al tramo de un curso fluvial donde, por causa de un fuerte desnivel del lecho o cauce, el agua cae verticalmente por efecto de la gravedad. Las caídas de agua se consideran uno de los fenómenos más bellos de la naturaleza.";
    String gr1="Gruta";
    String gr2="Una gruta es una cavidad de buen tamaño que se forma bajo la tierra, cuando el agua de la lluvia se filtra entre las rocas calcáreas, y las va disolviendo en un proceso que dura miles de años. En su origen, el agua se introduce en las pequeñas fisuras de las rocas que al agrandarse poco a poco, llegan a formar profundos agujeros. Las formas irregulares son la característica principal de estos lugares, compuestos por estalactitas y estalagmitas, que son acumulaciones de sales minerales que suelen hallarse en el interior de la gruta. ";
    String la1="Lago";
    String la2="Un lago (del latín: lacus) es un cuerpo de agua, generalmente dulce, de una extensión considerable, que se encuentra separado del mar. El aporte de agua a todos los lagos viene de los ríos, de aguas freáticas y precipitación sobre el espejo del agua.";
    String mi1="Mirador";
    String mi2="Desde los miradores (naturales o artificiales) pueden admirarse diferentes paisajes como entornos urbanos, industriales, rurales, paisajes naturales o geográficos, etcétera, y también para la observación de aves.";
    String hc1="Hacienda Colonial";
    String hc2="La hacienda es una forma de organización económica típica del sistema colonial español, que se mantuvo en Iberoamérica hasta las reformas agrarias de la segunda mitad del siglo XX. El término se utiliza para describir un latifundio de producción mixta agrícola-ganadera. Como modelo de organización agropecuaria y social, procede de la hacienda andaluza, cuyo modelo se empleó en América a partir de mediados del siglo XVII. ";
    String ch1="Centro Histórico";
    String ch2="Se denomina centro histórico al núcleo urbano original de planeamiento y construcción de un área urbana, generalmente el de mayor atracción social, económica, política y cultural, que se caracteriza por contener los bienes vinculados con la historia de una determinada ciudad, a partir de la cultura que le dio origen, y de conformidad en los términos de la declaratoria respectiva o por determinación de la ley.";
    String aa1="Artesanía De Los Andes";
    String aa2="Observados desde la altura, los Andes ecuatorianos despliegan un collage de colores, como si la naturaleza hubiese tejido sobre ellos su propio tapiz. Una mirada más cercana, en cambio, nos revela que este sorprendente panorama no es sólo una expresión de la naturaleza, sino también resultado del trabajo del hombre.";
    String ig1="Iglesia";
    String ig2="El término ecclesĭa, cuyo origen se remonta a un vocablo griego que significa “asamblea”, permite nombrar al templo cristiano. Se trata de la edificación donde se desarrollan servicios religiosos públicos y se presentan imágenes o reliquias que son adoradas por los fieles. Por ejemplo: “Todos los domingos por la mañana voy a la iglesia a pedir por la salud de mi madre”, “Nos vemos esta tarde en la puerta de la iglesia”";
    String mu1="Museo";
    String mu2="Del latín musēum, un museo es un lugar donde se guardan y exhiben colecciones de objetos de interés artístico, cultural, científico, histórico, etc. Suelen ser gestionados por instituciones sin ánimo de lucro que intentan difundir los conocimientos humanos.";
    String za1="Zona Arqueológica Andes";
    String za2="En la sierra ecuatoriana se pueden distinguir siete grandes culturas, estas son: los Caranquis, Yumbos, Kitus, Panzaleos, Puruháes, Cañaris y Paltas.";
    String zc1="Zona Arqueológica Costa";
    String zc2="La creencia popular es que los costeños son abiertos, efusivos, excelentes bailarines y alegres, en oposición a los serranos, quienes tienden a ser más reservados y con círculos sociales más íntimos y reducidos. En general, los costeños proyectan un estilo de vida hacia el exterior, esta situación es más notoria entre más baja sea la clase social, ahí son más comunes las tertulias callejeras o los juegos de mesa en los sardineles de las casas.";
    String to1="Tola";
    String to2="Fue de particular interés para el investigador colombiano quien llamó a éstos restos “basureros precolombinos” hallar partículas de oro de formas variadas y caprichosas combinadas con fragmentos de hilados para la industria textil, estos dan evidencias de los sobrantes de las labores artísticas realizadas por la gente de ésta cultura.";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.tab3, container, false);


        ImageButton btnLanzarActivity = (ImageButton) rootview.findViewById(R.id.btn1);
        ImageButton botn2 = (ImageButton) rootview.findViewById(R.id.btn2);
        ImageButton botn3 = (ImageButton) rootview.findViewById(R.id.btn3);
        ImageButton botn4 = (ImageButton) rootview.findViewById(R.id.btn4);
        ImageButton botn5 = (ImageButton) rootview.findViewById(R.id.btn5);
        ImageButton botn6 = (ImageButton) rootview.findViewById(R.id.btn6);
        ImageButton botn7 = (ImageButton) rootview.findViewById(R.id.btn7);
        ImageButton botn8 = (ImageButton) rootview.findViewById(R.id.btn8);
        ImageButton botn9 = (ImageButton) rootview.findViewById(R.id.btn9);
        ImageButton botn10 = (ImageButton) rootview.findViewById(R.id.btn10);
        ImageButton botn11= (ImageButton) rootview.findViewById(R.id.btn11);
        ImageButton botn12 = (ImageButton) rootview.findViewById(R.id.btn12);
        ImageButton botn13 = (ImageButton) rootview.findViewById(R.id.btn13);
        ImageButton botn14 = (ImageButton) rootview.findViewById(R.id.btn14);
        ImageButton botn15 = (ImageButton) rootview.findViewById(R.id.btn15);
        ImageButton botn16= (ImageButton) rootview.findViewById(R.id.btn16);
        ImageButton botn17 = (ImageButton) rootview.findViewById(R.id.btn17);
        ImageButton botn18 = (ImageButton) rootview.findViewById(R.id.btn18);
        ImageButton botn19 = (ImageButton) rootview.findViewById(R.id.btn19);
        ImageButton botn20 = (ImageButton) rootview.findViewById(R.id.btn20);
        ImageButton botn21 = (ImageButton) rootview.findViewById(R.id.btn21);
        ImageButton botn22 = (ImageButton) rootview.findViewById(R.id.btn22);
        ImageButton botn23 = (ImageButton) rootview.findViewById(R.id.btn23);


        btnLanzarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast1 = Toast.makeText(getContext(), "Manifestación Cultural", Toast.LENGTH_SHORT);
                toast1.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", mc1);
                intent.putExtra("valor2", mc2);
                startActivity(intent);
            }
        });

        botn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast2 = Toast.makeText(getContext(), "Sitio Natural", Toast.LENGTH_SHORT);
                toast2.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", sn1);
                intent.putExtra("valor2", sn2);
                startActivity(intent);
            }
        });

        botn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast3 = Toast.makeText(getContext(), "Parapente", Toast.LENGTH_SHORT);
                toast3.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", pa1);
                intent.putExtra("valor2", pa2);
                startActivity(intent);
            }
        });

        botn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast4 = Toast.makeText(getContext(), "Juegos Infantiles", Toast.LENGTH_SHORT);
                toast4.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", ji1);
                intent.putExtra("valor2", ji2);
                startActivity(intent);
            }
        });

        botn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast5 = Toast.makeText(getContext(), "Escalada", Toast.LENGTH_SHORT);
                toast5.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", es1);
                intent.putExtra("valor2", es2);
                startActivity(intent);
            }
        });

        botn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast6 = Toast.makeText(getContext(), "Agroturismo", Toast.LENGTH_SHORT);
                toast6.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", ag1);
                intent.putExtra("valor2", ag2);
                startActivity(intent);
            }
        });

        botn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast7 = Toast.makeText(getContext(), "Restaurant", Toast.LENGTH_SHORT);
                toast7.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", re1);
                intent.putExtra("valor2", re2);
                startActivity(intent);
            }
        });

        botn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast8 = Toast.makeText(getContext(), "Volcán", Toast.LENGTH_SHORT);
                toast8.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", vo1);
                intent.putExtra("valor2", vo2);
                startActivity(intent);
            }
        });

        botn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast9 = Toast.makeText(getContext(), "Colinas- Nevados", Toast.LENGTH_SHORT);
                toast9.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", co1);
                intent.putExtra("valor2", co2);
                startActivity(intent);
            }
        });
        botn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast10 = Toast.makeText(getContext(), "Aguas Termales", Toast.LENGTH_SHORT);
                toast10.show();
                Intent intent = new Intent(getActivity(), Naturales.class);
                intent.putExtra("valor1", at1);
                intent.putExtra("valor2", at2);
                startActivity(intent);
            }
        });


        return rootview;

    }




}

