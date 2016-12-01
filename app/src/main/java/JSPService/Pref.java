package JSPService;

import android.content.SharedPreferences;

/**
 * Created by ARMANDO on 01/12/2016.
 */

public class Pref {
    private static Pref ourInstance = new Pref();

    public static Pref getInstance() {
        return ourInstance;
    }




    private Pref() {
    }
}
