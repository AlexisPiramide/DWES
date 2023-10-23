package com.example.DWES.Jugador.Applicacion;

import com.example.DWES.Ejercicio.Data.Data.EjercicioRepositroySQL;
import com.example.DWES.Ejercicio.Dominio.Ejercicio;
import com.example.DWES.Jugador.Data.Data.JugadorRepositorySQL;
import com.example.DWES.Jugador.Dominio.Jugador;

import java.util.List;

public class JugadorUseCases {
    private JugadorRepositorySQL jugadorRepositorySQL;

    public JugadorUseCases(JugadorRepositorySQL jugadorRepositroySQL){
        this.jugadorRepositorySQL = jugadorRepositroySQL;
    }

    public List<Jugador> getAll(){
        return this.jugadorRepositorySQL.getAll();
    }

    public boolean nuevoJugador(Jugador jugador){
        return  this.jugadorRepositorySQL.nuevojugador(jugador);
    }
}
