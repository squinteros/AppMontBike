package com.example.pruebamontbike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edit1, edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.et1);
        edit2 = (EditText) findViewById(R.id.et2);

    }


    public void IniciarSecion(View v)
    {
        if(edit1.getText().toString().equals("Alan") && edit2.getText().toString().equals("123"))
        {

            Intent i = new Intent(this, Menu.class);
            i.putExtra("titulo","MontBike");
            i.putExtra("derechos","MontBike todos los derechos reservados");

            startActivity(i);


        }
        else
            {

                edit1.setText("Usuario Invalido");
            }


    }
}
