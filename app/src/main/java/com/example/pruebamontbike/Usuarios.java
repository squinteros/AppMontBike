package com.example.pruebamontbike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Usuarios extends AppCompatActivity {

    private TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);

        text1 = (TextView) findViewById(R.id.txt1);
        text2 = (TextView) findViewById(R.id.txt2);
    }

    public void Mostrar(View v)

    {
        String dato1 = getIntent().getStringExtra("nombre");
        String dato2 = getIntent().getStringExtra("edad");

        text1.setText(dato1);
        text2.setText(dato2);

    }
}
