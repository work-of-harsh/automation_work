import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number with decimal");
		double x = obj.nextDouble();         //use different next methods as per the input.
		String x1 = obj.next();
		
		System.out.println(x+1);
		System.out.println(x1);

	}

}
