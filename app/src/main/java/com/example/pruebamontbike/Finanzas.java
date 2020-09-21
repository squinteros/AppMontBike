package com.example.pruebamontbike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Finanzas extends AppCompatActivity {

    private EditText edit1, edit2, edit3;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finanzas);

        edit1 = (EditText) findViewById(R.id.et1);
        edit2 = (EditText) findViewById(R.id.et2);
        edit3 = (EditText) findViewById(R.id.et3);
        text1 = (TextView) findViewById(R.id.tv1);
    }

    public void Calcular(View v)

    {
        if(edit1.getText().toString().equals("40000") || edit1.getText().toString().equals("25000"))
        {

            int dato1 = Integer.parseInt(edit1.getText().toString());
            int dato2 = Integer.parseInt(edit3.getText().toString());
            text1.setText("Resultado: "+Integer.toString((dato1*dato2)+250));
        }
        else
            {

                edit1.setText("Valor desconocido");
            }

    }
}
