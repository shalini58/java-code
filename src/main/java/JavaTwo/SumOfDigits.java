package JavaTwo;

public class SumOfDigits {

	public static void main(String[] args) {

		int input = 5555;
		
		int sum = 0;
		while(input > 10 ) {
			int rem = input % 10;
			sum = sum + rem;
			input = input/10;
		}
		System.out.println(sum);
	}

}
