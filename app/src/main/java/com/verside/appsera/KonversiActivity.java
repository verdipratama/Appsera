package com.verside.appsera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KonversiActivity extends AppCompatActivity {
    EditText rp,dl,eu; //Deklarasi variable
    Button konversi; //deklarasi varaibel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi);

        rp = (EditText)findViewById(R.id.rp);
        dl = (EditText)findViewById(R.id.dl);
        eu = (EditText)findViewById(R.id.eu);
        konversi = (Button)findViewById(R.id.konversi);
    }

    public void konversi (View view){
        try{
            int rupiah = Integer.parseInt(rp.getText().toString());
            double dollar = rupiah * 14.000;
            double euro = rupiah * 15.000;
            dl.setText(String.valueOf(dollar));
            eu.setText(String.valueOf(euro));

        }catch (Exception e){

            e.printStackTrace();
        }
    }

    public void keluar (View view){
        finish();
    }
}
