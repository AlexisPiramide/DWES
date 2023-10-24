package com.example.DWES.Jugador.Data.Data;

import com.example.DWES.Conexion.ConectionManager;
import com.example.DWES.Jugador.Dominio.Jugador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JugadorRepositorySQL {

    public List<Jugador> getAll() {

        try {
            /*Query para sacar los Jugadores*/
            Connection connectionBD = ConectionManager.getConexion("Futbol" );
            PreparedStatement stmnt = connectionBD.prepareStatement("SELECT * FROM Jugadores;");

            ResultSet rs = stmnt.executeQuery();


            List<Jugador> ListaJugadores = new ArrayList<>();

            while (rs.next()) {
                ListaJugadores.add(new Jugador(
                        rs.getString("DNI"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getInt("resistencia"),
                        rs.getInt("velocidad"),
                        rs.getInt("recuperacion"),
                        rs.getString("fechanacimiento")));
            }

            return ListaJugadores;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public Jugador getJugador(String DNI) {

        try {
            /*Query para sacar los Jugadores*/
            Connection connectionBD = ConectionManager.getConexion("Futbol" );
            PreparedStatement stmnt = connectionBD.prepareStatement("SELECT * FROM Jugadores where DNI = '"+DNI+"';");

            ResultSet rs = stmnt.executeQuery();

            Jugador jugador;
            while (rs.next()) {
                jugador = new Jugador(
                        rs.getString(DNI),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getInt("resistencia"),
                        rs.getInt("velocidad"),
                        rs.getInt("recuperacion"),
                        rs.getString("fechanacimiento")));
            }

            return jugador;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean nuevojugador(Jugador jugador) {


        String Querysql=
                "INSERT INTO Jugadores (DNI, nombre, apellidos, resistencia, velocidad, recuperacion, fechanacimiento) " +
                        "VALUES ('" + jugador.getDNI() + "', '" + jugador.getNombre() + "', '" + jugador.getApellidos() + "', '" +
                        jugador.getResistencia() + "', '" + jugador.getVelocidad() + "', '" + jugador.getRecuperacion() + "', '" +
                        jugador.getFechanacimiento() +"');";


        try{
            Connection connectionBD = ConectionManager.getConexion("Futbol" );
            PreparedStatement stmnt = connectionBD.prepareStatement(Querysql);
            stmnt.execute();
            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
