package com.example.cooler.phonebook.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.cooler.phonebook.AbstractActivity;
import com.example.cooler.phonebook.R;
import com.example.cooler.phonebook.country.CountryActivity;
import com.example.cooler.phonebook.list.dialog.AddContactDialogFragment;
import com.example.cooler.phonebook.list.dialog.DeleteContactDialogFragment;
import com.example.cooler.phonebook.list.dialog.SimpleConfirm;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AbstractActivity {

    private static List<Contact> contacts = new ArrayList<>();

    static {
        contacts.add(new Contact(R.mipmap.ic_launcher, "Tak23423oy", "Takoy"));
        contacts.add(new Contact(R.mipmap.ic_launcher, "Takoy", "werw"));
        contacts.add(new Contact(R.mipmap.ic_launcher, "Takoy", "Takoy"));
        contacts.add(new Contact(R.mipmap.ic_launcher, "Taksdfoy", "Takoy"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // получаем элемент RecyclerView
        RecyclerView namesList = (RecyclerView) findViewById(R.id.my_recycler_view);
        namesList.setLayoutManager(new LinearLayoutManager(this));
        final ContactsAdapter adapter = new ContactsAdapter(this);
        adapter.setItemDelete(new OnItemDelete() {
            @Override
            public void onDeleteItem(final Contact contact) {
                DeleteContactDialogFragment dialogFragment = new DeleteContactDialogFragment();
                dialogFragment.setConfirmDialog(new SimpleConfirm() {
                    @Override
                    public void onConfirm() {
                        adapter.removeItem(contact);
                        Toast.makeText(MainActivity.this, contact.getName() +
                                " элемент удален", Toast.LENGTH_LONG).show();
                    }
                });
                dialogFragment.show(getFragmentManager(), contact.getName());
            }
        });
        findViewById(R.id.add_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddContactDialogFragment dialogFragment = new AddContactDialogFragment();
                dialogFragment.setConfirmDialog(new SimpleConfirm() {
                    @Override
                    public void onConfirm(String name, String lastName) {
                        adapter.add(new Contact(R.mipmap.ic_launcher, name, lastName));
                    }
                });
                dialogFragment.show(getFragmentManager(), "");
            }
        });
        // устанавливаем для списка адаптер
        namesList.setAdapter(adapter);
        adapter.addAll(contacts);
    }

    @Override
    protected Class<? extends AppCompatActivity> nextActivityClass() {
        return CountryActivity.class;
    }
}