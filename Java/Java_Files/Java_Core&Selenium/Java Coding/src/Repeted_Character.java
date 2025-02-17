import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Repeted_Character {

	public static void main(String[] args) {
		String k = "Vosllllyaaslyy";
		String m ="";
		char m1 = 0;  //char is fixed length data type can store string, number, special characters.

		for (int i = 0; i < k.length();i++ ) {
			char l1=k.charAt(i);  //char at index i is assigned to l1
			if (l1 != m1 ) {
				m = m +l1;
				m1= l1;
				
			}
		}
		System.out.print(m);
		if (k.contains("osllll"))
		{
			System.out.println('\n' + "present");  //\n is for new line.
		}
		else
		{System.out.println('\n' + "not present"); } 
		
 //printing unique elements.
		String str = "helliidkfddhl";
		String ml = "";
		for (int i =0; i <str.length();i++)
		{   
			if (ml.contains(String.valueOf(str.charAt(i)))== false)
			{ml=ml + str.charAt(i);
			}
			
		}
	System.out.println(ml);
	
	//printing string count
	String str1 = "helliidkfddhl"; 
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	String m11 = "";
	int c=1;
	for (int i =0; i <str1.length();i++)
	{   if ( m11.contains(String.valueOf(str1.charAt(i))) == false)
	{
		for (int j =i+1; j <str1.length();j++)
			
			
		{if (str1.charAt(i)==str1.charAt(j))  
			
		{ c=c+1;
		m11=m11+str1.charAt(i);}
		}
		System.out.println(str1.charAt(i)+" : "+c);
		hm.put(str1.charAt(i), c);
		c=1;
		}}
	
	
	
	
	
	
	System.out.println(hm);
	
	}

}
