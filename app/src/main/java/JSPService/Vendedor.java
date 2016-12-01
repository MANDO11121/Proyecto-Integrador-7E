package JSPService;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ARMANDO on 30/11/2016.
 */

public class Vendedor extends Usuario {

    public Vendedor(){}

    public Vendedor(String password) {
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String password;


}
