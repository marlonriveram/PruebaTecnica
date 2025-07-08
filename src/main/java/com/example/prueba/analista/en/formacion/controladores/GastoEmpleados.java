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
@RequestMapping("/api/gastos")
public class GastoEmpleados {
    @Autowired
    SumarGastosPorEmpleadoServicio resumenGastoEmpleado;
    // simulacion coneccion db
    List<ListaEmpleados> gastoEmpleados = fakeDB.ObtenerGatos();

    @GetMapping("/gasto-total-empleados")
    public List<GastoTotalEmpleado> obtenerGastos() {
        List<GastoTotalEmpleado> listaOrdenAlf = resumenGastoEmpleado.totalGatos(gastoEmpleados);

        listaOrdenAlf.sort(Comparator.comparing(GastoTotalEmpleado::getNombreEmpleado));
        return listaOrdenAlf;
    }


    @GetMapping("/gasto-empleados-iva")
    public List<GastoTotalEmpleado> gastoConIva() {
        List<GastoTotalEmpleado> listaOrdenAlf = resumenGastoEmpleado.totalGatos(gastoEmpleados);

        listaOrdenAlf.sort(Comparator.comparing(GastoTotalEmpleado::getNombreEmpleado));
        return listaOrdenAlf;
    }
}
