package com.example.anderson.turismo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Rutaprincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutaprincipal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void irparque(View v){
        Intent pregunta2=new Intent (this,ParqueCoto.class);
        startActivity(pregunta2);
    }
    public void irpuza(View v){
        Intent pregunta2=new Intent (this,RutaPutzalahua.class);
        startActivity(pregunta2);
    }
    public void irquilo(View v){
        Intent pregunta3=new Intent (this,RutaQuilotoa.class);
        startActivity(pregunta3);
    }
    public void iramorak(View v){
        Intent pregunta4=new Intent (this,RutaAmarok.class);
        startActivity(pregunta4);
    }
}