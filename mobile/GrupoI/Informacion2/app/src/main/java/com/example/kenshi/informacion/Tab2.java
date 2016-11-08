package com.example.kenshi.informacion;

/**
 * Created by Kenshi on 05/11/2016.
 */

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;

public class Tab2 extends  Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootview = inflater.inflate(R.layout.tab2, container,false);



              return rootview;
        }

    public void llamada(View tel){
        Intent intent =new Intent(Intent.ACTION_CALL,Uri.parse("tel:+0984355242"));
    startActivity(intent);
    }


}


