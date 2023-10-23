package com.example.DWES.Jugador.Data.Web;

import com.example.DWES.Ejercicio.Applicacion.EjercicioUseCases;
import com.example.DWES.Ejercicio.Data.Data.EjercicioRepositroySQL;
import com.example.DWES.Jugador.Applicacion.JugadorUseCases;
import com.example.DWES.Jugador.Data.Data.JugadorRepositorySQL;
import com.example.DWES.Jugador.Dominio.Jugador;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JugadorRESController {

    private JugadorUseCases casodeuso;

    public JugadorRESController(){
        this.casodeuso = new JugadorUseCases(new JugadorRepositorySQL());
    }

    @GetMapping("/InicioJugador")
    List<Jugador> jugadores (Model model){
        List<Jugador> jugador = this.casodeuso.getAll();
        return (jugador);
    }

    @PostMapping("/AñadirJugador")
    boolean añadirJugador(@RequestBody Jugador jugador){
        boolean nuevoJugador = this.casodeuso.nuevoJugador(jugador);
        return (nuevoJugador);
    }
}
