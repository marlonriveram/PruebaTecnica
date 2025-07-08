package com.example.prueba.analista.en.formacion.modelos;

public class GastoTotalEmpleado {
    private String nombreEmpleado;
    private Long totalGasto;

    public GastoTotalEmpleado(String nombreEmpleado, Long totalGasto) {
        this.nombreEmpleado = nombreEmpleado;
        this.totalGasto = totalGasto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Long getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(Long totalGasto) {
        this.totalGasto = totalGasto;
    }

    @Override
    public String toString() {
        return "{ \"empleado\": \"" + nombreEmpleado + "\", \"totalGastado\": " + totalGasto + " }";
    }

}
