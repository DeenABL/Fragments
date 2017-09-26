package com.netaq.secondfragmentpractice;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Deena on 16/07/2017.
 */

public class CustomSwipeAdapter extends PagerAdapter {
        private int[] icons={R.drawable.img1,R.drawable.img2,R.drawable.img4,R.drawable.img5 ,R.drawable.x};
        private Context ctx;
        private LayoutInflater inflater;
        View view;
    ImageView image;
    public  CustomSwipeAdapter(Context ctx)
    {
        this.ctx= ctx;
    }


    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= inflater.inflate(R.layout.first_fragment,container,false);
        image= (ImageView) view.findViewById(R.id.frag1_img);
        image.setImageResource(icons[position]);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);


    }

}
