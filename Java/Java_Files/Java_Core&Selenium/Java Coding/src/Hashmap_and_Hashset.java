
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hashmap_and_Hashset {

	public static void main(String[] args) {
		String str  = "hi thug how the game of the";
		HashMap<String,Integer> hm = new HashMap<String,Integer>();     //elements in set are not stored in the same sequence in which they area added in hashmap.
		int c= 0;
		for (int i = 0; i< str.length();i++)                            //for then if the for the if
		{if (hm.containsKey(str.charAt(i)) ==false)                //this step is not necessary as Hashmap doesn't stores duplicate keys and updates key if provided again.
		{  for (int i1 = 0; i1< str.length();i1++) 
			
			{
			 if ( str.charAt(i) == str.charAt(i1))
			{  c=c+1;}
			
			
			}
		hm.put(String.valueOf(str.charAt(i)), c);       //converting character to string to provide argument type as string.
		c=0; 
		}
		
		
		
		}

System.out.println(hm);
hm.remove(" ");
System.out.println(hm);
Set<String> k = hm.keySet();                //return type set.
Collection<Integer> v =hm.values();          // //return type Collection.
System.out.println(k);
System.out.println(v);
System.out.println(hm.get("t"));                      // t is key               
for (Map.Entry<String, Integer> rep : hm.entrySet())    //iteration in hashmap.     rep is name of iteration.
{    
	if (rep.getValue() > 1)  
{System.out.println(rep.getKey() + " is repeating");}
}

HashSet<Object> s = new HashSet<Object>();    //repeated data not allowed in String
s.add("Hi");                  //elements in set are not stored in the same sequence in which they area added so extraction by index is not available. Convert set to array or array list to extract by index.
s.add("Hi");
s.add("1");
s.add(1);
s.remove("Hi");
System.out.println(s); 
for (Object i : s)
{System.out.println(i); }


	}

}
