package JavaTwo;

public class PrintPrimeNumber {

	public static void main(String[] args) {

		int input = 20;
		
		int count = 0;
		
		for(int i=1 ; i<= input ; i++) {
			if( input % i == 0) {
				count++;	
			}
		}
		
		
		if(count == 2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime");
		}
			
		
	}

}
