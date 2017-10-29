package com.example.cooler.phonebook;

/**
 * Created by cooler on 28.10.2017.
 */

public class Contact {
    private int photoRes;
    private String name;
    private String lastName;

    public Contact(int photoRes, String name, String lastName) {
        this.photoRes = photoRes;
        this.name = name;
        this.lastName = lastName;
    }

    public Contact() {
    }

    public int getPhotoRes() {
        return photoRes;
    }

    public void setPhotoRes(int photoRes) {
        this.photoRes = photoRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
