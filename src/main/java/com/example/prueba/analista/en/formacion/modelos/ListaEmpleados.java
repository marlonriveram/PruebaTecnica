package com.example.prueba.analista.en.formacion.modelos;
import java.time.LocalDate;

public class ListaEmpleados {
    private Long id;
    private String nombreEmpleado;
    private Long totalGasto;
    private LocalDate fechaGasto;
    private String quienAsume = " ";

    public ListaEmpleados(Long id, String nombreEmpleado, Long totalGasto, LocalDate fechaGasto, String quienAsume) {
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.totalGasto = totalGasto;
        this.fechaGasto = fechaGasto;
        this.quienAsume = quienAsume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(LocalDate fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public String getQuienAsume() {
        return quienAsume;
    }

    public void setQuienAsume(String quienAsume) {
        this.quienAsume = quienAsume;
    }

    // se sobre escribe el metodo toString para que a la hora de imprimir los datos
    // se ve de una forma entendible con el formato que se queria ver

    @Override
    public String toString() {
        return "Gasto{" +
                "id=" + id +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", fechaGasto=" + fechaGasto +
                ", quienAsume='" + quienAsume + '\'' +
                '}';
    }

}
