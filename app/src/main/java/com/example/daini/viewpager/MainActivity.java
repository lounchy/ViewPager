package com.example.daini.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

public class MainActivity extends AppCompatActivity {
    //Permite la animacion y la transicion entre fragments
    private ViewPager viewPager;
    //Esta clase suministra las vistas al ViewPager
    private MiPagerAdapter miPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.miViewPager);
        miPagerAdapter = new MiPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(miPagerAdapter);

    }

    @Override
    public void onBackPressed() {
        viewPager.setAdapter(miPagerAdapter);
    }
}
