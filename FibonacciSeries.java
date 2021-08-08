package Week1.Day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int inputRange=10, i=3, firstNum=0, secondNum=1, nextNum=0;
		System.out.print("Fibonacci Series : " + firstNum + "," + secondNum);
		while (i <= inputRange) {
			nextNum = firstNum + secondNum;
			System.out.print("," + nextNum);
			firstNum = secondNum;
			secondNum = nextNum;
			i++;
		}

	}

}
