import java.util.HashMap;

public class Count_of_char_in_Sentence {

	public static void main(String[] args) {
		String s = "   Hi my name is john'd cen!a12    ";
		String w = "   HI hi what is a a is what! is, a   ";
		
		char[] clean_s = s.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().strip().toCharArray();   // means keeps only these characters [^a-zA-Z0-9 ], also space is included after 9.
		
		String clean_w = w.replaceAll("[^a-zA-Z ]", "").toLowerCase().strip();
		
		String[] list_w= clean_w.split(" ");
		HashMap<Character,Integer> s_count= new HashMap<Character,Integer>();
		
	    for(char i:clean_s)
	    {
	    	if(s_count.get(i)==null)
	    	{
	    		s_count.put(i, 1);
	    	}
	    	else {
	    	s_count.put(i,s_count.get(i)+1 );}
	    }
	    System.out.println(clean_s);
	    System.out.println(s_count);
	    
	    HashMap<String,Integer>  w_count = new HashMap<String,Integer>();
	    
	    for(String i:list_w)
	    {
	    	if(w_count.get(i)==null)
	    	{
	    		w_count.put(i, 1);
	    	}
	    	
	    	else
	    	{
	    		w_count.put(i, w_count.get(i)+1);
	    	}
	    	
	    }
	    System.out.println(clean_w);
	    System.out.println(w_count);
	    
	}

}
