package com.example.cooler.phonebook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cooler on 31.10.2017.
 */

public class CountryActivity extends AppCompatActivity {
    private static List<Country> countries = new ArrayList<>();

    static {
        countries.add(new Country(R.drawable.rashka, "Russia", "Europe", "orthodoxy", R.drawable.russia_presid, true, "Putin"));
        countries.add(new Country(R.drawable.china, "Chine", "Asia", "buddhism ", R.drawable.china_president, false, "Kim Chin Ir"));
        countries.add(new Country(R.drawable.hollywood, "USA", "North America", "protestantism", R.drawable.usa_president, true, "Trump"));
        countries.add(new Country(R.drawable.brazil, "Brazil", "South America", "catholicism",
                R.drawable.brazil_president, false, "Neymar"));
    }

    public CountryActivity() {
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        RecyclerView countriesList = (RecyclerView) findViewById(R.id.countryList);
        countriesList.setLayoutManager(new LinearLayoutManager(this));
        CountryAdapter adapter = new CountryAdapter(this);
        countriesList.setAdapter(adapter);
        adapter.addAll(countries);
    }
}

