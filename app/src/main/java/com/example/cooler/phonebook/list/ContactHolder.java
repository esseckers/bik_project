package com.example.cooler.phonebook.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cooler.phonebook.R;

/**
 * Created by cooler on 28.10.2017.
 */

public class ContactHolder extends RecyclerView.ViewHolder {

    private ImageView photo;
    private TextView name;
    private TextView lastName;
    private View delete;

    public void setData(final Contact contact, final OnItemDelete itemDelete) {
        photo.setBackgroundResource(contact.getPhotoRes());
        name.setText(contact.getName());
        lastName.setText(contact.getLastName());
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemDelete != null) {
                    itemDelete.onDeleteItem(contact);
                }
            }
        });
    }

    public ContactHolder(View itemView) {
        super(itemView);
        photo = (ImageView) itemView.findViewById(R.id.photo);
        name = (TextView) itemView.findViewById(R.id.person_name);
        lastName = (TextView) itemView.findViewById(R.id.last_name);
        delete = itemView.findViewById(R.id.delete);
    }
}
