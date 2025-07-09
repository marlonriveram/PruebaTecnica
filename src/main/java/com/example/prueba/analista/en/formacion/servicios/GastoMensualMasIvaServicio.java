package com.example.prueba.analista.en.formacion.servicios;

import com.example.prueba.analista.en.formacion.modelos.GastosMensualMasIva;
import com.example.prueba.analista.en.formacion.modelos.ListaEmpleados;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class GastoMensualMasIvaServicio {

    public List<GastosMensualMasIva> prueba(List<ListaEmpleados> empleados) {

        Map<String, GastosMensualMasIva> acumulador = new HashMap<>();

        for (ListaEmpleados empleado : empleados) {
            String nombre = empleado.getNombreEmpleado();
            int mes = empleado.getFechaGasto().getMonth().getValue();
            long gasto = empleado.getTotalGasto();

            String clave = nombre + "-" + mes;

            if (acumulador.containsKey(clave)) {
                GastosMensualMasIva registro = acumulador.get(clave);
                long nuevoTotal = registro.getTotalGastoMes() + gasto;
                long nuevoIva = Math.round(nuevoTotal * 0.19);
                registro.setTotalGastoMes(nuevoTotal);
                registro.setIva(nuevoIva);
                registro.setTotalGastoMasIva(nuevoTotal + nuevoIva);
            } else {
                long iva = Math.round(gasto * 0.19);

                GastosMensualMasIva nuevo = new GastosMensualMasIva(
                        nombre,
                        mes,
                        gasto,
                        iva,
                        gasto + iva,
                        gasto + iva> 1000000 ? "Empleado" : "Empresa"
                );
                acumulador.put(clave, nuevo);
            }
        }

        return new ArrayList<>(acumulador.values());
    }
}
