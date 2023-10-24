package com.example.DWES.Entrenamiento.Dominio;

import com.example.DWES.Jugador.Dominio.Jugador;

import java.util.List;

public interface EntrenamientoRepository {

    public List<Entrenamiento> getAll();
    public Entrenamiento getEntrenamiento(int id);
    public boolean nuevoEntrenamiento(Entrenamiento entrenamiento);
}
