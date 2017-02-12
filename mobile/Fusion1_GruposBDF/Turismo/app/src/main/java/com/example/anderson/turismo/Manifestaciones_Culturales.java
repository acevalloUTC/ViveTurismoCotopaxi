package com.example.anderson.turismo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.ViewSwitcher;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Timer;
import java.util.TimerTask;

public class Manifestaciones_Culturales extends ActionBarActivity {
    TabHost th;
    private ImageSwitcher imageSwitcher, imageSwitcher2, imageSwitcher3, imageSwitcher4;
    private Gallery gallery;

    private int[] gallery1 = {R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e};
    private int[] gallery2 = {R.drawable.a2, R.drawable.b2, R.drawable.c2,
            R.drawable.d2, R.drawable.e2, R.drawable.f2};
    private int[] gallery3 = {R.drawable.a3, R.drawable.j3, R.drawable.c3,
            R.drawable.d3, R.drawable.e3, R.drawable.f3, R.drawable.g3, R.drawable.h3, R.drawable.i3,};
    private int[] gallery4 = {R.drawable.a4, R.drawable.c4, R.drawable.d4,
            R.drawable.e4};

    private int position;
    private int position2;
    private int position3;
    private int position4;

    private static final Integer DURATION = 4550;

    private Timer timer = null;
      /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifestaciones__culturales);
        ActionBar actionBar = getSupportActionBar();
       // actionBar.setDisplayHomeAsUpEnabled(true);
        th = (TabHost) findViewById(R.id.TabHost);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {

            public View makeView() {

                return new ImageView(Manifestaciones_Culturales.this);
            }

        });


        /*Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        imageSwitcher.setInAnimation(fadeIn);
        imageSwitcher.setOutAnimation(fadeOut);*/


        // segundo slider

        imageSwitcher2 = (ImageSwitcher) findViewById(R.id.imageSwitcher2);
        imageSwitcher2.setFactory(new ViewSwitcher.ViewFactory() {

            public View makeView() {
                return new ImageView(Manifestaciones_Culturales.this);
            }
        });


        /*Animation fadeIn2 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation fadeOut2 = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        imageSwitcher2.setInAnimation(fadeIn2);
        imageSwitcher2.setOutAnimation(fadeOut2);*/

        //tercer slider

        imageSwitcher3 = (ImageSwitcher) findViewById(R.id.imageSwitcher3);
        imageSwitcher3.setFactory(new ViewSwitcher.ViewFactory() {

            public View makeView() {
                return new ImageView(Manifestaciones_Culturales.this);
            }
        });


       /* Animation fadeIn3 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation fadeOut3 = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        imageSwitcher3.setInAnimation(fadeIn3);
        imageSwitcher3.setOutAnimation(fadeOut3);*/

        //curto slider

        imageSwitcher4 = (ImageSwitcher) findViewById(R.id.imageSwitcher4);
        imageSwitcher4.setFactory(new ViewSwitcher.ViewFactory() {

            public View makeView() {
                return new ImageView(Manifestaciones_Culturales.this);
            }
        });


        Animation fadeIn4 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation fadeOut4 = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        imageSwitcher4.setInAnimation(fadeIn4);
        imageSwitcher4.setOutAnimation(fadeOut4);

        // tabspects-------<<------------------------------------------>>>>>>>
        //tabspec1
        th.setup();
        TabHost.TabSpec ts1 = th.newTabSpec("Tab1");
        ts1.setIndicator("Acontecimientos");
        ts1.setContent(R.id.tab1);
        th.addTab(ts1);



        //tabspec2
        th.setup();
        TabHost.TabSpec ts2 = th.newTabSpec("Tab2");
        ts2.setIndicator("Etnográficas");
        ts2.setContent(R.id.tab2);

        th.addTab(ts2);

        //tabspec 3
        th.setup();
        TabHost.TabSpec ts3 = th.newTabSpec("Tab3");
        ts3.setIndicator("Históricas");
        ts3.setContent(R.id.tab3);
        th.addTab(ts3);

        //tab4
        //tabspec 3
        th.setup();
        TabHost.TabSpec ts4 = th.newTabSpec("Tab4");
        ts4.setIndicator("Realizaciones");
        ts4.setContent(R.id.tab4);
        th.addTab(ts4);
        start();

        //stop();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void start() {
        if (timer != null) {
            timer.cancel();
        }
        position = 0;
        position2 = 0;
        position3 = 0;
        position4 = 0;
        startSlider();
        startSlider2();
        startSlider3();
        startSlider4();

    }


    /* public void stop() {
         if (timer != null) {
             timer.cancel();
             timer = null;
         }
     }
 */
    public void startSlider() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                // avoid exception:
                // "Only the original thread that created a view hierarchy can touch its views"
                runOnUiThread(new Runnable() {

                    public void run() {
                        imageSwitcher.setImageResource(gallery1[position]);
                        position++;
                        if (position == gallery1.length) {
                            position = 0;
                        }


                    }
                });
            }

        }, 0, DURATION);
    }

    public void startSlider2() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                // avoid exception:
                // "Only the original thread that created a view hierarchy can touch its views"
                runOnUiThread(new Runnable() {
                    public void run() {
                        imageSwitcher2.setImageResource(gallery2[position2]);
                        position2++;
                        if (position2 == gallery2.length) {
                            position2 = 0;
                        }
                    }
                });
            }

        }, 1, DURATION);
    }

    public void startSlider3() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                // avoid exception:
                // "Only the original thread that created a view hierarchy can touch its views"
                runOnUiThread(new Runnable() {
                    public void run() {
                        imageSwitcher3.setImageResource(gallery3[position3]);
                        position3++;
                        if (position3 == gallery3.length) {
                            position3 = 0;
                        }

                    }
                });
            }

        }, 0, DURATION);
    }

    public void startSlider4() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                // avoid exception:
                // "Only the original thread that created a view hierarchy can touch its views"
                runOnUiThread(new Runnable() {
                    public void run() {
                        imageSwitcher4.setImageResource(gallery4[position4]);
                        position4++;
                        if (position4 == gallery4.length) {
                            position4 = 0;
                        }

                    }
                });
            }

        }, 0, DURATION);
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
            startSlider();
            startSlider2();
            startSlider3();
            startSlider4();
        }

    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Manifestaciones_Culturales Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    public void clicBoton (View v) {
        startActivity(new Intent(this, AdaptadorAcontecimientos.class));
    }
    public void clicBoton2 (View v) {
        startActivity(new Intent(this, AdaptadorEtnografia.class));
    }
    public void clicBoton3 (View v) {
        startActivity(new Intent(this, AdaptadorHistorica.class));
    }
    public void clicBoton4 (View v) {
        startActivity(new Intent(this, AdaptadoRealizacion.class));
    }


}
