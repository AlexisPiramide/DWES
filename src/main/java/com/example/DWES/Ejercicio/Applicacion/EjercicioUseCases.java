package com.example.DWES.Ejercicio.Applicacion;

import com.example.DWES.Ejercicio.Data.db.EjercicioRepositroySQL;
import com.example.DWES.Ejercicio.Dominio.Ejercicio;

import java.util.*;

public class EjercicioUseCases {

    private EjercicioRepositroySQL ejercicioRepositroySQL;

    public EjercicioUseCases(EjercicioRepositroySQL ejercicioRepositroySQL){
        this.ejercicioRepositroySQL = ejercicioRepositroySQL;
    }

    public List<Ejercicio> getAll(){
        return this.ejercicioRepositroySQL.getAll();
    }
}
