package util;

import java.util.Random;

/**
 * Classe respons�vel por gerar n�meros rand�micos.
 * @author Anderson Pereira (Andy)
 * @version 3
 */
public class NumeroRandomico {
	
	/**
	 * M�todo que gera um n�mero inteiro rand�mico dentro de um intervalo.
	 * @param maximo � o valor que delimita o intervalo.
	 * @return O n�mero rand�mico inteiro gerado.
	 * @see Random
	 */
	public static int gerarNumeroRandomico(int maximo) {
		int numero;
		Random geradorDeNumeros = new Random();
		numero = geradorDeNumeros.nextInt(maximo);
		return numero;
	}

}
