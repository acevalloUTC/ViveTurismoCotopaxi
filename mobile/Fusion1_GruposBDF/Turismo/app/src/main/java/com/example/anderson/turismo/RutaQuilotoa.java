package com.example.anderson.turismo;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class RutaQuilotoa extends AppCompatActivity {
    Animation traslacion;
    Animation trasparencia;
    Animation rotacion;
    Animation escayambo,ecomplejo;
    public Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    public Button yambobtn,complejo;
    public int j=0;
    Chronometer cr;
    public MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_quilotoa);
         cr=(Chronometer)findViewById(R.id.cho1);
        yambobtn=(Button)findViewById(R.id.btnyambo1);
        ImageView imagen= (ImageView)findViewById(R.id.imageView4);
        complejo=(Button)findViewById(R.id.btncomplejo);
        btn1=(Button)findViewById(R.id.btn1); btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3); btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5); btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7); btn8=(Button)findViewById(R.id.btn8);
        ///ocultar botones
        cr.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE); btn1.setVisibility(View.INVISIBLE); btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE); btn5.setVisibility(View.INVISIBLE); btn6.setVisibility(View.INVISIBLE); btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        traslacion = AnimationUtils.loadAnimation(this, R.anim.traslacion ); rotacion=AnimationUtils.loadAnimation(this, R.anim.rotacion );
        trasparencia=AnimationUtils.loadAnimation(this, R.anim.trasparencia ); escayambo=AnimationUtils.loadAnimation(this, R.anim.escalacionedificio);

        imagen.setAnimation(trasparencia);
        ///iniciarlizar cronometro
        cr.setBase(SystemClock.elapsedRealtime());
        cr.start();
        cr.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                // TODO Auto-generated method stub
                j++;
                if(j==1){btn1.setVisibility(View.VISIBLE);}
                if(j==2){ btn2.setVisibility(View.VISIBLE);btn1.setVisibility(View.INVISIBLE);}
                if(j==3){ btn3.setVisibility(View.VISIBLE); btn2.setVisibility(View.INVISIBLE);}
                if(j==4){btn4.setVisibility(View.VISIBLE);btn3.setVisibility(View.INVISIBLE);}
                if(j==5){btn5.setVisibility(View.VISIBLE);btn4.setVisibility(View.INVISIBLE);}
                if(j==6){btn6.setVisibility(View.VISIBLE);btn5.setVisibility(View.INVISIBLE);}
                if(j==7){btn7.setVisibility(View.VISIBLE);btn6.setVisibility(View.INVISIBLE);}
                if(j==8){btn8.setVisibility(View.VISIBLE);btn7.setVisibility(View.INVISIBLE);}
                if(j==9){btn1.setVisibility(View.VISIBLE);btn8.setVisibility(View.INVISIBLE);}
                if(j==10){ btn2.setVisibility(View.VISIBLE);btn1.setVisibility(View.INVISIBLE);}
                if(j==11){ btn3.setVisibility(View.VISIBLE); btn2.setVisibility(View.INVISIBLE);}
                if(j==12){btn4.setVisibility(View.VISIBLE);btn3.setVisibility(View.INVISIBLE);}
                if(j==13){btn5.setVisibility(View.VISIBLE);btn4.setVisibility(View.INVISIBLE);}
                if(j==14){btn6.setVisibility(View.VISIBLE);btn5.setVisibility(View.INVISIBLE);}
                if(j==15){btn7.setVisibility(View.VISIBLE);btn6.setVisibility(View.INVISIBLE);}
                if(j==16){btn8.setVisibility(View.VISIBLE);btn7.setVisibility(View.INVISIBLE);}
                if(j==17){btn1.setVisibility(View.VISIBLE);btn8.setVisibility(View.INVISIBLE);}
                if(j==18){ btn2.setVisibility(View.VISIBLE);btn1.setVisibility(View.INVISIBLE);}
                if(j==19){ btn3.setVisibility(View.VISIBLE); btn2.setVisibility(View.INVISIBLE);}
                if(j==20){btn4.setVisibility(View.VISIBLE);btn3.setVisibility(View.INVISIBLE);}
                if(j==21){btn5.setVisibility(View.VISIBLE);btn4.setVisibility(View.INVISIBLE);}
                if(j==22){btn6.setVisibility(View.VISIBLE);btn5.setVisibility(View.INVISIBLE);}
                if(j==23){btn7.setVisibility(View.VISIBLE);btn6.setVisibility(View.INVISIBLE);}
                if(j==24){btn8.setVisibility(View.VISIBLE);btn7.setVisibility(View.INVISIBLE);}

                if(j==26){ btn1.setVisibility(View.VISIBLE);}
                if(j==27){ btn2.setVisibility(View.VISIBLE);}
                if(j==28){btn3.setVisibility(View.VISIBLE);}
                if(j==29){btn4.setVisibility(View.VISIBLE);}
                if(j==30){btn5.setVisibility(View.VISIBLE);}
                if(j==31){btn6.setVisibility(View.VISIBLE);}
                if(j==32){btn7.setVisibility(View.VISIBLE);}
                if(j==33){btn8.setVisibility(View.VISIBLE);}






            }
        });
    }


}

