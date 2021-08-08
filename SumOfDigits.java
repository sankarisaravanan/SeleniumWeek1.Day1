package Week1.Day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int inputnumber=154, SumDigits=0, digit=0;
		while (inputnumber > 0) {
			digit = inputnumber % 10;
			inputnumber = inputnumber/10;
			SumDigits = SumDigits + digit;
		}	
			System.out.println("Sum of Digits of the given number : "+SumDigits);
			
	}

}
