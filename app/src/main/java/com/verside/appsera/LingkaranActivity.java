package com.verside.appsera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LingkaranActivity extends AppCompatActivity {
    EditText r;
    TextView hasil;
    Button hitung;

    private Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        r = (EditText)findViewById(R.id.r);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView)findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //notifikasi ini akan muncul jika jari-jari tidak diisi
                if (r.length()==0){
                    Toast.makeText(getApplication(),"Jari-jari tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                else{
                    String isijari = r.getText().toString();
                    double r = Double.parseDouble(isijari);
                    double hs = volumebola(r);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
        //deklarasi variable tombol keluar
        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }
    public double volumebola(double r){return (2*3.14)*r;}
    private void logout(){
        startActivity(new Intent(LingkaranActivity.this,Activity_Login.class));
    }
}
