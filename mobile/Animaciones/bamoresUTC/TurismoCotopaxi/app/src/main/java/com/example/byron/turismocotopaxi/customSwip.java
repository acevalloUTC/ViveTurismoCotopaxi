package com.example.byron.turismocotopaxi;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by BYRON on 17/11/2016.
 */
public class customSwip extends PagerAdapter {
    private  int[] image_resourses={R.drawable.slider_uno, R.drawable.slider_dos, R.drawable.slider_tres};
    private Context ctx;
    private LayoutInflater  layoutInflater;


    public customSwip(Context c){
        ctx=c;

    }
    @Override
    public int getCount()
    {
        return image_resourses.length;
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.activity_custom_swip,container,false);
        ImageView imageView = (ImageView)item_view.findViewById(R.id.swip_image_view);
        ///TextView textView = (TextView)item_view.findViewById(R.id.image_count);
        imageView.setImageResource(image_resourses[position]);
        // textView.setText("<<==Atras"     +position+   "  Adelante==>>");
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==object);
    }
}
