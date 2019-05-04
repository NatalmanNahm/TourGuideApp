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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create an array list of attraction
        final ArrayList<Attraction> restaurantList = new ArrayList<>();
        String name = "Name: ";
        String address = "Address: ";
        String phone = "Phone: ";

        restaurantList.add(new Attraction(R.drawable.restaurant_buca1, R.drawable.restaurant_buca2, R.drawable.restaurant_buca3,
                name + "Buca di Beppo Italian Restaurant ", address + " 2728 Gannon Rd, St Paul, MN 55116", phone + "(651) 772-4388"));
        restaurantList.add(new Attraction(R.drawable.restaurant_punch1, R.drawable.restaurant_punch2, R.drawable.restaurant_punch3,
                name + "Punch Pizza", address + "8353 Crystal View Rd, Eden Prairie, MN 55344", phone + "(952) 943-9557"));
        restaurantList.add(new Attraction(R.drawable.restaurant_cafe_latte1, R.drawable.restaurant_cafe_latte2, R.drawable.restaurant_cafe_latte3,
                name + "Caffe Latte", address + "850 Grand Ave, St Paul, MN 55105", phone + "(651) 224-5687"));
        restaurantList.add(new Attraction(R.drawable.restaurant_olive_garden1, R.drawable.restaurant_olive_garden2, R.drawable.restaurant_olive_garden3,
                name + "Olive Garden", address + "5235 Wayzata Blvd, St Louis Park, MN 55416", phone + "(952) 544-4423"));
        restaurantList.add(new Attraction(R.drawable.restaurant_pizzeria_lola1, R.drawable.restaurant_pizzeria_lola2, R.drawable.restaurant_pizzeria_lola3,
                name + "Pizzeria Lola", address + "5557 Xerxes Ave S, Minneapolis, MN 55410", phone + "(612) 424-8338"));
        restaurantList.add(new Attraction(R.drawable.restaurant_the_capital_grille1, R.drawable.restaurant_the_capital_grille2, R.drawable.restaurant_the_capital_grille3,
                name + "The Capital Grille", address + "801 Hennepin Ave, Minneapolis, MN 55402", phone + "(612) 692-9000"));
        restaurantList.add(new Attraction(R.drawable.restaurant_samba_taste_of_brazil1, R.drawable.restaurant_samba_taste_of_brazil2, R.drawable.restaurant_samba_taste_of_brazil3,
                name + "Samba Taste of Brazil", address + "922 Mainstreet, Hopkins, MN 55343", phone + "(952) 935-2708"));

        //find the root view fo the whole layout
        AttractionAdapter itemAdapter = new AttractionAdapter(getActivity(), restaurantList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
