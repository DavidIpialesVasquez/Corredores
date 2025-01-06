package com.rdiv.carreracorredores;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.rdiv.carreracorredores.api.ApiClient;
import com.rdiv.carreracorredores.api.CorredoresApi;
import com.rdiv.carreracorredores.models.Carrera;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private CorredoresApi corredoresApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corredoresApi = ApiClient.getClient().create(CorredoresApi.class);

        // Ejemplo: Obtener los datos de la carrera
        obtenerCarrera();
    }

    private void obtenerCarrera() {
        corredoresApi.getCarrera().enqueue(new Callback<Carrera>() {
            @Override
            public void onResponse(Call<Carrera> call, Response<Carrera> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Carrera carrera = response.body();
                    Log.d("Carrera", "Datos: " + carrera.getCorredores().size());
                } else {
                    Toast.makeText(MainActivity.this, "Error al obtener datos", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Carrera> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
