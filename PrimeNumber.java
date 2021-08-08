package Week1.Day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int inputNumber=19, Reminder=0;
		boolean flag1=false;
		for (int i = 2; i <= inputNumber/2 ; i++) {
			Reminder = inputNumber % i;
			if ( Reminder == 0 ) {
				flag1 = true;
				break;
			}
		}
        if (flag1) {
			System.out.println("Given Number "+inputNumber +" is not a Prime number");
		} else {
			System.out.println("Given Number "+inputNumber +" is a Prime number");
		}
	}

}
