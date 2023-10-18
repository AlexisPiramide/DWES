package com.example.DWES.Ejercicio.Data.dao;

import com.example.DWES.Ejercicio.Data.db.EjercicioRepositroySQL;
import com.example.DWES.Ejercicio.Dominio.EjercicioRepository;

public class EjercicioFactory {

    private static EjercicioFactory daoFactory;
    private EjercicioRepository ejercicioRepository;


    private EjercicioFactory(){}


    public static EjercicioFactory getInstance(){

        if (daoFactory == null){
            daoFactory = new EjercicioFactory();
        }
        return daoFactory;
    }

    public EjercicioRepository getEjercicioRepository(){
        if (ejercicioRepository == null){
            ejercicioRepository = new EjercicioRepositroySQL();
        }

        return ejercicioRepository;
    }
}