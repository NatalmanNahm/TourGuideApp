package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);

        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CaribouFragment();
        } else if (position == 1) {
            return new MallFragment();
        } else if (position == 2) {
            return new MuseumFragment();
        } else if (position == 3) {
            return new ParkFragment();
        } else {
            return new RestaurantFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attraction_caribou);
        } else if (position == 1) {
            return mContext.getString(R.string.attraction_malls);
        } else if (position == 2) {
            return mContext.getString(R.string.attraction_museum);
        } else if (position == 3) {
            return mContext.getString(R.string.attraction_park);
        } else {
            return mContext.getString(R.string.attraction_restaurant);
        }
    }
}
