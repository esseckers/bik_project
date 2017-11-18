package com.example.cooler.phonebook.list.dialog;

/**
 * Created by cooler on 18.11.2017.
 */

public interface IConfirmDialog {

    void onConfirm();

    void onConfirm(String name, String lastName);
}
