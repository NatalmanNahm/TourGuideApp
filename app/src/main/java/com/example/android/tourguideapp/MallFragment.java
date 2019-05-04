package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MallFragment extends Fragment {


    public MallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create an array list of attraction
        final ArrayList<Attraction> mallList = new ArrayList<>();
        String name = "Name: ";
        String address = "Address: ";
        String phone = "Phone: ";

        mallList.add(new Attraction(R.drawable.mall_mallofamerica, R.drawable.mall_mallofamerica2, R.drawable.mall_mallofamerica3,
                name + "Mall Of America", address + "60 E Broadway, Bloomington, MN 55425", phone + "(952) 883-8800"));
        mallList.add(new Attraction(R.drawable.mall_outletmall1, R.drawable.mall_outletmall2, R.drawable.mall_outletmall3,
                name + "Outlet Mall", address + "3965 Eagan Outlets Pkwy, Eagan, MN 55122", phone + "(612) 444-8850"));
        mallList.add(new Attraction(R.drawable.mall_roseville_mall1, R.drawable.mall_roseville_mall2, R.drawable.mall_roseville_mall,
                name + "Roseville Mall", address + "1595 MN-36, Roseville, MN 55113", phone + "(651) 633-0872"));
        mallList.add(new Attraction(R.drawable.mall_knollwoodmall1, R.drawable.mall_knollwood2, R.drawable.mall_knollwoodmall3,
                name + "Knollwood Mall", address + "8332 MN-7, St Louis Park, MN 55426", phone + "(952) 563-6600"));
        mallList.add(new Attraction(R.drawable.mall_ridgedalemall1, R.drawable.mall_ridgedalemall2, R.drawable.mall_ridgedalemall3,
                name + "Ridgedale Mall", address + "12401 Wayzata Blvd, Minnetonka, MN 55305", phone + "(952) 541-4864"));
        mallList.add(new Attraction(R.drawable.mall_southdalemall1, R.drawable.mall_southdalemall2, R.drawable.mall_southdalemall3,
                name + "Southdale Mall", address + "10 Southdale Center, Edina, MN 55435", phone + "(952) 925-7874"));
        mallList.add(new Attraction(R.drawable.mall_nicollet_mall1, R.drawable.mall_nicollet_mall2, R.drawable.mall_nicolletmall3,
                name + "Nicollet Mall", address + "Washington Ave and 13th St S, Minneapolis, MN 55403", phone + "(612) 370-9100"));

        //find the root view fo the whole layout
        AttractionAdapter itemAdapter = new AttractionAdapter(getActivity(), mallList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}

