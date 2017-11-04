package com.example.cooler.phonebook.product_list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cooler.phonebook.R;

import java.util.List;

/**
 * Created by NewUser on 29.10.2017.
 */

public class ProductsAdapter extends RecyclerView.Adapter<ProductHolder> {


    private List<Product> products;
    private Context context;
    private OnProductDelete productDelete;

    public void setProductDelete (OnProductDelete productDelete){
        this.productDelete = productDelete; }

    public ProductsAdapter(Context context) {
        this.context = context;
    }

    public void addAll(List<Product> products) {
        if (this.products != null) {
            this.products.clear();
        }
        this.products = products;
        notifyDataSetChanged();
    }

    public void add (Product product) {
        if (this.products != null) {
            this.products.add(0,product);
        }
        notifyDataSetChanged();
    }

    public void removeProduct(Product product){
        if (this.products != null) {
            this.products.remove(product);
        }
        notifyDataSetChanged();
    }

    @Override
    public ProductHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list2, null);
        RecyclerView.LayoutParams lp =
                new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductHolder holder, int position) {
        holder.setData(products.get(position), productDelete);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
