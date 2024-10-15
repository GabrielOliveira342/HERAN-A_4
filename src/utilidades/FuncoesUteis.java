package utilidades; //pacote utilidades 

public class FuncoesUteis { //class FuncoesUteis
	   
		public int soma(int a, int b) { //metodo para soma 
	        return a + b;
	    }

	    // metodo que imprime um triângulo de altura especificada
	    public void triangulo(int altura) {
	        for (int i = 1; i <= altura; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print("x");
	            }
	            System.out.println();
	        }
	    }
}
