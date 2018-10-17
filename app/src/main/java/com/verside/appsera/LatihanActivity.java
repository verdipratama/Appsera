package com.verside.appsera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LatihanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);

    }

    public void klikjumlah(View v) {
        startActivity(new Intent(getApplicationContext(), PenjumlahanActivity.class));
    }

    public void kliksegitiga(View v) {
        startActivity(new Intent(getApplicationContext(), SegitigaActivity.class));
    }

    public void klikpersegi(View v) {
        startActivity(new Intent(getApplicationContext(), PersegiActivity.class));
    }

    public void kliklingkaran(View v) {
        startActivity(new Intent(getApplicationContext(), LingkaranActivity.class));
    }

    public void klikbalok(View v) {
        startActivity(new Intent(getApplicationContext(), BalokActivity.class));
    }

    public void klikkonversi(View v) {
        startActivity(new Intent(getApplicationContext(), KonversiActivity.class));
    }
}
