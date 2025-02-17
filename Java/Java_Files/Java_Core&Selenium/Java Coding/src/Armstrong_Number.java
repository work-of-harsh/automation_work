import java.util.ArrayList;
import java.util.List;

public class Armstrong_Number {

	public static void main(String[] args) {
		int a = 1634;
		int k = a;
		List<Integer> m = new ArrayList<Integer>();
		while (a!=0)
		{int b = a%10;
		 m.add(b);
		 a=a/10;
		}
		System.out.println(m);
		int t = 0;
		for (int i = 0; i<m.size();i++)
		{ 
		 t = (int) ( t+ 1*Math.pow(m.get(i), m.size()));
			
		}
		System.out.println(t);

		if (k==t)
		{System.out.print("Number is Armstrong");}

		else
		{System.out.print("Number is not Armstrong");}


	}

}
