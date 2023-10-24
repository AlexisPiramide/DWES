package com.example.DWES.Ejercicio.Applicacion;

import com.example.DWES.Ejercicio.Data.Data.EjercicioRepositroySQL;
import com.example.DWES.Ejercicio.Dominio.Ejercicio;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EjercicioUseCasesTest {

    private EjercicioRepositroySQL ejercicioRepositroySQL;

    public EjercicioUseCasesTest(EjercicioRepositroySQL ejercicioRepositroySQL){
        this.ejercicioRepositroySQL = ejercicioRepositroySQL;
    }

    @Test
    void getAll() {
        List<Ejercicio> Ejercicios = ejercicioRepositroySQL.getAll();
        assertEquals(7,Ejercicios.size());
    }

    @Test
    void nuevoEjercicio() {
    }
}