package com.example.prueba.analista.en.formacion.servicios;

import com.example.prueba.analista.en.formacion.modelos.GastoTotalEmpleado;
import com.example.prueba.analista.en.formacion.modelos.ListaEmpleados;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SumarGastosPorEmpleadoServicio {
    public List<GastoTotalEmpleado> totalGatos(List<ListaEmpleados> empleados) {

        Map<String, GastoTotalEmpleado> acumulador = new HashMap<>();

        for (ListaEmpleados empleado : empleados) {
            String nombre = empleado.getNombreEmpleado();
            Long gasto = empleado.getTotalGasto();

            if (acumulador.containsKey(nombre)) {

                GastoTotalEmpleado existente = acumulador.get(nombre);
                Long nuevoTotal = existente.getTotalGasto() + gasto;
                existente.setTotalGasto(nuevoTotal);
            } else {

                GastoTotalEmpleado nuevo = new GastoTotalEmpleado(nombre, gasto);
                acumulador.put(nombre, nuevo);
            }
        }

        return new ArrayList<>(acumulador.values());
    }
}

