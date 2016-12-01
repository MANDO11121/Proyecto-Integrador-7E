package com.example.armando.pi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registrar_Usuarios extends AppCompatActivity {

    EditText txtid = null;
    EditText txtuser = null;
    EditText txtpass=null;
    EditText txtnombre=null;
    EditText txtcorreo=null;
    EditText direccion=null;
    EditText telefono=null;

    Button btnreg=null;
    Button btnCanc =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar__usuarios);
        //txtid=(EditText)findViewById(R.id.txtID_regUS);
        //txtuser=(EditText)findViewById(R.id.tstUser_regUS);
        //txtpass=(EditText)findViewById(R.id.txtContrasena_regUS);
        direccion=(EditText)findViewById(R.id.txtDireccion_modUS);
        telefono=(EditText)findViewById(R.id.txtTelefono_modUS);
        txtnombre=(EditText)findViewById(R.id.txtNombre_modUS);
        txtcorreo=(EditText)findViewById(R.id.txtPassword_modUS);
        btnreg=(Button)findViewById(R.id.btnAceptar_modUS);
        btnCanc=(Button)findViewById(R.id.btnCancelar_regUS);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrar();
            }
        });

        btnCanc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelar();
            }
        });

    }

    private void registrar(){
        Intent sig = new Intent(Registrar_Usuarios.this, LogIn.class);
        startActivity(sig);
    }

    private void cancelar(){
        Intent sig = new Intent(Registrar_Usuarios.this, LogIn.class);
        startActivity(sig);
    }

}
