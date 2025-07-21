import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
	      a.add("hi");
	      a.add("thug");
	      a.add("john");
	      a.add("cena");
	   Iterator<String> it = a.iterator();                   //An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
	   while(it.hasNext()) { 
		   if(it.next()=="john")                      //iterator is not available for array.
		   { it.remove();  }                //removed john
		 
		 }
	   System.out.println(a);
//printing each element
	   Iterator<String> it1 = a.iterator();
	   while(it1.hasNext())      //at it.next()=="cena" , it1.hasNext() =false
	   {
	   	System.out.println(it1.next());                //initially the iterator pointer is before the first element.
	   }

	   //iterator in hashmap
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("hi", 1);
		hm.put("thug", 2);
		hm.put("cena", 3);
		hm.put("hood", 2);
		Iterator it2= hm.entrySet().iterator();
		while(it2.hasNext())
		{ System.out.println(it2.next());   }
	}

}
