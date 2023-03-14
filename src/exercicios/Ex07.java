package exercicios;

public class Ex07 {
	public static void main(String[] args) {
		int count = 2, prime = 2;
		
		while (count < 10001){
			for (int i = 2; i < Math.sqrt(prime); i++) {
				if (prime%i==0){
					break;
				}
				if ((i+1)>Math.sqrt(prime)){
					count++;
				}
			}
			prime++;
		}
		System.out.println(prime);
	}
}
