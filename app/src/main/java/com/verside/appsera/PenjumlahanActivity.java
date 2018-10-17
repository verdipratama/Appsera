package com.verside.appsera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PenjumlahanActivity extends AppCompatActivity {
    EditText bil1,bil2;
    TextView hasil;
    Button hitung;

    private int hasil_akhir=0;
    private String sBil1="";
    private String sBil2="";
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjumlahan);

        bil1 = (EditText)findViewById(R.id.txtbil1);
        bil2 = (EditText)findViewById(R.id.txtbil2);
        hasil = (TextView) findViewById(R.id.text_hasil);
        hitung = (Button) findViewById(R.id.cb_hitung);

        btnLogout = (Button)findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }

    public void klikHitung(View view){
        sBil1 = bil1.getText().toString();
        sBil2 = bil2.getText().toString();
        hasil_akhir = Integer.parseInt(sBil1)*Integer.parseInt(sBil2);
        tampilkan(hasil_akhir);

    }

    public void tampilkan(int hasil_akhir){
        hasil.setText(""+hasil_akhir);
    }

    private void logout(){
        startActivity(new Intent(PenjumlahanActivity.this,Activity_Login.class));
    }

    public void keluar (View view){
        finish();
    }
}
