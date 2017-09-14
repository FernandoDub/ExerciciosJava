package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {

	private ExerciciosInteger exerciciosInteger = new ExerciciosInteger();

	@Test
	public void somaTest() {
		exerciciosInteger.soma(3, 5);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 8);
	}
	
	@Test
	public void subtracaoTest(){
		exerciciosInteger.subtracao(15, 5);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 10);
	}
	
	@Test
	public void multiplicacaoTest(){
		exerciciosInteger.multiplicacao(3, 5);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 15);
	}
	
	@Test
	public void divisao(){
		exerciciosInteger.divisao(20, 10);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 2);
	}
	
	@Test
	public void numeroPar(){
		exerciciosInteger.numeroPar(8);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 0);
	}
	
	@Test
	public void maiorNumero(){
		exerciciosInteger.maiorNumero(15, 13);
		Assert.assertTrue(exerciciosInteger.exibirResultado() == 15);
	}

	@Test
	public void numerosImpares(){
		Integer[] numerosImpares = exerciciosInteger.numerosImpares(97);
		Assert.assertTrue(numerosImpares[0] == 97);
		Assert.assertTrue(numerosImpares[1] == 99);
	}
}
