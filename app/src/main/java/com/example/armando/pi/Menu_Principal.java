package com.example.armando.pi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class Menu_Principal extends AppCompatActivity {

    Button clientes=null;
    Button productos=null;
    Button abonos=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__principal);

        clientes=(Button)findViewById(R.id.clientes_menP);
        productos=(Button)findViewById(R.id.productos_menP);
        abonos=(Button)findViewById(R.id.btnAbonos_menP);

        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irClientes();
            }
        });

        productos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irProductos();
            }
        });

        abonos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAbonos();
            }
        });

    }

    private void irProductos(){
       /* Intent sig = new Intent(Menu_Principal.this, );
        startActivity(sig);*/
    }

    private void irClientes(){
        Intent sig = new Intent(Menu_Principal.this, Lista_Clientes.class);
        startActivity(sig);
    }

    private void irAbonos(){
        /*Intent sig = new Intent(Menu_Principal.this, Menu_Principal.class);
        startActivity(sig);
        */
    }



}
