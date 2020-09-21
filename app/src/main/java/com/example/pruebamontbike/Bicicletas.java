package com.example.pruebamontbike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Bicicletas extends AppCompatActivity {

    private EditText edit1, edit2;
    private TextView text1;
    private int dato1, dato2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicicletas);

        edit1 = (EditText) findViewById(R.id.et1);
        edit2 = (EditText) findViewById(R.id.et2);
        text1 = (TextView) findViewById(R.id.txt1);
    }

    public void Calcular(View v)
    {
        if(edit1.getText().toString().toLowerCase().equals("bianchi"))
        {
            dato1 = 40000;
        }
        else if(edit1.getText().toString().toLowerCase().equals("monark"))
        {
            dato1 = 25000;
        }
        else
            {
                edit1.setText("Marca desconocida");
            }
        if(edit2.getText().toString().equals("16"))
        {
            dato2 = 2;
        }
        else if(edit2.getText().toString().equals("20"))
        {
            dato2 = 4;
        }
        else {
            edit2.setText("Aro desconocido");
            }

        int resultado = dato1*dato2;
        text1.setText("Precio: $"+ Integer.toString(resultado));




    }
}
