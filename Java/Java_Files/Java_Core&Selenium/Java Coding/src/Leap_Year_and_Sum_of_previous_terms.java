
public class Leap_Year_and_Sum_of_previous_terms {

	public static void main(String[] args) {
		int a =5;
		int M=1;
		int b = 0;
		int sum =0;
		System.out.print(M+ " ");
		for(int i=0;i<a;i++)
		{
			sum = sum + M;
			System.out.print(sum + " ");
			M=sum;
			
		}
		
       int y = 2024;
       
       if (y%100==0 && y%400==0)    //&& is AND operator  ., || is OR operator.
       {System.out.print("\n" + y + " is a leap year ");}  // \n is for a new line
       
       else if (y%100!=0 && y%4==0)
       {System.out.print("\n" + y + " is a leap year ");}
       else
       {System.out.print("\n" + y + " is not a leap year ");}  
	}

}
