package com.example.anderson.informacion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kenshi on 27/11/2016.
 */

public class Tab6 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.tab6, container, false);


       // ListView lista;

       // String[] Destino = new String[]{"Ambato Distancia 41km Tiempo 0h30m", "Azogues Distancia 321 Km. Tiempo 4h0m",
                //"Babahoyo Distancia 253 Km. Tiempo 3h9m", "Cuenca Distancia 362 Km. Tiempo 4h31m", "Esmeraldas Distancia 330 Km.. Tiempo 4h7m", "Guaranda Distancia 133 Km. Tiempo 1h39m", "Guayaquil Distancia-> 316 Km. Tiempo 3h57m",
                //"Ibarra  Distancia 216 Km. Tiempo 2h42m", "Loja Distancia 580 Km. Tiempo 7h15m", "Macas Distancia 287 Km. Tiempo 3h35m", "Machala Distancia 453 Km. Tiempo 5h39m", "Nueva Loja Distancia 339 Km. Tiempo 4h14m", "Portaviejo Distancia 315 Km. Tiempo 3h56m", "Pto. Fco. De Orellana Distancia 395 Km. Tiempo 4h56m", "Puyo Distancia 143 Km. Tiempo 1h47m", "Quito Distancia 70 Km. Tiempo 0h52m",
                //"Riobamba Distancia 105 Km. Tiempo 1h18m", "Tena Distancia 220 Km. Tiempo 2h45m", "Tulcán Distancia 340 Km. Tiempo 4h15m", "Zamora Distancia 637 Km. Tiempo 7h57m", "Aloag Distancia 56 Km. Tiempo 0h42m", "Sto. Domingo Distancia 154 Km. Tiempo 1h55m"
                //, "Baños Distancia 82 Km. Tiempo 1h1m", "Bahía de Caraquez Distancia 375 Km.Tiempo 4h41m", "Baeza Distancia 178 Km. Tiempo 2h13m", "Rumichaca Distancia 344 Km. Tiempo 4h18m", "Caracas Distancia 748 Km. Tiempo 9h21m", "Huaquillas Distancia 513 Km. Tiempo 6h24m", "Manta Distancia 345 Km. Tiempo 4h18m",
               // "Otavalo Distancia 189 Km. Tiempo 2h21m", "Salinas Distancia 488 Km. Tiempo 6h6m", "San Lorenzo Distancia 387 Km. Tiempo 4h50m", "Quevedo Distancia 173 Km. Tiempo 2h9m", "Quininde Distancia 236 Km. Tiempo 2h57m",
               // "Pte. San Miguel Distancia 365 Km. Tiempo 4h33m", "Pto. Putumayo Distancia  523 Km. Tiempo 6h32m", "Pto. Morona Distancia 486 Km. Tiempo  6h4m", "Muisne Distancia 398 Km.Tiempo 4h58m", "Pedernales Distancia 277 Km. Tiempo 3h27m"};

        //lista = (ListView) rootview.findViewById(R.id.l1);

        //ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,Destino);
        //lista.setAdapter(adaptador);
        return rootview;
    }
}

