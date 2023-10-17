package com.example.DWES.Dominio;

public class Entrenamiento {

    private Integer id;

    private String titulo, descripcion, etiquetas, dureza, materiales_necesarios;

    private Double duracion;

    public Entrenamiento(Integer id, String titulo, String descripcion, String etiquetas, String dureza, String materiales_necesarios, Double duracion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.etiquetas = etiquetas;
        this.dureza = dureza;
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

    public String getDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
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
