package com.netaq.secondfragmentpractice;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.LinearLayout;


public class myHost_Activity extends AppCompatActivity {
        LinearLayout firstFragmentView;
        CustomSwipeAdapter adapter;
        ViewPager viewPager;
        TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_host_);
        tabLayout= (TabLayout) findViewById(R.id.tab_layout);
        firstFragmentView=(LinearLayout) findViewById(R.id.fragment_one_view) ;
        viewPager =(ViewPager) findViewById(R.id.view_pager) ;

        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        //tabLayout.setTabTextColors(R.color.colorAccent);
    }



        public void loadFragment (Fragment fragment){
            FragmentManager fm= getSupportFragmentManager();
            FragmentTransaction fmt = fm.beginTransaction();
            fmt.replace(R.id.view_pager,fragment);
            fmt.commit();

    }

    }
