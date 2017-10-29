package com.example.cooler.phonebook.list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cooler.phonebook.R;

import java.util.List;

/**
 * Created by cooler on 28.10.2017.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactHolder> {

    private List<Contact> contacts;
    private Context context;

    public ContactsAdapter(Context context) {
        this.context = context;
    }

    public void addAll(List<Contact> contacts) {
        if (this.contacts != null) {
            this.contacts.clear();
        }
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    @Override
    public ContactHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_contact, null);
        RecyclerView.LayoutParams lp =
                new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        return new ContactHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactHolder holder, int position) {
        holder.setData(contacts.get(position));
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
