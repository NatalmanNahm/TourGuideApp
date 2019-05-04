package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> numbers) {
        super(context, 0, numbers);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the image1 in the list_item.xml layout with the ID of the image one
        ImageView imageview1 = (ImageView) listItemView.findViewById(R.id.image1);

        //Get the default image and set this new image object onto the list
        imageview1.setImageResource(currentAttraction.getImage1ResourceId());

        // Find the image2 in the list_item.xml layout with the ID of the image two
        ImageView imageview2 = (ImageView) listItemView.findViewById(R.id.image2);

        //Get the default image and set this new image object onto the list
        imageview2.setImageResource(currentAttraction.getImage2ResourceId());

        // Find the image3 in the list_item.xml layout with the ID of the image three
        ImageView imageview3 = (ImageView) listItemView.findViewById(R.id.image3);

        //Get the default image and set this new image object onto the list
        imageview3.setImageResource(currentAttraction.getImage3ResourceId());

        //Find TextView in the list_item.xml layout with the ID of the Text View
        TextView name = (TextView) listItemView.findViewById(R.id.name);

        //Get the default name and set the new name onto the textview
        name.setText(currentAttraction.getName());

        //Find TextView in the list_item.xml layout with the ID of the Text View
        TextView address = (TextView) listItemView.findViewById(R.id.address);

        //Get the default address and set the new name onto the textview
        address.setText(currentAttraction.getAddress());

        //Find TextView in the list_item.xml layout with the ID of the Text View
        TextView phone = (TextView) listItemView.findViewById(R.id.phone);

        //Get the default phone and set the new name onto the textview
        phone.setText(currentAttraction.getPhone());


        return listItemView;
    }
}
