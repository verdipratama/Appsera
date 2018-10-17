package com.verside.appsera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PersegiActivity extends AppCompatActivity {
    EditText panjang,lebar;
    TextView hasil;
    Button hitung;

    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        panjang = (EditText)findViewById(R.id.panjang);
        lebar = (EditText)findViewById(R.id.lebar);
        hasil = (TextView)findViewById(R.id.hasil);
        hitung = (Button)findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(panjang.length()==0 && lebar.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (panjang.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (lebar.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    //deklarasi variable perhitungan
                    String isipanjang = panjang.getText().toString();
                    String isilebar = lebar.getText().toString();

                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);
                    double hs = LuasPersegiPanjang(p,l);
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
    public double LuasPersegiPanjang(double p, double l){return p*l;}
    //metode keluar
    private void logout(){
        startActivity(new Intent(PersegiActivity.this,Activity_Login.class));
    }
}
