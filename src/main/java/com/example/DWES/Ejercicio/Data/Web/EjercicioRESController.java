package com.example.DWES.Ejercicio.Data.Web;

import com.example.DWES.Ejercicio.Applicacion.EjercicioUseCases;
import com.example.DWES.Ejercicio.Data.Data.EjercicioRepositroySQL;
import com.example.DWES.Ejercicio.Dominio.Ejercicio;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EjercicioRESController {

    private EjercicioUseCases casodeuso;

    public EjercicioRESController(){
        this.casodeuso = new EjercicioUseCases(new EjercicioRepositroySQL());
    }

    @GetMapping ("/InicioEjercicio")
        List<Ejercicio> ejercicios (Model model){
        List<Ejercicio> ejercicios = this.casodeuso.getAll();

        return (ejercicios);
    }

    @PostMapping("/AñadirEjercicio")
        boolean AñadirEjercicio(@RequestBody Ejercicio ejercicio){
        boolean nuevoEjercicio = this.casodeuso.nuevoEjercicio(ejercicio);
        return (nuevoEjercicio);
    }
}
