import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is an object that represents multiple sequence of characters  //String literal method to create string, uses less space as even with same  characters already present in a different object, new object uses characters already present in that different object . 



		// String s1 = "Rahul Shetty Academy";

		String s5 = "hello";
		String s6 = "hello";





		//new memory allocate operator method to create string, uses more space as even with same  characters already present in different string, new object is created. 

		String s2 = new String("Welcome");

		String s3 = new String("Welcome");
 


		String s = "Rahul Shetty Academy";

		String[] splittedString = s.split("Shetty");  //Shetty is eliminated in splittedString because of split.

		System.out.println(splittedString[0]); 

		System.out.println(splittedString[1]);

		System.out.println(splittedString[1].trim());  //removes single white space, strip removes multiple white spaces.

		for(int i =s.length()-1;i>=0;i--)   //print in reverse

		{



		System.out.print(s.charAt(i));   //we used s.charAt(i) to print individual characters of string.

		}
		System.out.print("\n");
		String m= "";                //print in reverse single row.       
		String Website= "Hi my name is 'Thug'.";
		for(int k=Website.length()-1;k>=0;k--)
		{System.out.println(Website.charAt(k));
		m=m + Website.charAt(k);
		}
		System.out.println(m);
		
		// count of word in string.
		
		String m1 = "Hi, my Hi Thug Cena Hi Thug Thug my Thug";

		String[] a11 = m1.split("\\W");  //split by regex.
		List<String> a1 = Arrays.asList(a11);
		System.out.println(a1);
		System.out.println(a1.get(1));
		ArrayList<String>  b1 = new ArrayList<String>();
		int l1 =0;
		for(int i =0; i<a11.length;i++) {
			l1=0;
		   for (int j = 0; j < a1.size();j++)
		   { if (a1.get(i).equals(a1.get(j)))           //don't use if (a1.get(i)== a1.get(j))    //we can also use "l1 = Collections.frequency(a1, a1.get(i));" 
		       { l1= l1+1;}
		   }
		   if (b1.contains(a1.get(i)) == false)	
			{ b1.add(a1.get(i)) ; 
			System.out.println(a1.get(i) + ":"+ l1);
			}
			
			}
				
		
		System.out.println(b1);	
	}

}
