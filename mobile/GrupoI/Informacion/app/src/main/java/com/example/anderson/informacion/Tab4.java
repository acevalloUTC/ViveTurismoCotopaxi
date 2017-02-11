package com.example.anderson.informacion;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Tab4 extends  Fragment {


  Button lata,puji,sigch,manas,pang,salc,saqi;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootview = inflater.inflate(R.layout.tab4, container,false);

        lata=(Button)rootview.findViewById(R.id.butlata);
        puji=(Button)rootview.findViewById(R.id.butpuji);
        sigch=(Button)rootview.findViewById(R.id.butsigch);
        saqi=(Button)rootview.findViewById(R.id.butsaquisili);
        salc=(Button)rootview.findViewById(R.id.butsalcedo);
        pang=(Button)rootview.findViewById(R.id.butpangua);
        manas=(Button)rootview.findViewById(R.id.butmana);



         /*mana.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Toast.makeText(getContext(),"FIESTAS DE LA MANA",Toast.LENGTH_SHORT).show();

                 Intent pasar = new Intent(getActivity(),Mana.class);
                 startActivity(pasar);


             }
         });*/
        manas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"FIESTAS DE LA MANA",Toast.LENGTH_SHORT).show();

//diegito el toas si sale pero no pasa al otro activiti reviseleeeeeee xfavorrrrrsitoooooo

            }
        });

         pang.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Toast.makeText(getContext(),"FIESTAS DE PANGUA",Toast.LENGTH_SHORT).show();

                 Intent pasar = new Intent(getActivity(), Pangua.class);
                 startActivity(pasar);


             }
         });


         salc.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Toast.makeText(getContext(),"FIESTAS DE SALCEDO",Toast.LENGTH_SHORT).show();

                 Intent pasar = new Intent(getActivity(), Salcedo.class);
                 startActivity(pasar);


             }
         });


        saqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"FIESTAS DE SAQUISILI",Toast.LENGTH_SHORT).show();

                Intent pasar = new Intent(getActivity(), Saquisili.class);
                startActivity(pasar);

            }
        });


        sigch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"FIESTAS DE SIGCHOS",Toast.LENGTH_SHORT).show();

                Intent pasar = new Intent(getActivity(), Sigchos.class);
                startActivity(pasar);

            }
        });


        puji.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"FIESTAS DE PUJILI",Toast.LENGTH_SHORT).show();
                Intent pasar = new Intent(getActivity(), Pujili.class);
                startActivity(pasar);

            }
        });


        lata.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(),"FIESTAS DE LATACUNGA",Toast.LENGTH_SHORT).show();
        Intent pasar = new Intent(getActivity(),Latacun.class);
        startActivity(pasar);


    }
});




        return rootview;
    }








}

