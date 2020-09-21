package com.example.pruebamontbike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        text1 = (TextView) findViewById(R.id.txt1);
        text2 = (TextView) findViewById(R.id.txt2);

        String dato1 = getIntent().getStringExtra("titulo");
        String dato2 = getIntent().getStringExtra("derechos");

        text1.setText(dato1);
        text2.setText(dato2);
    }

    public void Bicicletas(View v)
    {

        Intent bici = new Intent(this, Bicicletas.class);
        startActivity(bici);
    }
    public void Usuarios(View v)
    {

        Intent usuario = new Intent(this, Usuarios.class);
        usuario.putExtra("nombre","Nombre: Alan Castillo");
        usuario.putExtra("edad","Edad: 23");
        startActivity(usuario);
    }
    public void Finanzas(View v)
    {

        Intent finanzas = new Intent(this, Finanzas.class);
        startActivity(finanzas);
    }
    public void Salir(View v)
    {

        Intent salir = new Intent(this, MainActivity.class);
        startActivity(salir);
    }

}
