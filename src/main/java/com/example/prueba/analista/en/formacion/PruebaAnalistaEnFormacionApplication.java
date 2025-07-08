package com.example.prueba.analista.en.formacion;

import modelos.ListaEmpleados;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static db.fakeDB.ObtenerGatos;

@SpringBootApplication
public class PruebaAnalistaEnFormacionApplication {

	public static void main(String[] args) {

		SpringApplication.run(PruebaAnalistaEnFormacionApplication.class, args);

		List<ListaEmpleados> empleados = ObtenerGatos();
		for (ListaEmpleados empleado : empleados) {
			System.out.println(empleado);
		}
	}

}
