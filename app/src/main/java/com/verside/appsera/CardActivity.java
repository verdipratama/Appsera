package com.verside.appsera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

    }

    public void lat (View v) {
        startActivity(new Intent(getApplicationContext(), LatihanActivity.class));
    }

    public void utas (View v) {
        startActivity(new Intent(getApplicationContext(), UtasActivity.class));
    }
}
