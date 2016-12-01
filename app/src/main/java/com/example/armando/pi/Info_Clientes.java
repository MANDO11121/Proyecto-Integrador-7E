package com.example.armando.pi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Info_Clientes extends AppCompatActivity {


    TextView nombre=null;
    TextView telefono=null;
    TextView email=null;
    TextView direccio=null;

    Button historial=null;
    Button modificar=null;
    Button VenderProducto=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__clientes);
        nombre=(TextView)findViewById(R.id.txtNombre_InfCl);
        telefono=(TextView)findViewById(R.id.txtTel_InfCl);
        email=(TextView)findViewById(R.id.txtEmail_InfCl);
        direccio=(TextView)findViewById(R.id.txtDirInf_InfCl);
        historial=(Button)findViewById(R.id.btnHist_InfCl);
        modificar=(Button)findViewById(R.id.btnMod_InfCl);
        VenderProducto=(Button)findViewById(R.id.btnVender_InfCl);
        historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hist();
            }
        });
        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vender();
            }
        });
        VenderProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mod();
            }
        });
    }

    public void mod(){
        Intent sig = new Intent(Info_Clientes.this, Modificar.class);
        startActivity(sig);
    }

    public void hist(){
        Intent sig = new Intent(Info_Clientes.this, Hist_Cliente.class);
        startActivity(sig);
    }

    public void vender(){
        Intent sig = new Intent(Info_Clientes.this, Menu_Principal.class);
        startActivity(sig);
    }

}
