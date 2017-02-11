package com.example.anderson.informacion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Kenshi on 27/11/2016.
 */

public class Tab5 extends Fragment {
    private TextView Descripcion,Titulo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootview = inflater.inflate(R.layout.tab5, container,false);
        ImageButton botn1 = (ImageButton) rootview.findViewById(R.id.btn1);
        ImageButton botn2 = (ImageButton) rootview.findViewById(R.id.btn2);
        ImageButton botn3 = (ImageButton) rootview.findViewById(R.id.btn3);
        ImageButton botn4 = (ImageButton) rootview.findViewById(R.id.btn4);

        Descripcion = (TextView)rootview.findViewById(R.id.descrip);
        Titulo = (TextView) rootview.findViewById(R.id.titulo);

        Titulo.setText("ALERTA VERDE");
        Descripcion.setText(" El volcán está calmo, en estado latente. Actividad sísmica y fumarólica normal. Se trata el estado de alerta normal para el estado Decepción");


        botn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast1 = Toast.makeText(getContext(), "ALERTA VERDE", Toast.LENGTH_SHORT);
                toast1.show();
                Titulo.setText("ALERTA VERDE");
                Descripcion.setText(" El volcán está calmo, en estado latente. Actividad sísmica y fumarólica normal. Se trata el estado de alerta normal para el estado Decepción");

            }
        });
        botn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast2 = Toast.makeText(getContext(), "ALERTA AMARILLA", Toast.LENGTH_SHORT);
                toast2.show();
                Titulo.setText("ALERTA AMARILLA");
                Descripcion.setText("El volcán está en actividad; es probable que ocurra una erupción. Alza en los niveles de terremotos pequeños detectados a nivel local o en el número de emisiones de gas volcánico");

            }
        });
        botn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast3 = Toast.makeText(getContext(), "ALERTA NARANJA", Toast.LENGTH_SHORT);
                toast3.show();
                Titulo.setText("ALERTA NARANJA");
                Descripcion.setText("Volcán en erupción o la erupción ocurrirá en cualquier momento. Alza en el número o la magnitud de terremotos locales. Posible extrusión de flujos de lava");

            }
        }); botn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast4 = Toast.makeText(getContext(), "ALERTA ROJA", Toast.LENGTH_SHORT);
                toast4.show();
                Titulo.setText("ALERTA ROJA");
                Descripcion.setText("Se establece cuando el evento crece en extensión y severidad y, por tanto, amenaza la vida, salud, bienes y ambiente, requiriendo de una movilización ampliada de los recursos necesarios y disponibles para actuar y mantener el control de la situación.");

            }
        });


        return rootview;
    }
}
