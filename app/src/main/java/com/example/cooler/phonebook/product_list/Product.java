package com.example.cooler.phonebook.product_list;

/**
 * Created by NewUser on 29.10.2017.
 */

public class Product {
    private int photoRes;
    private String productPrice;
    private String productName;
    private String productNumber;
    private boolean checkBox;

    public Product(int photoRes, String productPrice, String productName, String productNumber, Boolean checkBox) {
        this.photoRes = photoRes;
        this.productPrice = productPrice;
        this.productName = productName;
        this.checkBox = checkBox;
        this.productNumber = productNumber;
    }

    public Product() {
    }

    public int getPhotoRes() {
        return photoRes;
    }

    public void setPhotoRes(int photoRes) {
        this.photoRes = photoRes;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public boolean getCheckBox() {
        return checkBox;
    }
}
