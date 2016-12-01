package com.example.armando.pi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Modificar extends AppCompatActivity {


    EditText nombre=null;
    EditText direccion=null;
    EditText telefono=null;
    EditText email=null;

    Button conf=null;
    Button canc=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);
        nombre=(EditText)findViewById(R.id.txtNombre_modUS);
        direccion=(EditText)findViewById(R.id.txtDireccion_modUS);
        telefono=(EditText)findViewById(R.id.txtTelefono_modUS);
        email=(EditText)findViewById(R.id.txtPassword_modUS);
        conf=(Button)findViewById(R.id.btnAceptar_modUS);
        canc=(Button)findViewById(R.id.btnCancelar_modUS);
    }
}
