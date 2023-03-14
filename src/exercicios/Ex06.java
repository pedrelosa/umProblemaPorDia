package exercicios;

/**
 * The sum of the squares of the first ten natural numbers is,
 * <p><span>1<sup>2</sup> + 2<sup>2</sup> + ... + 10<sup>2</sup> = 385</span></p>
 * The square of the sum of the first ten natural numbers is,
 * <p>(1 + 2 + ... + 10)<sup>2</sup> = 55<sup>2</sup> = 3025</p>
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * <p>3025 - 385 = 2640.</p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * */

public class Ex06 {
	public static void main(String[] args) {
		int sumOfSquare = 0, squareOfSum = 0, aux = 0, dif = 0;
		
		for (int i = 1; i <= 100; i++) {
			sumOfSquare += i*i;
		}
		
		aux = ((1+100)*100)/2;
		
		squareOfSum = aux * aux;
		
		dif =squareOfSum -sumOfSquare ;
		
		System.out.println("the diference between the Sum of Square and Square of Sum is: " + dif);
		
	}
}
