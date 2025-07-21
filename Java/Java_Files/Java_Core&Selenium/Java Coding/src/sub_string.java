import java.util.ArrayList;
import java.util.List;

public class sub_string {

public static void main(String[] args) {


	String s ="ababadedh";
	
	
	List<String> sub_string = new ArrayList<String>();
	
	for (int i=0; i<s.length();i++)
	{
		for(int j=i+1; j<s.length()+1;j++)
		{
			sub_string.add(s.substring(i, j));    //string slicing
			//sub_string.subList(i, i)  list slicing
		}
	}
	
	
	System.out.println(sub_string);
	string_reverse(s);
	
	System.out.println(sub_string.subList(0, 2)); //list slicing


}

public static void string_reverse(String s)
{   String st="";
    
	for(char i:s.toCharArray())
	{
		st=i+st;
	}
	System.out.println(st);
}

}