package Week1.Day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int inputnumber=153, Result=0, R, cubevalue=0, number=0;
		number = inputnumber;
		while (number > 0) {
			R = 0;
			R = number % 10;
			number = number/10;
			for (int i=0;i<3;i++)
				cubevalue = R * R * R;
			System.out.println("Cube of the Reminder : "+cubevalue);
			Result = Result + cubevalue;
		}
		if (Result == inputnumber)
			System.out.println("Given number is an Amstrong Number : "+Result);
		else
			System.out.println("Given number is not an Amstrong Number : "+Result);	
		}
}

