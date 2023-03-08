package exercicios;

/**
 * inglês:2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without
 * any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * português:2520 é o menor número que pode ser dividido por cada um dos números de 1 a 10 sem deixar
 * resto.
 * Qual é o menor número positivo que é igualmente divisível por todos os números de 1 a 20?
 */
public class Ex05 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int num = 2520, count=0;
		boolean isDivisible = false;
		while (!isDivisible){
			num += 20;//I put the sum of 20 in 20 as it would save half the processing
			for (int i = 1; i <= 20; i++) {
				if (num%i==0){
					count++;
				}else {//Processing time gain of 83% if the sum of each loop is
					// 2 instead of 20
					break;
				}
			}
			if (count==20){
				isDivisible = true;
			}else {
				count = 0;
			}
		}
		System.out.println(num);
		long end = System.currentTimeMillis();
		long totalTime = end - start;
		System.out.println("Total running time: " + totalTime + " milliseconds");
	}
}
