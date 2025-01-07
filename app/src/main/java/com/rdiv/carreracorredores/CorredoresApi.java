package com.rdiv.carreracorredores;

import com.rdiv.carreracorredores.models.Carrera;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface CorredoresApi {
    @GET("api/corredores")
    Call<Carrera> getCarrera();

    @POST("api/corredores")
    Call<Carrera> crearCarrera(@Body Carrera nuevaCarrera);

    @PUT("api/corredores/simular")
    Call<Carrera> simularCarrera();

    @DELETE("api/corredores")
    Call<Void> eliminarCarrera();
}