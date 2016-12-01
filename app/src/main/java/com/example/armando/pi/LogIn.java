package com.example.armando.pi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import JSPService.JSONParser;
import JSPService.Usuario;

import static com.example.armando.pi.R.attr.title;

public class LogIn extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    ImageView image = null;
    EditText username = null;
    EditText password = null;
    Button log_in = null;
    Button nUser = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        editor = pref.edit();
        if(is_logged())
            iniciarSesion();
        else{
            username = (EditText) findViewById(R.id.txtUsername_log);
            password = (EditText) findViewById(R.id.txtPassword_log);
            nUser = (Button) findViewById(R.id.btnNUsr_log);
            log_in = (Button) findViewById(R.id.btnSignIn_log);
            log_in.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new SingIn().execute("sjimenez.developer@gmail.com","bulletforever93");
                }
            });

            nUser.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    registrarUsuario();
                }
            });

        }
    }

    private void iniciarSesion() {
        Intent sig = new Intent(LogIn.this, Menu_Principal.class);
        sig.setFlags(sig.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(sig);    }

    private void registrarUsuario(){
        Intent sig = new Intent(LogIn.this, Registrar_Vendedores.class);
        startActivity(sig);
    }

    private class SingIn  extends AsyncTask<String,String,JSONObject>{
        JSONParser jsonParser = new JSONParser();
        @Override
        protected JSONObject doInBackground(String... args) {
            try {

                HashMap<String, String> params = new HashMap<>();
                params.put("email", args[0]);
                params.put("password", args[1]);

                Log.d("request", "starting");

                JSONObject json = jsonParser.makeHttpRequest(
                        "http://177.224.72.214/ventas/getLogin.php", "POST", params);

                if (json != null) {
                    Log.d("JSON result", json.toString());
                    return json;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(JSONObject json) {
            int success = 0;
            String message = "";

            if (json != null) {
                try {
                    success = json.getInt("estado");
                    ;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            if (success == 1) {try{
                editor.putString("nombre", json.getJSONObject("vendedor").getString("nombre"));
                Log.d("ERROR",""+success);
                editor.putInt("id", json.getJSONObject("vendedor").getInt("id_usuario"));
                Log.d("ERROR",""+success);
                editor.putBoolean("USER_LOG", true);
                Log.d("ERROR",""+success);
                editor.commit();iniciarSesion();}catch(JSONException ex){Log.d("Json EXP",ex.toString());}
            }else{

            }
        }

    }

    private boolean is_logged(){
        return pref.getBoolean("USER_LOG",false);

    }
}
