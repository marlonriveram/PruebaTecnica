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
    public List<GastoTotalEmpleado> totalGatos(List<ListaEmpleados> gastoEmpleados) {

        // objeto vacio
        Map<String,Long> acumulador = new HashMap<>();

        for (ListaEmpleados gastoEmpleado : gastoEmpleados  ){
            String nombreEmpleado = gastoEmpleado.getNombreEmpleado();
            Long valorGasto = gastoEmpleado.getTotalGasto();

            if(acumulador.containsKey(nombreEmpleado)){

                Long valorGastoActual = acumulador.get(nombreEmpleado);

                acumulador.put(nombreEmpleado,valorGastoActual+valorGasto);

            }else {
                acumulador.put(nombreEmpleado,valorGasto);
            }
        }

        //  CONVERTIR A UNA LISTA DE OBJETOS
        List<GastoTotalEmpleado> resultado = new ArrayList<>();

        for (Map.Entry<String, Long> entry : acumulador.entrySet()) {
            resultado.add(new GastoTotalEmpleado(entry.getKey(), entry.getValue()));
        }

        return resultado;

    }
}
