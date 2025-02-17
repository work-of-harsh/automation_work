import java.util.ArrayList;
import java.util.List;

public class Reverse_number {

	public static void main(String[] args) {
		//method1
		int a = 786;
		String l = "";
		while (a!=0) {
			int k = a%10;
			l = l +  k; 
			a=   a/10; 
			
		}
		System.out.println(l);
		
		int k = Integer.parseInt(l);   // convert string into integer
		System.out.println(k+1);
		
		
		
		//method 2
		a=786;
		List<Integer> a2 = new ArrayList<Integer>();
		while(a!=0) {
			int k1 = a%10;
			a2.add(k1);
			a = a/10;
		}
		System.out.println(a2);
		
		//method3   reverse iteration
		int t = 0;
		int j =0;
		for (int i = a2.size()-1;i>=0; i--) {
			
			t = (int) (t + a2.get(j)*Math.pow(10, i));   //raise to the power in java.
			j = j+1;
		}
		System.out.println(t);
		
		//method4
		int t1 = 0;
		for (int i = 0; i<a2.size();i++)
		{ 
		 t1 = (int) (t1 + a2.get(i)*Math.pow(10, a2.size()-1-i));
			
		}
		System.out.println(t1);

}}
