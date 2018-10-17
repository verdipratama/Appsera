package com.verside.appsera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegitigaActivity extends AppCompatActivity {
    EditText alas,tinggi;
    TextView hasil;
    Button hitung;

    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas = (EditText)findViewById(R.id.alas);
        tinggi = (EditText)findViewById(R.id.tinggi);
        hasil = (TextView)findViewById(R.id.hasil);
        hitung = (Button)findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(alas.length()==0 && tinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (alas.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    //deklarasi variable perhitungan
                    String isialas = alas.getText().toString();
                    String isitinggi = tinggi.getText().toString();

                    double a = Double.parseDouble(isialas);
                    double t = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
        //deklarasi tombol keluar
        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }
    //hasil perhitungan segitiga alas dikali tinggi dibagi dua
    public double LuasSegitiga(double a, double t){return a*t/2;}
    //metode keluar
    private void logout(){
        startActivity(new Intent(SegitigaActivity.this,Activity_Login.class));
    }
}
