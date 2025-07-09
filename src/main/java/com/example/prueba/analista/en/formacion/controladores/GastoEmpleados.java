package com.example.prueba.analista.en.formacion.controladores;

import com.example.prueba.analista.en.formacion.db.fakeDB;
import com.example.prueba.analista.en.formacion.modelos.GastoTotalEmpleado;
import com.example.prueba.analista.en.formacion.modelos.GastosMensualMasIva;
import com.example.prueba.analista.en.formacion.modelos.ListaEmpleados;
import com.example.prueba.analista.en.formacion.servicios.GastoMensualMasIvaServicio;
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
    @Autowired
    GastoMensualMasIvaServicio gastoMensualMasIvaServicio;

    /*
    simulacion coneccion db :List<ListaEmpleados> gastoEmpleados = fakeDB.ObtenerGatos();
    si en otro momento se hace la conexión a una base de datos real es solo hacer la
    conexión y reempalzar esta linea por la conexión real.
    */

    List<ListaEmpleados> gastoEmpleados = fakeDB.ObtenerGatos();

    @GetMapping("/total")
    public List<GastoTotalEmpleado> obtenerGastos() {
        List<GastoTotalEmpleado> listaOrdenAlf = resumenGastoEmpleado.totalGatos(gastoEmpleados);

        listaOrdenAlf.sort(Comparator.comparing(GastoTotalEmpleado::getNombreEmpleado));
        return listaOrdenAlf;
    }


    @GetMapping("/iva")
    public List<GastosMensualMasIva> gastoConIva() {
       List<GastosMensualMasIva> gastoMasIva = gastoMensualMasIvaServicio.prueba(gastoEmpleados);

       gastoMasIva.sort(Comparator.comparing(GastosMensualMasIva::getNombreEmpleado));
       return  gastoMasIva;
    }

    @GetMapping("/empleados")
    public List<ListaEmpleados> listaGastos() {
        return  gastoEmpleados;
    }
}
