package com.rdiv.carreracorredores.models;

import java.util.List;

public class Carrera {
    private List<Corredor> corredores;
    private int distancia;
    private Integer ganador;

    // Getters y Setters
    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Integer getGanador() {
        return ganador;
    }

    public void setGanador(Integer ganador) {
        this.ganador = ganador;
    }
}