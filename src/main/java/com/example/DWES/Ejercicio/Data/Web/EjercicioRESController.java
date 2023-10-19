package com.example.DWES.Ejercicio.Data.Web;

import com.example.DWES.Ejercicio.Applicacion.EjercicioUseCases;
import com.example.DWES.Ejercicio.Data.db.EjercicioRepositroySQL;
import com.example.DWES.Ejercicio.Dominio.Ejercicio;
import com.example.DWES.Ejercicio.Dominio.EjercicioRepository;
import com.example.DWES.Jugador.Applicacion.UseCases;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EjercicioRESController {

    private EjercicioUseCases casodeuso;

    public EjercicioRESController(){
        this.casodeuso = new EjercicioUseCases(new EjercicioRepositroySQL());
    }

    @GetMapping ("/Inicio")
    List<Ejercicio> ejercicios (Model model){
        List<Ejercicio> ejercicios = this.casodeuso.getAll();

        return (ejercicios);
    }

    @PostMapping("/")
    String BuscaEjercicio(@RequestParam Ejercicio ejercicio){


        return ("Inicio");
    }
}
