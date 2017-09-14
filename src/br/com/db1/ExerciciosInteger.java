package br.com.db1;

public class ExerciciosInteger {

	private Integer resultado;
	private Integer valor1;
	private Integer valor2;

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public Integer exibirResultado() {
		return resultado;
	}

	public void soma(Integer valor1, Integer valor2) {
		resultado = valor1 + valor2;
	}

	public void subtracao(Integer valor1, Integer valor2) {
		resultado = valor1 - valor2;
	}

	public void multiplicacao(Integer valor1, Integer valor2) {
		resultado = valor1 * valor2;
	}

	public void divisao(Integer valor1, Integer valor2) {
		resultado = valor1 / valor2;
	}

	public void numeroPar(Integer valor1) {
		resultado = valor1 % 2;
	}

	public void maiorNumero(Integer valor1, Integer valor2) {
		if (valor1 < valor2) {
			resultado = valor2;
		} else {
			resultado = valor1;
		}
	}

	public Integer[] numerosImpares(Integer valor1) {
		Integer contador = 0;
		Integer[] impares = new Integer[50];
		for (Integer x = valor1; x < 100; x++) {
			if (x % 2 != 0) {
				System.out.println(x);
				impares[contador] = x;
				contador++;
			}
		}
		return impares;
	}

}
