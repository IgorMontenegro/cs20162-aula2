package com.github.IgorMontenegro;

/**
 * Exercício para aula2.
 */
public class Exercicio {
	/**
	 * 
	 * @param n
	 *         variável limite da soma dos naturais
	 * 
	 * @return soma dos números naturais até n
	 */
	public static int somaNaturais(int n) {

		if (n <= 0) {
			throw new IllegalArgumentException("Entrada inválido (numero menor que zero)");
		}
		int i = 2;
		int s = 1;

		while (i <= n) {
			s = s + i;
			i++;
		}
		return s;
	}

	/**
	 * @param a
	 *         quantidade do número de parcelas
	 * @param b
	 *         valor de parcela
	 * 
	 * @return resultado
	 */
	public static int produto(int a, int b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Entrada inválido (numero menor que zero)");
		}
		int totalParcelas = a;
		int parcela = b;
		if (b < a) {
			totalParcelas = b;
			parcela = a;
		}

		int i = 1;
		int s = 0;
		while (i <= totalParcelas) {
			s = s + parcela;
			i++;
		}
		return s;
	}

	/**
	 * @param x
	 *         número natural
	 * @param y
	 *         valor da potencia
	 * 
	 * @return resultado da potencia usando soma
	 */
	public static int potencia(int x, int y) {
		if (x <= 0 || y <= 0) {
			throw new IllegalArgumentException("Entrada inválido (numero menor que zero)");
		}
		int potencia = 1;
		int i = 1;
		while (i <= y) {
			potencia = produto(potencia, x);
			i++;
		}
		return potencia;
	}

	/**
	 * @param n
	 *         número válido
	 *         
	 * @return booleano se o valor informado satisfaz ou nao a propriedade 3025
	 */
	public static boolean propriedade3025(int n) {
		if (n <= 0 || n >= 9999) {
			throw new IllegalArgumentException("Entrada inválido (numero menor que zero ou maior que 9999)");
		}
		int i = n / 100;
		int j = n % 100;

		return n == potencia(i + j, 2);
	}

	/**
	 * @param n
	 *         número válido
	 * 
	 * @return booleano se o valor informado satisfaz ou nao a propriedade 153
	 */
	public static boolean propriedade153(int n) {
		if (n <= 0 || n >= 9999) {
			throw new IllegalArgumentException("Entrada inválido (numero menor que zero ou maior que 9999)");
		}
		int i = n / 100;
		int j = (n - (100 * i)) / 10;
		int k = n % 10;
		return n == (potencia(i, 3) + potencia(j, 3) + potencia(k, 3));
	}

	/**
	 * @param n
	 *         número válido
	 * 
	 * @return booleano se o valor informado é ou nao a um numero primo
	 */

	public static boolean primo(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("Entrada inválido (numero menor que 1)");
		}

		int i = 2;
		while (i <= (n - 1)) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	/**
	 * @param n
	 *         número válido
	 *         
	 * @return número harmônico
	 */
	public static int numeroHarmonico(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("Entrada inválido (numero menor que 1)");
		}
		int i = 2;
		int s = 1;
		while (i <= n) {
			s = s + (1 / i);
			i++;
		}
		return s;
	}

}
