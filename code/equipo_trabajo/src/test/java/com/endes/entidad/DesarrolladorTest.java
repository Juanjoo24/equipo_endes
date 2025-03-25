package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DesarrolladorTest {
	
	Desarrollador desarrollador;
	

	@BeforeEach
	void test() {
		desarrollador = new Desarrollador("111112J", "Juan", 1200.0,"java");
	}

	@Test
	@DisplayName("deberia dar el lenguaje principal del desarrollador")
	void Testgetlenguaprincipal() {
		String LenguajeprincipalEsperado = "java";
		assertEquals(LenguajeprincipalEsperado, desarrollador.getLenguajePrincipal());
	}
	
	@Test
	@DisplayName("deberia dar el total de productividad")
	void TestCalcularProductividad() {
		
	String LenguajeprincipalEsperado = "java";
	double sueldobase = 1200.0;
	double incremento = 1.10;
	double extra = sueldobase * incremento;
	
 assertEquals(extra, desarrollador.calcularProductividad());
	}
	
	
}
