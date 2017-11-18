package com.example.cooler.phonebook.product_list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.cooler.phonebook.AbstractActivity;
import com.example.cooler.phonebook.R;
import com.example.cooler.phonebook.list.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NewUser on 29.10.2017.
 */

public class ProductActivity  extends AbstractActivity {

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(R.mipmap.ic_launcher, "30 rub", "tomatoes", "12", true ));
        products.add(new Product(R.mipmap.ic_launcher, "10 rub", "olives", "13", false ));
        products.add(new Product(R.mipmap.ic_launcher, "90 rub", "bananas", "14", true ));
        products.add(new Product(R.mipmap.ic_launcher, "390 rub", "cabages", "52", false ));
        products.add(new Product(R.mipmap.ic_launcher, "3000 rub", "strawberrys", "82", true ));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_2);
        // получаем элемент RecyclerView
        RecyclerView namesList = (RecyclerView) findViewById(R.id.productList);
        namesList.setLayoutManager(new LinearLayoutManager(this));
        final ProductsAdapter adapter = new ProductsAdapter(this);
        adapter.setProductDelete(new OnProductDelete() {
            @Override
            public void onDeleteProduct(Product product) {
                adapter.removeProduct(product);
                Toast.makeText(ProductActivity.this, product.getProductName() + "Элемент удален", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.add_product).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.add(new Product(R.mipmap.ic_launcher, "30 rub", "tomatoes", "12", true));
            }
        });

        // устанавливаем для списка адаптер
        namesList.setAdapter(adapter);
        adapter.addAll(products);
    }

    @Override
    protected Class<? extends AppCompatActivity> nextActivityClass() {
        return MainActivity.class;
    }
}

