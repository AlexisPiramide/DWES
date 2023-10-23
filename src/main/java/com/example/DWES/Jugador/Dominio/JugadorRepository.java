package com.example.DWES.Jugador.Dominio;

import com.example.DWES.Ejercicio.Dominio.Ejercicio;

import java.util.List;

public interface JugadorRepository {

    public List<Jugador> getAll();
    public List<Jugador> getJudagor(String DNI);

    public boolean nuevoJudagor(Jugador jugador);
}
