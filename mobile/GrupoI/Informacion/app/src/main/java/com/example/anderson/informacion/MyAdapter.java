package com.example.anderson.informacion;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Anderson Carrera on 21/11/16..
 */
public class MyAdapter extends BaseExpandableListAdapter{

    private final Context _context;
    private List<String> _grupos, temp_hijos;
    private HashMap<String, List<String>> _datosGrupos;

    public MyAdapter(Context _context, List<String> _grupos, HashMap<String, List<String>> _datosGrupos) {
        this._context = _context;
        this._grupos = _grupos;
        this._datosGrupos = _datosGrupos;
    }

    @Override
    public int getGroupCount() {
        return this._grupos.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this._datosGrupos.get(this._grupos.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this._grupos.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this._datosGrupos.get(this._grupos.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String headerTitle = (String) getGroup(groupPosition);
        ImageView image = null;//Declaramos un nuevo indicador de la flecha desplegable que figurará a la derecha

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.fila_grupo, null);
        }
        if (groupPosition == 0) {
            //((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.mipmap.ic_launcher);

        } else if (groupPosition == 1) {
            //((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.mipmap.ic_launcher);
            //((TextView) convertView.findViewById(R.id.text2)).setText("Ver..??");
        } else if (groupPosition == 2) {
            //((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.mipmap.ic_launcher);
            //((TextView) convertView.findViewById(R.id.text2)).setText("Ver..??");
        } else if (groupPosition == 3) {
            //((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.mipmap.ic_launcher);
            //((TextView) convertView.findViewById(R.id.text2)).setText("Ver..??");

    } else if (groupPosition == 4) {
        //((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.mipmap.ic_launcher);
        //((TextView) convertView.findViewById(R.id.text2)).setText("Ver..??");

    } else if (groupPosition == 5) {
        //((ImageView) convertView.findViewById(R.id.image2)).setImageResource(R.mipmap.ic_launcher);
        //((TextView) convertView.findViewById(R.id.text2)).setText("Ver..??");
    }

        TextView b = (TextView) convertView.findViewById(R.id.text1);

        int valor = 0;
        //A continuación vamos a asignar el nº de elementos que hay en cada grupo
        valor = this._datosGrupos.get(this._grupos.get(groupPosition)).size();
        b.setTypeface(null, Typeface.BOLD);

        image = (ImageView) convertView.findViewById(R.id.expandableIcon);

        if (groupPosition != 0) {
            int imageResourceId = isExpanded ? android.R.drawable.arrow_up_float : android.R.drawable.arrow_down_float;
            image.setImageResource(imageResourceId);
            //Grupos distintos al 1 mostrarían el indicador flecha
            image.setVisibility(View.VISIBLE);
            b.setText(headerTitle);//Mostraríamos título + nº elementos en grupos con indicador flecha
           //+ " (" + Integer.toString(valor) + ")"
        } else {
            //No mostramos el indicador flecha en grupo 1
            image.setVisibility(View.INVISIBLE);
            b.setText(headerTitle);//Título en grupo 1
        }

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        final String childText = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.fila_hijo_grupo, null);
        }


        int valor = 0;
        valor = this._datosGrupos.get(this._grupos.get(groupPosition)).size();
        for(int x = 0; x < valor; x++){
            //((ImageView) convertView.findViewById(R.id.img_hijo)).setImageResource(R.mipmap.ic_launcher);
        }

        TextView a = (TextView) convertView.findViewById(R.id.lblListItem);
        a.setText(childText);


        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
