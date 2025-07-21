
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h = new HashMap<String,Integer>();
        h.put("John", 2);    //hashmap can have duplicate values but not keys.
        h.put("Thug", 2);
        h.put("Harsh", 3);   //in hashmap elements are not stored in the order they are inserted.
        
        Set<Entry<String,Integer>> entryset = h.entrySet();   //used for iteration
        // Default Capacity of Hashmap is 16, Load Factor is 75%of16=12, Threshold = Capacity(16)*Load Factor (12).
        // if key is integer, Key%10 is the index(hash value) where key value pair will be stored(hash function). Index for hashmap also starts from 0.
        for(Entry entry : entryset ) 
        {
        	System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
        h.containsKey("Harsh");
        h.containsValue(2);
        HashMap<String,Integer> h1 = new HashMap<String,Integer>();
        h1.put("King", 18);
        h1.put("hammer", 18);
        h1.putAll(h);  //adding all the elements of h in h1.
        
        Set<Entry<String,Integer>> entryset1 = h1.entrySet();   //used for iteration
        h1.remove("John");
        h1.replace("Harsh", 0);
        System.out.println("Entering all the values of h1+h");
        for(Entry entry : entryset1 )
        {   
        	System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
        Set<String> keys = h1.keySet();
        
        Collection<Integer> values = h1.values();
        System.out.println("Printing all the values");
        for(Integer value : values)
        {
        	System.out.println(value);
        }
        
        //sort hashmap.
        HashMap<String,Integer> h2 = new HashMap<String,Integer>();
        h2.put("c", 3);
        h2.put("a", 1);
        h2.put("b", 2);
        h2.put("d", 4);
        Set<String> entryset2 = h2.keySet();
        
        String[] s =new String[entryset2.size()];
        int i=0;
        for(String entry : entryset2)
        {
        	s[i] = entry;
        	i++;
        }
        Arrays.sort(s);
        for(int i1=0;i1<s.length;i1++)
        {
        	System.out.println("Sorted hashmap " + s[i1]+" : "+h2.get(s[i1]));
        }
	}

}
-+