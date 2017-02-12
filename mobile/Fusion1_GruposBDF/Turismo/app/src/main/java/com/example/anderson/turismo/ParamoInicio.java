package com.example.anderson.turismo;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;

public class ParamoInicio extends AppCompatActivity {
    ViewPager viewPager, viewPager1;

    GaleriaParamo GaleriaParamo;
    GaleriaRuta      GaleriaRuta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paramo_inicio);

        Resources res= getResources();
        TabHost tabs =(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();


       /// SLIDER PARAMO
        TabHost.TabSpec spec=tabs.newTabSpec("Mi tab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("PÁRAMO",res.getDrawable(android.R.drawable.ic_btn_speak_now));
        tabs.addTab(spec);

        viewPager=(ViewPager) findViewById(R.id.vista_paramo);
        GaleriaParamo =new GaleriaParamo(this);
        viewPager.setAdapter(GaleriaParamo);


        //SLIDER RUTA
        spec=tabs.newTabSpec("2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("RUTAS",res.getDrawable(android.R.drawable.ic_dialog_map));
        tabs.addTab(spec);


        viewPager1=(ViewPager) findViewById(R.id.vista_ruta);
        GaleriaRuta=new GaleriaRuta(this);
        viewPager1.setAdapter(GaleriaRuta);


        tabs.setCurrentTab(0);


    }
    public void irparamo(View v){
        Intent pregunta1=new Intent (this,GaleriaParamosFi.class);
        startActivity(pregunta1);
    }
    public void irruta(View v){
        Intent pregunta2=new Intent (this,Rutaprincipal.class);
        startActivity(pregunta2);
    }


}
