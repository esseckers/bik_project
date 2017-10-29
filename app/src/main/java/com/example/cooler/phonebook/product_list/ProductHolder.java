package com.example.cooler.phonebook.product_list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cooler.phonebook.R;

/**
 * Created by NewUser on 29.10.2017.
 */

public class ProductHolder  extends RecyclerView.ViewHolder {
    private ImageView photo;
    private TextView productPrice;
    private TextView productName;
    private TextView productNumber;
    private CheckBox checkBox;

    public ProductHolder(View itemView) {
        super(itemView);
        photo = (ImageView) itemView.findViewById(R.id.photo);
        productName = (TextView) itemView.findViewById(R.id.productName);
        productPrice = (TextView) itemView.findViewById(R.id.price);
        productNumber = (TextView) itemView.findViewById(R.id.id_product);
        checkBox = (CheckBox) itemView.findViewById(R.id.checkBox);
    }

    public void setData(Product product) {
        photo.setBackgroundResource(product.getPhotoRes());
        productName.setText(product.getProductName());
        productPrice.setText(product.getProductPrice());
        productNumber.setText(product.getProductNumber());
        checkBox.setChecked(product.getCheckBox());
    }
}
