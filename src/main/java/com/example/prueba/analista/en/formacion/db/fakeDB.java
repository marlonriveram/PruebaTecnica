package com.example.prueba.analista.en.formacion.db;

import com.example.prueba.analista.en.formacion.modelos.ListaEmpleados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class fakeDB {
    public static List<ListaEmpleados> ObtenerGatos(){
        List<ListaEmpleados> empleados  = new ArrayList<>();

        empleados.add(new ListaEmpleados(1L,"Adam",2000000L, LocalDate.parse("2021-01-01"),""));
        empleados.add(new ListaEmpleados(1L,"Adam",1000000L, LocalDate.parse("2021-01-02"),""));
        empleados.add(new ListaEmpleados(2L,"Bolton",400000L, LocalDate.parse("2021-01-01"),""));
        empleados.add(new ListaEmpleados(3L,"Chelsea",900000L, LocalDate.parse("2021-01-02"),""));
        empleados.add(new ListaEmpleados(2L,"Bolton",1100000L, LocalDate.parse("2021-02-03"),""));
        empleados.add(new ListaEmpleados(6L,"Warden",5100000L, LocalDate.parse("2021-01-02"),""));
        empleados.add(new ListaEmpleados(4L,"Elsy",4000000L, LocalDate.parse("2021-01-02"),""));
        empleados.add(new ListaEmpleados(5L,"Vincent",899999L, LocalDate.parse("2021-02-03"),""));
        empleados.add(new ListaEmpleados(3L,"Chelsea",59999L, LocalDate.parse("2021-01-02"),""));
        empleados.add(new ListaEmpleados(1L,"Adam",500000L, LocalDate.parse("2021-02-03"),""));
        empleados.add(new ListaEmpleados(2L,"Bolton",500000L, LocalDate.parse("2021-01-02"),""));
        empleados.add(new ListaEmpleados(6L,"Warden",1100000L, LocalDate.parse("2021-02-03"),""));
        empleados.add(new ListaEmpleados(3L,"Chelsea",1100000L, LocalDate.parse("2021-02-03"),""));
        return  empleados;
    }
}
