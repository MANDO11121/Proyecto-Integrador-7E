package JSPService;

import android.os.AsyncTask;
import android.util.Log;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by ARMANDO on 01/12/2016.
 */

public class REST_USUARIOS {

    private class BuscarUsuario extends AsyncTask<String,String,Usuario>{
        @Override
        protected Usuario doInBackground(String... strings) {
            try {
                final String url = "http://rest-service.guides.spring.io/greeting";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                Usuario usuario = restTemplate.getForObject(url, Usuario.class);
                return usuario;
            } catch (Exception e) {
                Log.e("RestUsuarios", e.getMessage(), e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Usuario usuario) {
            if(usuario!=null){


            }
        }
    }

    private class SingIn  extends AsyncTask<String,String,Usuario>{


        public SingIn() {
            super();
        }

        @Override
        protected Usuario doInBackground(String... strings) {
            try {
                final String url = "http://rest-service.guides.spring.io/greeting";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                Usuario greeting = restTemplate.getForObject(url, Usuario.class);
                return greeting;
            } catch (Exception e) {
                Log.e("RestUsuarios", e.getMessage(), e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Usuario usuario) {
            if(usuario!=null){
            }
        }

    }

    private class Registrar  extends AsyncTask<String,String,Usuario>{

        @Override
        protected Usuario doInBackground(String... strings) {
            return null;
        }



        @Override
        protected void onPostExecute(Usuario usuario) {
            if(usuario!=null){
            }
        }

    }

    private class BuscarUsuarios extends AsyncTask<String,String,List<Usuario>>{
        @Override
        protected List<Usuario> doInBackground(String... strings) {
            return null;
        }

        @Override
        protected void onPostExecute(List<Usuario> usuarios) {
            super.onPostExecute(usuarios);
        }
    }

}



