package com.divisionpoliticaproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MenuCantones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cantones);

        ListView lista = (ListView)findViewById(R.id.listaCantones);
    }
}
