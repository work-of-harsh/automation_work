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
	
		//hashcode of both is same, as "hello" is stored in string pool and both point to the same reference, to save memory.
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		s6 = "hello world";   //s6 now refers to new string object "hello world", "hello" still exists in the string pool.
		System.out.println(s6.hashCode());
		//string is immutable,new object is created when updated.




		//new memory allocate operator method to create string, uses more space as even with same  characters already present in different string, new object is created. 
        
		String s2 = new String("Welcome");

		String s3 = new String("Welcome"); 
	//creates two objects
		//In string pool :"Welcome"
		//In heap memory: a new string object referring to the pool's "Welcome".
		
		
		//using mutable strings: StringBuffer,StringBuilder
		//StringBuffer is multi thread safe: when multiple threads are modifying the same string.
		StringBuffer sb= new StringBuffer("Hello");
		System.out.println(sb.hashCode()+ " of stringbuffer "+ sb);
		sb.append("Thug");
		System.out.println(sb.hashCode()+ " of stringbuffer "+ sb);
		
		StringBuilder sb1= new StringBuilder("Hello");
		System.out.println(sb1.hashCode()+ " of stringbuilder "+ sb1);
		sb1.append("King");
		System.out.println(sb1.hashCode()+ " of stringbuilder  "+ sb1);
 


		String s = "Rahul Shetty Academy";
		System.out.println(s.substring(1, 3)+ " example of slicing"); //last index not included.
		String[] splittedString = s.split("Shetty");  //Shetty is eliminated in splittedString because of split.

		System.out.println(splittedString[0]); 

		System.out.println(splittedString[1]);

		System.out.println(splittedString[1].trim());  //removes single white space, strip removes multiple white spaces.
        String rep= s.replace("a", "xx"); // we need to catch it in new object., here rep.
        System.out.println(rep+ " :string replaced"); 
		for(int i =s.length()-1;i>=0;i--)   //print in reverse

		{



		System.out.print(s.charAt(i));   //we used s.charAt(i) to print individual characters of string.

		}
		System.out.print("\n");
		String m= "";                //print in reverse single row.       
		String Website= "Hi my name is 'Thug!.";
		for(int k=Website.length()-1;k>=0;k--)
		{System.out.println(Website.charAt(k));
		m=m + Website.charAt(k);
		}
		System.out.println(m);
		
		// count of word in string.
		
		String m1 = "Hi, my Hi Thug Cena Hi Thug Thug my Thug!";

		String[] a11 = m1.split("\\W");  //split by regex.
		List<String> a1 = Arrays.asList(a11);
		System.out.println(a1);
		System.out.println(a1.get(0));
		ArrayList<String>  b1 = new ArrayList<String>();
		int l1 =0;
		for(int i =0; i<a11.length;i++) {
			l1=0;
		   for (int j = 0; j < a1.size();j++)
		   { if (a1.get(i).equals(a1.get(j)))           //don't use if(a1.get(i)== a1.get(j))    //we can also use "l1 = Collections.frequency(a1, a1.get(i));" 
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
