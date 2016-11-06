package com.divisionpoliticaproyecto;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class Latacunga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latacunga);

        //con estas lineas se visualiza el boton atras de la parte superior izquierda
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
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
