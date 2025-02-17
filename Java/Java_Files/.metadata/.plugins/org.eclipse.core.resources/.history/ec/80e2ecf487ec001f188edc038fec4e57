import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IBM {

	public static void main(String[] args) {
		String[] str = {"a","b","c","d","a","b","c","c","a","c"};
		List<String> l = new ArrayList<String>();
		List<String> l1 = new ArrayList<String>();
		for(int i =0; i<str.length;i++)
		{
			if(l.contains(str[i]) == false)
			{
				l.add(str[i]);
				l1.add(str[i]);
		     }
			
			else
			{   
				String s = str[i]+Collections.frequency(l1, str[i]);
				l1.add(str[i]);
				l.add(s);
			}
		}
		
		System.out.println(l);

	}

}
