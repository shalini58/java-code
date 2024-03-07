package JavaTwo;

public class PrintFactorial {

	public static void main(String[] args) {

		int input = 5;
		
		int fact = 1;
		
		for (int i = input; i > 0 ; i--) {
			fact = fact*i;
			
			
		}
		System.out.println(fact);
		
	}

}
