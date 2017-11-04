package com.example.cooler.phonebook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cooler.phonebook.product_list.ProductHolder;

import java.util.List;

/**
 * Created by cooler on 31.10.2017.
 */

public class CountryAdapter extends RecyclerView.Adapter<CountryHolder> {

    private List<Country> countries;
    private Context context;

    public CountryAdapter(Context context) {
        this.context = context;
    }

    public void addAll(List<Country> countries) {
        if (this.countries != null) {
            this.countries.clear();
        }
        this.countries = countries;
        notifyDataSetChanged();
    }

    public CountryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.country_list, null);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        return new CountryHolder(view);
    }

    @Override
    public void onBindViewHolder(CountryHolder holder, int position) {
        holder.setData(countries.get(position));
    }

    public int getItemCount() {return countries.size();}
}
