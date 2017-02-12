package com.example.anderson.turismo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by usuario on 2016-12-19.
 */
public class GaleriaParamo extends PagerAdapter {

    private int[] imageResources ={R.drawable.jitio,R.drawable.apahua,R.drawable.cruzblanca,R.drawable.elchivo,R.drawable.ticsijuchi};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public GaleriaParamo(Context c) {

        ctx = c;
    }

    @Override
    public int getCount() {

        return imageResources.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.galeria_paramo,container,false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.slider_paramo);
        TextView textView=(TextView) itemView.findViewById(R.id.imageCount);
        imageView.setImageResource(imageResources[position]);
      //  textView.setText("Imagen Counter :"+position);
        container.addView(itemView);
        return itemView;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {


    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

    return (view==object);

    }
}
