package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonalTest {

	Personal personal;
	
	@BeforeEach
	void setUp(){
	personal = new Personal("123432G","Pepe",1200.0);
	}
	
	@Test
	@DisplayName("deberia dar el DNI")
	void Testgetdni() {
		String dniEsperado = "123432G";
		assertEquals(dniEsperado, personal.getDni());
	}
	
	@Test
	@DisplayName("deberia dar el nombre del personal")
	void Testgetnombre() {
		String nombreEsperado = "Pepe";
		assertEquals(nombreEsperado, personal.getNombre());
	}
	
	@Test
	@DisplayName("deberia dar el sueldo base")
	void TestgetsueldoBase() {
		double sueldobaseEsperado = 1200.0;
		assertEquals(sueldobaseEsperado, personal.getSueldoBase());
	}

	@Test
	@DisplayName("el sueldo base no puede ser negativo")
	void TestsetsueldoBase() {
		Exception exception = assertThrows(IllegalArgumentException.class,
				()->personal.setSueldoBase(-1100.0));
		String mensajeError = "el sueldo no deberia ser negativo";
		assertEquals(mensajeError, exception.getMessage());
		
	}
}
