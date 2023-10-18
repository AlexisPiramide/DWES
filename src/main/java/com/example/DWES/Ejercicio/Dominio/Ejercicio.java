package com.example.DWES.Ejercicio.Dominio;


public class Ejercicio {

    private Integer id, resistencia, velocidad, recuperacion;;

    private String titulo, descripcion, etiquetas, materiales_necesarios;

    private Double duracion;

    public Ejercicio(Integer id, Integer resistencia, Integer velocidad, Integer recuperacion, String titulo, String descripcion, String etiquetas, String materiales_necesarios, Double duracion) {
        this.id = id;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.recuperacion = recuperacion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.etiquetas = etiquetas;
        this.materiales_necesarios = materiales_necesarios;
        this.duracion = duracion;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
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

    public String getMateriales_necesarios() {
        return materiales_necesarios;
    }

    public void setMateriales_necesarios(String materiales_necesarios) {
        this.materiales_necesarios = materiales_necesarios;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
}
