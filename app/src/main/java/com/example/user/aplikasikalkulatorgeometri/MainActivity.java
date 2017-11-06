package com.example.user.aplikasikalkulatorgeometri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonHitung(View view){
        TextView luas = (TextView) findViewById(R.id.hasilLuas);
        TextView keliling = (TextView) findViewById(R.id.hasilKeliling);
        EditText input1 = (EditText) findViewById(R.id.inp1);
        EditText input2 = (EditText) findViewById(R.id.inp2);
        Spinner bangun = (Spinner) findViewById(R.id.spinner1);

        String angka1 = input1.getText().toString();
        String angka2 = input2.getText().toString();

        int i1 = Integer.parseInt(angka1);
        int i2 = Integer.parseInt(angka2);

        if (bangun.getSelectedItem().toString().equals("Persegi Panjang")){
            int hasilLuas = i1*i2;
            String hasil1 = String.valueOf(hasilLuas);
            luas.setText(hasil1);

            int hasilKeliling = (2*i1)+(2*i2);
            String hasil2 = String.valueOf(hasilKeliling);
            keliling.setText(hasil2);
        }
        else if (bangun.getSelectedItem().toString().equals("Lingkaran")){
            double pi = Math.PI;

            double hasilLuas = pi*(i1*i1);
            String hasil1 = String.valueOf(hasilLuas);
            luas.setText(hasil1);

            double hasilKeliling = pi*(2*i1);
            String hasil2 = String.valueOf(hasilKeliling);
            keliling.setText(hasil2);
        }
        else if (bangun.getSelectedItem().toString().equals("Segitiga")){
            double hasilLuas = (i1*i2)/2;
            String hasil1 = String.valueOf(hasilLuas);
            luas.setText(hasil1);

            double sqrt = (float) Math.sqrt((i1*i1)+(i2*i2));
            double hasilKeliling = i1+i2+sqrt;
            String hasil2 = String.valueOf(hasilKeliling);
            keliling.setText(hasil2);
        }
    }
}
