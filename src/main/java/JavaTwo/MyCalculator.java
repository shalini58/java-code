package JavaTwo;

public class MyCalculator {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int subraction = calc.sub(40, 20);
		int addition =  calc.sum(20, 20, 20);
		double multiplication = calc.mul(100, 100);
		float division  = calc.div(100f, 50f);
		
		System.out.println("add =" +addition);
		System.out.println("sub = "+subraction);
		System.out.println("mul = "+multiplication);
		System.out.println("div = "+division);
		
		
	}

}
