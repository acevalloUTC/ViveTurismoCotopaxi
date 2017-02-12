package com.divisionpoliticaproyecto;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class CotopaxiDP extends AppCompatActivity {

    Button sigchos, lamana, latacunga, saquisili, pujili, salcedo, pangua;

    private static final Integer DURATION = 2500;

    private Timer timer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotopaxi_dp);

        //con estas lineas se visualiza el boton atras de la parte superior izquierda
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        sigchos = (Button)findViewById(R.id.sigchosID);
        lamana = (Button)findViewById(R.id.lamanaID);
        latacunga = (Button)findViewById(R.id.latacungaID);
        saquisili = (Button)findViewById(R.id.saquisiliID);
        pujili = (Button)findViewById(R.id.pujiliID);
        salcedo = (Button)findViewById(R.id.salcedoID);
        pangua = (Button)findViewById(R.id.panguaID);

        startAnimacion(null);
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

    public void Salcedo(View view)
    {
        Intent pasar = new Intent(CotopaxiDP.this, SalcedoMenu.class);
        startActivity(pasar);
    }

    public void Pujili(View view)
    {
        Intent pasar = new Intent(CotopaxiDP.this, PujiliMenu.class);
        startActivity(pasar);
    }

    public void Saquisili(View view)
    {
        Intent pasar = new Intent(CotopaxiDP.this, SaquisiliMenu.class);
        startActivity(pasar);
    }

    public void Pangua(View view)
    {
        Intent pasar = new Intent(CotopaxiDP.this, PanguaMenu.class);
        startActivity(pasar);
    }

    public void Sigchos(View view)
    {
        Intent pasar = new Intent(CotopaxiDP.this, SigchosMenu.class);
        startActivity(pasar);
    }

    /**
     * animacion de las banderas
     */
    public void Ampliar(View view) {
        Animation ampliar;
        ampliar = AnimationUtils.loadAnimation(this,R.anim.ampliar);
        ampliar.reset();
        sigchos.startAnimation(ampliar);
        lamana.startAnimation(ampliar);
        pangua.startAnimation(ampliar);
        salcedo.startAnimation(ampliar);
        saquisili.startAnimation(ampliar);
        pujili.startAnimation(ampliar);
        latacunga.startAnimation(ampliar);
    }

    public void startAnimacion(View view) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                // avoid exception:
                // "Only the original thread that created a view hierarchy can touch its views"
                runOnUiThread(new Runnable() {
                    public void run() {
                        Ampliar(null);
                    }
                });
            }

        }, 1000, DURATION);//duracion de cada imagen
    }

    // Stops the slider when the Activity is going into the background
    @Override
    protected void onPause() {
        super.onPause();
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (timer != null) {
            startAnimacion(null);
        }

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
