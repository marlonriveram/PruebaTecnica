package com.example.prueba.analista.en.formacion.modelos;

import java.time.LocalDate;

public class GastosMensualMasIva {
    private  String nombreEmpleado;
    private Integer mes;
    private Long totalGastoMes;
    private Long iva;
    private Long totalGastoMasIva;
    private String quienAsume;

    public GastosMensualMasIva(String nombreEmpleado, Integer mes, Long totalGastoMes, Long iva, Long totalGastoMasIva, String quienAsume) {
        this.nombreEmpleado = nombreEmpleado;
        this.mes = mes;
        this.totalGastoMes = totalGastoMes;
        this.iva = iva;
        this.totalGastoMasIva = totalGastoMasIva;
        this.quienAsume = quienAsume;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Long getTotalGastoMes() {
        return totalGastoMes;
    }

    public void setTotalGastoMes(Long totalGastoMes) {
        this.totalGastoMes = totalGastoMes;
    }

    public Long getIva() {
        return iva;
    }

    public void setIva(Long iva) {
        this.iva = iva;
    }

    public Long getTotalGastoMasIva() {
        return totalGastoMasIva;
    }

    public void setTotalGastoMasIva(Long totalGastoMasIva) {
        this.totalGastoMasIva = totalGastoMasIva;
    }

    public String getQuienAsume() {
        return quienAsume;
    }

    public void setQuienAsume(String quienAsume) {
        this.quienAsume = quienAsume;
    }

    @Override
    public String toString() {
        return "GastosMensualMasIva{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", mes=" + mes +
                ", totalGastoMes=" + totalGastoMes +
                ", iva=" + iva +
                ", totalGastoMasIva=" + totalGastoMasIva +
                ", quienAsume='" + quienAsume + '\'' +
                '}';
    }
}
