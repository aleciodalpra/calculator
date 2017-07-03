/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.calculadora;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 * Teste unitário da calculadora básica
 * @author Alécio Delprá, Fábio Castilhos, Leandro Akira, Vinicius Schaarschmidt e Wagner Pedrosa
 * Executa as operações de soma, multiplicação e subtração.  
 */
public class CalculadoraTest {

	Calculadora calculadora;
	
	@Before
	public void inicio(){
		calculadora = new Calculadora();
	}
	
	@Test
	public void deveSomar() {
		Integer resultado = calculadora.Somar(30, 20);
		Integer resultadoEsperado = 50;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void deveMultiplicar(){
		Integer resultado = calculadora.Multiplicar(5, 3);
		Integer resultadoEsperado = 15;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void deveSubtrair(){
		Integer resultado = calculadora.Subtrair(10, 60);
		Integer resultadoEsperado = 50;
		assertEquals(resultadoEsperado, resultado);
	}

}
