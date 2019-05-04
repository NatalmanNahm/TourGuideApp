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
public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create an array list of attraction
        final ArrayList<Attraction> parkList = new ArrayList<>();
        String name = "Name: ";
        String address = "Address: ";
        String phone = "Phone: ";

        parkList.add(new Attraction(R.drawable.park_blue_mounds1, R.drawable.park_blue_mounds2, R.drawable.park_blue_mounds3,
                name + "Blue Mounds State park", address + "4350 Mounds Park Rd, Blue Mounds, WI 53517", phone + "(608) 437-5711"));
        parkList.add(new Attraction(R.drawable.park_buffalo_river1, R.drawable.park_buffalo_river2, R.drawable.park_buffalo_river3,
                name + "Buffalo River State Park", address + "565 155th St S, Glyndon, MN 56547", phone + "(218) 498-2124"));
        parkList.add(new Attraction(R.drawable.park_afton_state_park1, R.drawable.park_afton_state_park2, R.drawable.park_afton_state_park3,
                name + "Afton State Park", address + "6959 Peller Ave S, Hastings, MN 55033", phone + "(651) 436-5391"));
        parkList.add(new Attraction(R.drawable.park_banning_state_park1, R.drawable.park_banning_state_park2, R.drawable.park_banning_state_park3,
                name + "Banning State Park", address + "61101 Banning Park Rd, Sandstone, MN 55072", phone + "(320) 245-2668"));
        parkList.add(new Attraction(R.drawable.park_bear_head_lake1, R.drawable.park_bear_head_lake2, R.drawable.park_bear_head_lake3,
                name + "Bear Head Lake", address + "9301 Bear Head State Park Road, Ely, MN 55731", phone + "(218) 235-2520"));
        parkList.add(new Attraction(R.drawable.park_beaver_creek_valley1, R.drawable.park_beaver_creek_valley2, R.drawable.park_beaver_creek_valley3,
                name + "Beaver Creek Valley", address + "15954 County Rd 1, Caledonia, MN 55921", phone + "(507) 724-2107"));
        parkList.add(new Attraction(R.drawable.park_big_stone_lake1, R.drawable.park_big_stone_lake2, R.drawable.park_big_stone_lake3,
                name + "Big Stone Lake", address + "35889 Meadowbrook State Park Road, Ortonville, MN 56278", phone + "(320) 839-3663"));

        //find the root view fo the whole layout
        AttractionAdapter itemAdapter = new AttractionAdapter(getActivity(), parkList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}

