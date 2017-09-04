package com.example.dhafin.konversisuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText suhu;
    RadioGroup ver;
    Button hitung;
    TextView hasil;
    String cel;
    float temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        suhu=(EditText)findViewById(R.id.suhu);
        ver=(RadioGroup) findViewById(R.id.radioGroup2);
        hitung=(Button) findViewById(R.id.hitung);
        hasil=(TextView) findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cel=suhu.getText().toString();
                temp=Float.parseFloat(cel);
                switch (ver.getCheckedRadioButtonId()) {
                    case R.id.farenheit:
                        float temp2;
                        temp2=((temp/5)*9)+32;
                        hasil.setText(String.valueOf(temp2));
                        break;
                    case R.id.reamur:
                        float temp3;
                        temp3=((temp/5)*4);
                        hasil.setText(String.valueOf(temp3));
                        break;
                    case R.id.kelvin:
                        float temp4;
                        temp4=temp+273;
                        hasil.setText(String.valueOf(temp4));
                        break;
                    default:
                        hasil.setText("Isi Data");
                        break;
                }
            }
        });


    }
}
