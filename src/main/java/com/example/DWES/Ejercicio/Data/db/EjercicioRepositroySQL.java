package com.example.DWES.Ejercicio.Data.db;

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


@Controller
public class EjercicioRepositroySQL implements EjercicioRepository {

    String etiquetas;
    String material;
    @Override
    public List<Ejercicio> getAll(String id_ejercicio) {

        try {
            /*Query para sacar los ejercicios*/
            Connection connectionBD = ConectionManager.getConexion("Futbol" );
            PreparedStatement stmnt = connectionBD.prepareStatement("select * from ejercicios;");

            ResultSet rs = stmnt.executeQuery();

            /*Query para sacar las etiquetas de un ejercicio*/
            PreparedStatement stmnt2 = connectionBD.prepareStatement("select * from etiquetas where id='"+rs.getInt("id")+"';");

            /*Query para sacar los materiales de un ejercicio*/
            PreparedStatement stmnt3 = connectionBD.prepareStatement("select * from material where id='"+rs.getInt("id")+"';");

            List<Ejercicio> ListaEjercicios = new ArrayList<>();

            while (rs.next()) {

                /*Bucle que saca todas las etiquetas de un ejercicio*/
                ResultSet rs2 = stmnt2.executeQuery();
                etiquetas = "";
                while (rs.next()){
                    etiquetas+= rs2.getString("id");
                }

                /*Bucle que saca todos los materiales de un ejercicio*/
                ResultSet rs3 = stmnt3.executeQuery();
                etiquetas = "";
                while (rs.next()){
                    material+= rs3.getString("id");
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
}