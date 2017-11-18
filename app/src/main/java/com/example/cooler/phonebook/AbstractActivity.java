package com.example.cooler.phonebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by cooler on 18.11.2017.
 */

public abstract class AbstractActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        ((TextView) findViewById(R.id.title)).setText(getClass().getSimpleName());
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        findViewById(R.id.forward).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runActivity(nextActivityClass());
            }
        });
    }

    protected abstract Class<? extends AppCompatActivity> nextActivityClass();

    protected void runActivity(Class<? extends AppCompatActivity> aClass) {
        Intent intent = new Intent(this, aClass);
        startActivity(intent);
    }
}
