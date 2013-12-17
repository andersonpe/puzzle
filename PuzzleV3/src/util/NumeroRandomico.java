package util;

import java.util.Random;

/**
 * Classe responsável por gerar números randômicos.
 * @author Anderson Pereira (Andy)
 * @version 3
 */
public class NumeroRandomico {
	
	/**
	 * Método que gera um número inteiro randômico dentro de um intervalo.
	 * @param maximo É o valor que delimita o intervalo.
	 * @return O número randômico inteiro gerado.
	 * @see Random
	 */
	public static int gerarNumeroRandomico(int maximo) {
		int numero;
		Random geradorDeNumeros = new Random();
		numero = geradorDeNumeros.nextInt(maximo);
		return numero;
	}

}
