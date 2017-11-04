package com.example.cooler.phonebook;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cooler on 31.10.2017.
 */

public class CountryHolder extends RecyclerView.ViewHolder {
    private ImageView countryPhoto;
    private TextView countryName;
    private TextView countryRegion;
    private TextView countryReligion;
    private CheckBox checkBox;
    private ImageView heodOfStatePhoto;
    private TextView headOfState;

    public CountryHolder(View countryView) {
        super(countryView);
        countryPhoto = (ImageView) itemView.findViewById(R.id.countryPhoto);
        countryName = (TextView) itemView.findViewById(R.id.countryName);
        countryRegion = (TextView) itemView.findViewById(R.id.countryRegion);
        countryReligion = (TextView) itemView.findViewById(R.id.countryReligion);
        checkBox = (CheckBox) itemView.findViewById(R.id.checkBox);
        heodOfStatePhoto = (ImageView) itemView.findViewById(R.id.headOfStatePhoto);
        headOfState = (TextView) itemView.findViewById(R.id.headOfState);
    }
    public void setData (Country country) {
        countryPhoto.setBackgroundResource(country.getCountryPhotoRes());
        countryName.setText(country.getCountryName());
        countryRegion.setText(country.getCountryRegion());
        countryReligion.setText(country.getCountryReligion());
        checkBox.setChecked(country.getCheckBox());
        heodOfStatePhoto.setBackgroundResource(country.getHeadOfStatePhoto());
        headOfState.setText(country.getHeadOfState());
    }
}
