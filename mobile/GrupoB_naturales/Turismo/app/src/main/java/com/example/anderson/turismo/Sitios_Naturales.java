package com.example.anderson.turismo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Sitios_Naturales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios__naturales);

    }

public void agu(View view){
    Intent agua = new Intent(this,Aguas.class);
    startActivity(agua);
}


    public void fenom(View view){
        Intent fenom = new Intent(this,Fenomenos.class);
        startActivity(fenom);
    }

    public void mont(View view){
        Intent mont = new Intent(this,Montanas.class);
        startActivity(mont);
    }

    public void rios(View view){
        Intent rios = new Intent(this,Rios.class);
        startActivity(rios);
    }


    public void areas(View view){
        Intent areas = new Intent(this,Areas.class);
        startActivity(areas);
    }


}
