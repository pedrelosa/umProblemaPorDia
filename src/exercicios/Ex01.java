package exercicios;

/**
 * <strong>inglês:</strong> <p>If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23
 * Find the sum of all the multiples of 3 or 5 below 1000.</p>
 * </br>
 * <strong>português:</strong> <p>Se listarmos todos os números naturais abaixo de 10 que são múltiplos de 3 ou 5, obtemos
 * 3, 5, 6 e 9. A soma desses múltiplos é 23.
 * Encontre a soma de todos os múltiplos de 3 ou 5 abaixo de 1000.</p>
 */

public class Ex01 {
	public static void main(String[] args) {
		int resultado = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i%3 == 0 || i%5 ==0){
				resultado += i;
			}
		}
		
		System.out.println("A soma de todos os numeros múltiplos de 3 ou 5 abaixo de 1000 é: " + resultado);
	}
}
