package app; //pacote que comporta a class Main

import utilidades.FuncoesUteis; //import do pacote utilidades

public class Main { //class Main 

	public static void main(String[] args) {
		  
			FuncoesUteis funcoes = new FuncoesUteis();

	        // teste do método soma
	        int resultadoSoma = funcoes.soma(5, 10);
	        System.out.println("Resultado da soma: " + resultadoSoma);
	
	        // teste da piramede de X
	        System.out.println("Triângulo de altura 5:");
	        funcoes.triangulo(9);
	}

}
