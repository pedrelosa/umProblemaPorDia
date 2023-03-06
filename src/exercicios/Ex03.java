package exercicios;

/**
 * ingles:The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * portugues:Os fatores primos de 13195 são 5, 7, 13 e 29.
 * Qual é o maior fator primo do número 600851475143?
 */
public class Ex03 {
	public static void main(String[] args) {
		long n = 600_851_475_143L, prime = 1L;
		
		while (n != 1L){
			prime++;
			if (n%prime==0){
				n = n/prime;
			}
		}
		
		System.out.println(prime);
		
	}
}
