package com.example.DWES.Ejercicio.Data.dao;
import com.example.DWES.Ejercicio.Data.db.EjercicioRepositroySQL;

public class DaoEjercicioSQL {

    private EjercicioRepositroySQL ejercicioRepositorySQL;

    public DaoEjercicioSQL(){
        ejercicioRepositorySQL = new EjercicioRepositroySQL();
    }

    public EjercicioRepositroySQL getDaoRepositorySQL(){
        return ejercicioRepositorySQL;
    }

}