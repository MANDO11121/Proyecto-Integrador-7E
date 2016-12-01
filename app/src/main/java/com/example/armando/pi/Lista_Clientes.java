package com.example.armando.pi;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.json.JSONObject;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import JSPService.JSONParser;
import JSPService.Usuario;

import static com.example.armando.pi.R.layout.activity_lista__clientes;

public class Lista_Clientes extends AppCompatActivity {

    EditText txtbuscar=null;
    Button btnBuscar=null;
    ListView lstclientes=null;
    Context context;
    List<String> tasks;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(activity_lista__clientes);
        txtbuscar=(EditText)findViewById(R.id.txtBuscar_lstC);
        btnBuscar=(Button)findViewById(R.id.btnBuscar_lstC);
        lstclientes=(ListView)findViewById(R.id.lstvClientes_lstC);
        new MostrarUsuarios().execute();
    }



    private class MostrarUsuarios extends AsyncTask<String,String,JSONObject> {
        JSONParser jsonParser = new JSONParser();
        @Override
        protected JSONObject doInBackground(String... args) {
            try {

                HashMap<String, String> params = new HashMap<>();
                params.put("a", "a");
                Log.d("request", "starting");
                JSONObject json = jsonParser.makeHttpRequest(
                        "http://177.224.72.214/ventas/getAllClientes.php", "GET", params);
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
            if(json!=null){
                Usuario usuarios[]=Usuario.parseJSONARR(json);
                if(usuarios!=null){
                    ArrayAdapter <Usuario> adapter = new ArrayAdapter<Usuario>(context,android.R.layout.simple_list_item_1,usuarios);
                    lstclientes.setAdapter(adapter);
                }
            }
        }
    }

}
