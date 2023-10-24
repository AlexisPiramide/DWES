package com.example.DWES.Entrenamiento.Data.Data;

import com.example.DWES.Conexion.ConectionManager;
import com.example.DWES.Ejercicio.Applicacion.EjercicioUseCases;
import com.example.DWES.Ejercicio.Data.Data.EjercicioRepositroySQL;
import com.example.DWES.Ejercicio.Dominio.Ejercicio;
import com.example.DWES.Entrenamiento.Dominio.Entrenamiento;
import com.example.DWES.Jugador.Dominio.Jugador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntrenamientoRepositorySQL {

    public List<Entrenamiento> getAll() {

        try {

            Connection connectionBD = ConectionManager.getConexion("Futbol" );
            PreparedStatement stmnt = connectionBD.prepareStatement("SELECT * FROM Entrenamientos;");

            ResultSet rs = stmnt.executeQuery();


            List<Ejercicio> ListaEjercicios = new ArrayList<>();

            while (rs.next()) {
                List<Ejercicio> ejercicios;
                List<Jugador> jugadores;

                int idbuscar1 = +rs.getInt("etiquetas_id");
                /*Query para sacar las etiquetas de un ejercicio*/
                PreparedStatement stmnt2 = connectionBD.prepareStatement("SELECT * FROM Entrenamientos WHERE jugador IN (SELECT DNI FROM Jugadores);");
                int idbuscar2 = +rs.getInt("materiales_id");
                /*Query para sacar los materiales de un ejercicio*/
                PreparedStatement stmnt3 = connectionBD.prepareStatement("SELECT * FROM Entrenamientos WHERE ejercicio IN (SELECT id FROM Ejercicios);");


                /*Bucle que saca todas las etiquetas de un ejercicio*/
                ResultSet rs2 = stmnt2.executeQuery();
                while (rs2.next()){

                    int id = rs2.getInt("id");

                }

                /*Bucle que saca todos los materiales de un ejercicio*/
                ResultSet rs3 = stmnt3.executeQuery();

                while (rs3.next()){
                    jugadores+= rs3.getString("nombre");
                }

                /*Rellena el ejercicio y lo añade a la lista*/
                ListaEjercicios.add(new Entrenamiento(
                        rs.getInt("id"),
                        rs.getDate("fecha_entreno"),
                        ejercicio,
                        jugadores;
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
