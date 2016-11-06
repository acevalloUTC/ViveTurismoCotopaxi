package com.divisionpoliticaproyecto;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Latacunga extends AppCompatActivity {

    ListView listaPU, listaPR;
    ArrayAdapter<String> adaptadorPU;
    ArrayAdapter<String> adaptadorPR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latacunga);

        //con estas lineas se visualiza el boton atras de la parte superior izquierda
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listaPU = (ListView)findViewById(R.id.lstPU);
        listaPR = (ListView)findViewById(R.id.lstPR);

        String[] PU = new String[]{
                "La Matriz",
                "Eloy Alfaro (San Felipe)",
                "Ignacio Flores (La Laguna)",
                "Juan Montalvo (San Sebastián)",
                "San Buenaventura"
        };

        adaptadorPU = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,PU);
        listaPU.setAdapter(adaptadorPU);

        String[] PR = new String[]{
                "Toacaso",
                "San Juan de Pastocalle",
                "Mulaló",
                "Tanicuchí",
                "Guaytacama",
                "Aláquez",
                "Poaló",
                "Once de Noviembre",
                "Belisario Quevedo",
                "Joseguango Bajo"
        };

        adaptadorPR = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,PR);
        listaPR.setAdapter(adaptadorPR);

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
}
