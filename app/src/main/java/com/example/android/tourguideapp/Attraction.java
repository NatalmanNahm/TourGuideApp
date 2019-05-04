package com.example.android.tourguideapp;

/**
 * {@link} represents each attraction available for a tourist.
 * It contains details of location or recreation available in the city
 */

public class Attraction {

    /**
     * First image of the place
     */
    private int mImage1ResourceId;

    /**
     * second image of the place
     */
    private int mImage2ResourceId;

    /**
     * third image of the place
     */
    private int mImage3ResourceId;

    /**
     * Name of the place
     */
    private String mName;

    /**
     * Address of the place
     */
    private String mAddress;

    /**
     * Phone number of the place
     */
    private String mPhone;


    /**
     * Creating first constructor that for an attraction
     * Using phone number and email if the place has one
     */
    public Attraction(int image1, int image2, int image3, String name,
                      String address, String phone) {
        mImage1ResourceId = image1;
        mImage2ResourceId = image2;
        mImage3ResourceId = image3;
        mName = name;
        mAddress = address;
        mPhone = phone;
    }

    /**
     * Creating first constructor that for an attraction
     * This Constructor is for attraction that do not contain
     * email or phone number
     */
    public Attraction(int image1, int image2, int image3, String name,
                      String address) {
        mImage1ResourceId = image1;
        mImage2ResourceId = image2;
        mImage3ResourceId = image3;
        mName = name;
        mAddress = address;
    }

    //Getter for image resource 1
    public int getImage1ResourceId() {
        return mImage1ResourceId;
    }

    //Getter for image resource 2
    public int getImage2ResourceId() {
        return mImage2ResourceId;
    }

    //Getter for image resource 3
    public int getImage3ResourceId() {
        return mImage3ResourceId;
    }

    //Getter for the name
    public String getName() {
        return mName;
    }

    //Getter for the address
    public String getAddress() {
        return mAddress;
    }

    //Getter for Phone Number
    public String getPhone() {
        return mPhone;
    }

}
