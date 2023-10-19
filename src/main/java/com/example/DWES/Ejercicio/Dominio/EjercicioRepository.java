package com.example.DWES.Ejercicio.Dominio;

import java.util.List;

public interface EjercicioRepository {

   public List<Ejercicio> getAll();
   public List<Ejercicio> getEjercicio(String id_Ejercicio);

}
