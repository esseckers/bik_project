package com.example.cooler.phonebook;

/**
 * Created by cooler on 31.10.2017.
 */

public class Country {
    private int countryPhotoRes;
    private String countryName;
    private String countryRegion;
    private String countryReligion;
    private String headOfState;
    private int headOfStatePhoto;
    private boolean checkBox;

    public Country(int countryPhotoRes, String countryName, String countryRegion, String countryReligion,
                   int headOfStatePhoto, boolean checkBox, String headOfState) {
        this.countryPhotoRes = countryPhotoRes;
        this.countryName = countryName;
        this.countryRegion = countryRegion;
        this.countryReligion = countryReligion;
        this.headOfState = headOfState;
        this.checkBox = checkBox;
        this.headOfStatePhoto = headOfStatePhoto;
    }

    public Country() {
    }

    public int getCountryPhotoRes() {
        return countryPhotoRes;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public String getCountryReligion() {
        return countryReligion;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public boolean getCheckBox() {
        return checkBox;
    }

    public int getHeadOfStatePhoto() {
        return headOfStatePhoto;
    }
}
