package com.example.cooler.phonebook.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cooler.phonebook.R;

/**
 * Created by cooler on 28.10.2017.
 */

public class ContactHolder extends RecyclerView.ViewHolder {

    private ImageView photo;
    private TextView name;
    private TextView lastName;

    public void setData(Contact contact) {
        photo.setBackgroundResource(contact.getPhotoRes());
        name.setText(contact.getName());
        lastName.setText(contact.getLastName());
    }

    public ContactHolder(View itemView) {
        super(itemView);
        photo = (ImageView) itemView.findViewById(R.id.photo);
        name = (TextView) itemView.findViewById(R.id.person_name);
        lastName = (TextView) itemView.findViewById(R.id.last_name);
    }
}
