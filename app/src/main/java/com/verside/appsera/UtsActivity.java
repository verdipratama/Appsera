package com.verside.appsera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UtsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts);
    }
    public void masuk (View v) {
        startActivity(new Intent(getApplicationContext(), KonversiActivity.class));
    }
    public void keluar (View view){
        finish();
    }
}
