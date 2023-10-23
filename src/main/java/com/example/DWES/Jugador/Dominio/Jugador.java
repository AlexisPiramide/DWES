package com.example.DWES.Jugador.Dominio;

import java.util.Date;

public class Jugador {

    private String DNI, nombre, apellidos,fechanacimiento;
    private Integer resistencia, velocidad, recuperacion;

    public Jugador(String DNI, String nombre, String apellidos, Integer resistencia, Integer velocidad, Integer recuperacion, String fechanacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.recuperacion = recuperacion;
        this.fechanacimiento = fechanacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getRecuperacion() {
        return recuperacion;
    }

    public void setRecuperacion(Integer recuperacion) {
        this.recuperacion = recuperacion;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
}
