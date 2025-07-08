package com.example.prueba.analista.en.formacion.controladores;

import com.example.prueba.analista.en.formacion.db.fakeDB;
import com.example.prueba.analista.en.formacion.modelos.GastoTotalEmpleado;
import com.example.prueba.analista.en.formacion.modelos.ListaEmpleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.prueba.analista.en.formacion.servicios.SumarGastosPorEmpleadoServicio;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/gastototalporempleado")
public class GatoTotalEmpleadoContoller {
    @Autowired
    SumarGastosPorEmpleadoServicio resumenGastoEmpleado;
    // simulacion coneccion db
    List<ListaEmpleados> gastoEmpleados = fakeDB.ObtenerGatos();

    @GetMapping
    public List<GastoTotalEmpleado> obtenerGastos() {
        List<GastoTotalEmpleado> aux = resumenGastoEmpleado.totalGatos(gastoEmpleados);

        aux.sort(Comparator.comparing(GastoTotalEmpleado::getNombreEmpleado));
        return aux;
    }
}
