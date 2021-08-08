package Week1.Day1;

public class FactorialNumber {

	public static void main(String[] args) {
		int inputnumber=5, factorial=1;
		System.out.print(" Factorial of the given number "+inputnumber+ " : ");
		for (int i=inputnumber; i>0 ; i--) {
			factorial = factorial * i;
			System.out.print(i + " * ");
			
		}	
			System.out.print(" = "+factorial);
			

	}

}
