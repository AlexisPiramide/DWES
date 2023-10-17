package com.example.DWES.Dominio;

import java.util.Date;

public class Ejercicio {

    private String DNI, nombre, apellidos, condicionesfisicas;
    private Date fechanacimiento;


    public Ejercicio(String DNI, String nombre, String apellidos, String condicionesfisicas, Date fechanacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.condicionesfisicas = condicionesfisicas;
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

    public String getCondicionesfisicas() {
        return condicionesfisicas;
    }

    public void setCondicionesfisicas(String condicionesfisicas) {
        this.condicionesfisicas = condicionesfisicas;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
}

