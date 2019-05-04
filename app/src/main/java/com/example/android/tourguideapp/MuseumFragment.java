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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create an array list of attraction
        final ArrayList<Attraction> museumList = new ArrayList<>();
        String name = "Name: ";
        String address = "Address: ";
        String phone = "Phone: ";

        museumList.add(new Attraction(R.drawable.museum_institute_of_art1, R.drawable.museum_institute_of_art2, R.drawable.museum_institute_of_art3,
                name + "Institute of Art", address + "2400 3rd Ave S, Minneapolis, MN 55404", phone + "(612) 870-3000"));
        museumList.add(new Attraction(R.drawable.museum_bell_museum1, R.drawable.museum_bell_musem2, R.drawable.museum_bell_museum3,
                name + "Bell Museum", address + "2088 Larpenteur Ave W, St Paul, MN 55113", phone + "(612) 626-9660"));
        museumList.add(new Attraction(R.drawable.museum_children_museum1, R.drawable.museum_children_museum2, R.drawable.museum_children_museum3,
                name + "Children's Museum", address + "10 7th St W, St Paul, MN 55102", phone + "(651) 225-6000"));
        museumList.add(new Attraction(R.drawable.museum_science_museum_of_mn1, R.drawable.museum_science_museum_of_mn2, R.drawable.museum_science_museum_of_mn3,
                name + "Science Museum of Minnesota", address + "120 W Kellogg Blvd, St Paul, MN 55102", phone + "(651) 221-9444"));
        museumList.add(new Attraction(R.drawable.museum_walker_art_center1, R.drawable.museum_walker_art_center2, R.drawable.museum_walker_art_center3,
                name + "Walker Art Center", address + "725 Vineland Pl, Minneapolis, MN 55403", phone + "(612) 375-7600"));
        museumList.add(new Attraction(R.drawable.museum_the_musuem_of__russians_art1, R.drawable.museum_the_musuem_of__russians_art2, R.drawable.museum_the_musuem_of__russians_art3,
                name + "The Museum of Russian Art", address + "5500 Stevens Ave, Minneapolis, MN 55419", phone + "(612) 821-9045"));
        museumList.add(new Attraction(R.drawable.museum_history_center, R.drawable.museum_history_center2, R.drawable.museum_history_center3,
                name + "History Center", address + "345 W Kellogg Blvd, St Paul, MN 55102", phone + "(651) 259-3000"));

        //find the root view fo the whole layout
        AttractionAdapter itemAdapter = new AttractionAdapter(getActivity(), museumList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
