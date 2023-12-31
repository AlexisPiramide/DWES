package com.example.DWES.Ejercicio.Data.Data;

import com.example.DWES.Conexion.ConectionManager;
import com.example.DWES.Ejercicio.Dominio.Ejercicio;
import com.example.DWES.Ejercicio.Dominio.EjercicioRepository;

import org.springframework.stereotype.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EjercicioRepositroySQL implements EjercicioRepository {

    String etiquetas;
    String material;
    @Override
    public List<Ejercicio> getAll() {

        try {
            /*Query para sacar los ejercicios*/
            Connection connectionBD = ConectionManager.getConexion("Futbol" );
            PreparedStatement stmnt = connectionBD.prepareStatement("SELECT * FROM Ejercicios;");

            ResultSet rs = stmnt.executeQuery();


            List<Ejercicio> ListaEjercicios = new ArrayList<>();

            while (rs.next()) {

                int idbuscar1 = +rs.getInt("etiquetas_id");
                /*Query para sacar las etiquetas de un ejercicio*/
                PreparedStatement stmnt2 = connectionBD.prepareStatement("SELECT nombre FROM Etiquetas WHERE id ='"+idbuscar1+"';");
                int idbuscar2 = +rs.getInt("materiales_id");
                /*Query para sacar los materiales de un ejercicio*/
                PreparedStatement stmnt3 = connectionBD.prepareStatement("SELECT nombre FROM MaterialesNecesarios WHERE id ='"+idbuscar2+"';");


                /*Bucle que saca todas las etiquetas de un ejercicio*/
                ResultSet rs2 = stmnt2.executeQuery();
                etiquetas = "";
                while (rs2.next()){
                    etiquetas+= rs2.getString("nombre");
                }

                /*Bucle que saca todos los materiales de un ejercicio*/
                ResultSet rs3 = stmnt3.executeQuery();
                etiquetas = "";
                while (rs3.next()){
                    material+= rs3.getString("nombre");
                }

                /*Rellena el ejercicio y lo añade a la lista*/
                ListaEjercicios.add(new Ejercicio(
                        rs.getInt("id"),
                        rs.getInt("resistencia"),
                        rs.getInt("velocidad"),
                        rs.getInt("recuperacion"),
                        rs.getString("titulo"),
                        rs.getString("descripcion"),
                        etiquetas,
                        material,
                        rs.getDouble("duracion")));
            }

            return ListaEjercicios;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public boolean nuevoEjercicio(Ejercicio ejercicio) {

        int etiqueta = getEtiquetas(ejercicio.getEtiquetas());
        int materiral = getMateriales(ejercicio.getMateriales_necesarios());

        String Querysql=
                "INSERT INTO Ejercicios (id, resistencia, velocidad, recuperacion, titulo, duracion, descripcion, etiquetas_id, materiales_id) " +
                "VALUES ('" + ejercicio.getId() + "', '" + ejercicio.getResistencia() + "', '" + ejercicio.getVelocidad() + "', '" +
                ejercicio.getRecuperacion() + "', '" + ejercicio.getTitulo() + "', '" + ejercicio.getDuracion() + "', '" +
                ejercicio.getDescripcion() + "', '" + etiqueta + "', '" + materiral + "')";


        try{
            Connection connectionBD = ConectionManager.getConexion("Futbol" );
            PreparedStatement stmnt = connectionBD.prepareStatement(Querysql);
            stmnt.execute();
            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getEtiquetas(String Etiqueta) {
        int i = 0;
        try{
            Connection connectionBD = ConectionManager.getConexion("Futbol" );
            PreparedStatement stmnt = connectionBD.prepareStatement("SELECT id FROM Etiquetas WHERE nombre='"+Etiqueta+"';");
            ResultSet rs = stmnt.executeQuery();

            while (rs.next()) {
                i = rs.getInt("id");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return i;
    }

    public int getMateriales(String Etiqueta) {
        int i = 0;
        try{
            Connection connectionBD = ConectionManager.getConexion("Futbol" );
            PreparedStatement stmnt = connectionBD.prepareStatement("SELECT id FROM MaterialesNecesarios WHERE nombre='"+Etiqueta+"';");
            ResultSet rs = stmnt.executeQuery();

            while (rs.next()) {
                i = rs.getInt("id");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return i;
    }


    @Override
    public List<Ejercicio> getEjercicio(String id_Ejercicio) {
        return null;
    }
}