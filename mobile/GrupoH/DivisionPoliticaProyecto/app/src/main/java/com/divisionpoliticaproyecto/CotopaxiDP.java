package com.divisionpoliticaproyecto;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class CotopaxiDP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotopaxi_dp);

        //con estas lineas se visualiza el boton atras de la parte superior izquierda
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void Latacunga(View view)
    {
        Intent pasar = new Intent(CotopaxiDP.this, LatacungaMenu.class);
        startActivity(pasar);
    }

    public void LaMana(View view)
    {
        Intent pasar = new Intent(CotopaxiDP.this, LaManaMenu.class);
        startActivity(pasar);
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
