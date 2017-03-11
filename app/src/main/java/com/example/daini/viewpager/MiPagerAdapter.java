package com.example.daini.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Daini on 11/03/2017.
 */

public class MiPagerAdapter extends FragmentStatePagerAdapter {
    public static final int NUM_FRAGMENT = 3;

    public MiPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position){
            case 0: fragment = new ScreenFragmentUno();
                break;
            case 1 :fragment = new ScreenFragmentDos();
                break;
            case 2: fragment = new ScreenFragmentTres();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return NUM_FRAGMENT;
    }
}
