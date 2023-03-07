package exercicios;

/**
 * inglês: A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * <br>
 * português:Um número palindrômico lê o mesmo em ambos os sentidos. O maior palíndromo feito do produto de dois números de 2 dígitos é 9009 = 91 × 99.
 * Encontre o maior palíndromo feito do produto de dois números de 3 dígitos.
 */
public class Ex04 {
	public static void main(String[] args) {
		int produto, memo = 0, result = 0;
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				produto = j * i;
				//checking if it's a palindrome
				if (new StringBuilder(Integer.toString(produto)).reverse().toString()
						.equalsIgnoreCase(Integer.toString(produto))){
					//checking if it is greater than the previous one and storing
					if (produto < memo){
						result = memo;
					}
					memo = produto;
				}
			}
		}
		System.out.println(result);
	}
}
