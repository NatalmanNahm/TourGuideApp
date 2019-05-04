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
public class CaribouFragment extends Fragment {


    public CaribouFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create an array list of attraction
        final ArrayList<Attraction> caribouList = new ArrayList<>();
        String name = "Name: ";
        String address = "Address: ";
        String phone = "Phone: ";

        caribouList.add(new Attraction(R.drawable.caribou_hopkins_1601_1, R.drawable.caribou_hopkins_1601_2, R.drawable.caribou_hopkins_1601_3,
                name + "Hopkins Caribou 1601", address + "1601 MN-7, Hopkins, MN 55305", phone + "(952) 931-3128"));
        caribouList.add(new Attraction(R.drawable.caribou_coffee_hopkins_wayzada1, R.drawable.caribou_coffee_hopkins_wayzada2, R.drawable.caribou_coffee_hopkins_wayzada3,
                name + "Hopkins Caribou Wayzada", address + "609 E Lake St, Wayzata, MN 55391", phone + "(952) 476-1070"));
        caribouList.add(new Attraction(R.drawable.caribou_hopkins_11400, R.drawable.caribou_hopkins_11400_2, R.drawable.caribou_hopkins_1140_3,
                name + "Minnetonka caribou 11400", address + "11400 MN-7, Minnetonka, MN 55343", phone + "(952) 933-9876"));
        caribouList.add(new Attraction(R.drawable.caribou_mpls_nicolet, R.drawable.caribou_mpls_nicolet1, R.drawable.caribou_mpls_nicolet2,
                name + "Mpls Nicolet Caribou", address + "4606 Nicollet Ave, Minneapolis, MN 55419", phone + "(612) 825-6361"));
        caribouList.add(new Attraction(R.drawable.caribou_mpls_cedar, R.drawable.caribou_mpls_cedar2, R.drawable.caribou_mpls_cedar3,
                name + "Mpls Cedar Caribou", address + "4606 Nicollet Ave, Minneapolis, MN 55419", phone + "(612) 825-6361"));
        caribouList.add(new Attraction(R.drawable.caribou_coffee_saint_paul_snelling, R.drawable.caribou_coffee_saint_paul_snelling2jpg, R.drawable.caribou_coffee_saint_paul_snelling3jpg,
                name + "Saint Paul Snelling Caribou", address + "68 Snelling Ave S, St Paul, MN 55105", phone + "(651) 690-0083"));
        caribouList.add(new Attraction(R.drawable.caribou_coffee_saint_paul_grandave1jpg, R.drawable.caribou_coffee_saint_paul_grandave2, R.drawable.caribou_coffee_saint_paul_grandave3,
                name + "Saint Paul Grand Ave Caribou", address + "1055 Grand Ave, St Paul, MN 55105", phone + "(651) 221-0140"));

        //find the root view fo the whole layout
        AttractionAdapter itemAdapter = new AttractionAdapter(getActivity(), caribouList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}

