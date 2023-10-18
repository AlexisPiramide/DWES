package com.example.DWES.Entrenamiento.Dominio;

import com.example.DWES.Ejercicio.Dominio.Ejercicio;
import com.example.DWES.Jugador.Dominio.Jugador;

import java.util.Date;
import java.util.List;

public class Entrenamiento{
    private Integer Id;
    private Date Fecha;
    private List<Ejercicio> Ejercicios;
    private Jugador Asistentes;


    public Entrenamiento(Integer id, Date fecha, List<Ejercicio> ejercicios, Jugador asistentes) {
        Id = id;
        Fecha = fecha;
        Ejercicios = ejercicios;
        Asistentes = asistentes;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public List<Ejercicio> getEjercicios() {
        return Ejercicios;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        Ejercicios = ejercicios;
    }

    public Jugador getAsistentes() {
        return Asistentes;
    }

    public void setAsistentes(Jugador asistentes) {
        Asistentes = asistentes;
    }
}