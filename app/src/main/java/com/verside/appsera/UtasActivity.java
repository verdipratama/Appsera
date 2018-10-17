package com.verside.appsera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UtasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utas);
    }

    public void klikuts(View v) {
        startActivity(new Intent(getApplicationContext(), UtsActivity.class));
    }

    public void klikuas(View v) {
        startActivity(new Intent(getApplicationContext(), UasActivity.class));
    }
}
