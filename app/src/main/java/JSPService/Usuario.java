package JSPService;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ARMANDO on 30/11/2016.
 */

public class Usuario {

    public Usuario(int id, String username, String direccion, String name, String email, String telefono) {
        this.id = id;
        this.username = username;
        this.direccion = direccion;
        this.name = name;
        this.email = email;
        this.telefono = telefono;
    }

    public Usuario(){}

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }


    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    private int id;
    private String username;
    private String direccion;
    private String name;
    private String email;
    private String telefono;


    static public Usuario parseJSON(JSONObject json){
        try{
            Usuario nuevo=new Vendedor();
            nuevo.setId(json.getInt("id_usuario"));
            nuevo.setName(json.getString("nombre"));
            nuevo.setDireccion(json.getString("direccion"));
            nuevo.setEmail(json.getString("email"));
            nuevo.setTelefono(json.getString("telefono"));
            Log.d("Parse",nuevo.toString());
            return  nuevo;
        }catch(Exception ex){
            Log.d("Parse",ex.toString());
        }
        return null;
    }

    static public Usuario[] parseJSONARR(JSONObject json){
        try{
            Usuario cliente[]=null;
            JSONArray arr=json.getJSONArray("clientes");
            int tam =arr.length();
            Log.d("Tamaño",""+tam);
            if(tam>0)
                cliente = new Usuario[tam];
            for(int i=0;i<tam;i++){
                cliente[i]=Usuario.parseJSON(arr.optJSONObject(i));
            }
            return cliente;
        }catch(JSONException ex){Log.d("parse cliente",ex.toString());}

        return null;
    }

    @Override
    public String toString(){
        return "Nombre: "+this.name+"\nDireccion: "+this.direccion+"\nEmail: "+this.email+"\nTelefono: "+this.telefono+"\n";
    }

}
