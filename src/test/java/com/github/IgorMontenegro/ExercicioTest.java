package com.github.IgorMontenegro;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExercicioTest {

	// Tests case da Soma dos Números naturais ( algoritmo 2 )
	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroNaSomaTest() {
		Exercicio.somaNaturais(0);
	}
	
	@Test
	public void valorArbitrarioParaSomaTest() {
		assertEquals(6, Exercicio.somaNaturais(3));
	}	

}
