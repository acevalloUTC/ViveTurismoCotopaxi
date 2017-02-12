package com.example.anderson.turismo;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private DrawerLayout mDrawerLayout;
    private ExpandableListView mDrawerExpandableList;
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle;

    private List<String> grupos;
    private HashMap<String, List<String>> datosGrupos;
    private int ultimaPosicionExpList = -1;
    private boolean evitarInicio = false;
    private int ultimaMarcaPosicionGrupo = -1;
    private int ultimaMarcaPosicionHijo = -1;
    private MyAdapter adapter;
    int posGroup,posChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerExpandableList = (ExpandableListView) findViewById(R.id.explist_slidermenu);
        mDrawerExpandableList.setGroupIndicator(null);

        View header = getLayoutInflater().inflate(R.layout.cabecera_general, null);
        mDrawerExpandableList.addHeaderView(header, null, false);
        //...y pie de pagina
        View footer = getLayoutInflater().inflate(R.layout.pie_pagina, null);
        mDrawerExpandableList.addFooterView(footer, null, false);

        cargarDatos();

        if (toolbar != null) {
            toolbar.setTitle(mDrawerTitle);
            toolbar.setSubtitle(mTitle);
            //getSupportActionBar().setDisplayShowHomeEnabled(true);
            //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {

            @Override
            public void onDrawerClosed(View view) {

                //getSupportActionBar().setTitle(mDrawerTitle);
                //getSupportActionBar().setSubtitle(mTitle);
                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerOpened(View drawerView) {

                //getSupportActionBar().setTitle("VIVE TURISMO COTOPAXI");
                //getSupportActionBar().setSubtitle("Menu Principal");
                invalidateOptionsMenu();

            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);//Mostrar icono menu animado
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerExpandableList.setTextFilterEnabled(true);

        mDrawerExpandableList.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {

                if (ultimaPosicionExpList != -1 && groupPosition != ultimaPosicionExpList) {
                    //Cuando abrimos un grupo se cierra el anterior que estuviera abierto
                    mDrawerExpandableList.collapseGroup(ultimaPosicionExpList);
                }
                ultimaPosicionExpList = groupPosition;

                abrirUltPosMarc(groupPosition);
            }
        });
        mDrawerExpandableList.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {

                cerrarUltPosMarc(groupPosition);
            }
        });

        //final Intent anita = new Intent(this,Anita.class);
        mDrawerExpandableList.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int i, long l) {

                posGroup=i;
                if((posGroup==2)) {


          //          startActivity(anita);

                }

                if((posGroup==4)) {

                    Toast.makeText(MainActivity.this, "En lace con su proyecto", Toast.LENGTH_SHORT).show();

                }
                return false;
            }
        });

        final Intent pa = new Intent(this,ParamoInicio.class);
        final Intent in = new Intent(this,Sitios_Naturales.class);
        mDrawerExpandableList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {

                posChild=i1;
                if((posGroup==1)&&(posChild==0)) {

                    Toast.makeText(MainActivity.this, "Enlace con su proyecto", Toast.LENGTH_SHORT).show();

                }

                if((posGroup==3)&&(posChild==0)) {
                    startActivity(new Intent(MainActivity.this, Manifestaciones_Culturales.class));
                    Toast.makeText(MainActivity.this, "BIENVENIDO", Toast.LENGTH_SHORT).show();
                   // startActivity(ma);
                }


                if((posGroup==3)&&(posChild==1)) {

                    Toast.makeText(MainActivity.this, "BIENVENIDO", Toast.LENGTH_SHORT).show();
                    startActivity(in);
                }

                if((posGroup==3)&&(posChild==2)) {

                    Toast.makeText(MainActivity.this, "BIENVENIDO", Toast.LENGTH_SHORT).show();
                    startActivity(pa);
                }
                return false;
            }
        });





    }

    private void cargarDatos() {

        grupos = new ArrayList<String>();
        datosGrupos = new HashMap<String, List<String>>();

        grupos.add("Inicio");
        grupos.add("Datos Generales");
        grupos.add("División Política");
        grupos.add("Atractivos Turísticos");
        grupos.add("Mapa Turístico");

        List<String> hijos_grupo1 = new ArrayList<String>();
        //hijos_grupo1.add("Hijo 1 de grupo 1");
        //hijos_grupo1.add("Hijo 2 de grupo 1");

        List<String> hijos_grupo2 = new ArrayList<String>();
        hijos_grupo2.add("Población");
        hijos_grupo2.add("Extensión Territorial");
        hijos_grupo2.add("Rango Altitudinal");
        hijos_grupo2.add("Límites");

        List<String> hijos_grupo3 = new ArrayList<String>();
        //hijos_grupo3.add("Ingresar");

        List<String> hijos_grupo4 = new ArrayList<String>();
        hijos_grupo4.add("Manifestaciones Culturales");
        hijos_grupo4.add("Sitios Naturales");
        hijos_grupo4.add("Paramos Y Rutas");


        List<String> hijos_grupo5 = new ArrayList<String>();
        //hijos_grupo5.add("Ingresar");


        datosGrupos.put(grupos.get(0), hijos_grupo1);
        datosGrupos.put(grupos.get(1), hijos_grupo2);
        datosGrupos.put(grupos.get(2), hijos_grupo3);
        datosGrupos.put(grupos.get(3), hijos_grupo4);
        datosGrupos.put(grupos.get(4), hijos_grupo5);

        adapter = new MyAdapter(this, grupos, datosGrupos);
        mDrawerExpandableList.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void displayView2 (ExpandableListView parent, int groupPosition, int childPosition) {

        int index;
        index = parent.getFlatListPosition(ExpandableListView.getPackedPositionForChild(groupPosition, childPosition));
        parent.setChoiceMode(ExpandableListView.CHOICE_MODE_MULTIPLE);

        parent.setItemChecked(index, true);

        ultimaMarcaPosicionGrupo = groupPosition;
        ultimaMarcaPosicionHijo = childPosition;

    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void displayView1 (int position) {

        Fragment fragment = null;
        mDrawerExpandableList.setChoiceMode(ExpandableListView.CHOICE_MODE_MULTIPLE);
        int childCount = mDrawerExpandableList.getChildCount();



        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_container, fragment).commit();

            mDrawerExpandableList.setSelection(position);
            //setTitle(grupos.get(position));
            getSupportActionBar().setTitle(mDrawerTitle);
            getSupportActionBar().setSubtitle(mTitle);
            mDrawerLayout.closeDrawer(mDrawerExpandableList);
        } else {
            Log.e("Aviso", "Error cuando se crea el fragment");
        }
    }

    private void abrirUltPosMarc (int groupPosition) {

        if (groupPosition == ultimaMarcaPosicionGrupo) {
            if (ultimaMarcaPosicionHijo != -1) {
                int index = mDrawerExpandableList.getFlatListPosition(ExpandableListView.getPackedPositionForChild(ultimaMarcaPosicionGrupo, ultimaMarcaPosicionHijo));
                mDrawerExpandableList.setItemChecked(index, true);
            } else {
                int index = mDrawerExpandableList.getFlatListPosition(ExpandableListView.getPackedPositionForGroup(ultimaMarcaPosicionGrupo));
                mDrawerExpandableList.setItemChecked(index, true);
            }
        } else {
            if (mDrawerExpandableList.isGroupExpanded(ultimaMarcaPosicionGrupo)){
                if (ultimaMarcaPosicionHijo != -1) {
                    int index = mDrawerExpandableList.getFlatListPosition(ExpandableListView.getPackedPositionForChild(ultimaMarcaPosicionGrupo, ultimaMarcaPosicionHijo));
                    mDrawerExpandableList.setItemChecked(index, true);
                } else {
                    int index = mDrawerExpandableList.getFlatListPosition(ExpandableListView.getPackedPositionForGroup(ultimaMarcaPosicionGrupo));
                    mDrawerExpandableList.setItemChecked(index, true);
                }
            } else {
                mDrawerExpandableList.setItemChecked(-1, true);
            }
        }
    }



    private void cerrarUltPosMarc (int groupPosition) {

        if (groupPosition == ultimaMarcaPosicionGrupo) {
            if (ultimaMarcaPosicionGrupo != -1){
                int index = mDrawerExpandableList.getFlatListPosition(ExpandableListView.getPackedPositionForGroup(ultimaMarcaPosicionGrupo));
                mDrawerExpandableList.setItemChecked(index, true);
            } else {
                mDrawerExpandableList.setItemChecked(-1, true);
            }
        } if (mDrawerExpandableList.isGroupExpanded(ultimaMarcaPosicionGrupo)){
            if (ultimaMarcaPosicionHijo != -1){
                int index = mDrawerExpandableList.getFlatListPosition(ExpandableListView.getPackedPositionForChild(ultimaMarcaPosicionGrupo, ultimaMarcaPosicionHijo));
                mDrawerExpandableList.setItemChecked(index, true);
            } else {
                int index = mDrawerExpandableList.getFlatListPosition(ExpandableListView.getPackedPositionForGroup(ultimaMarcaPosicionGrupo));
                mDrawerExpandableList.setItemChecked(index, true);
            }
        } else {
            mDrawerExpandableList.setItemChecked(-1, true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    public boolean onKeyDown (int keycode, KeyEvent event){

        if (keycode == KeyEvent.KEYCODE_MENU) {
            if (mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                mDrawerLayout.closeDrawer(Gravity.LEFT);
            } else {
                mDrawerLayout.openDrawer(Gravity.LEFT);
            }
            return true;
        }else{
            return super.onKeyDown(keycode, event);
        }
    }

    @Override
    public void onBackPressed() {

        if(mDrawerLayout.isDrawerOpen(Gravity.LEFT)){
            mDrawerLayout.closeDrawer(Gravity.LEFT);
        }else{
            super.onBackPressed();
        }
    }
}

