import java.util.HashMap;

public class Count_of_char_in_Sentence {

	public static void main(String[] args) {
		String str = " hi thig here ";

HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
str = str.strip();
String[] s = str.split(" ");
for(int j = 0; j <s.length;j++)
{
	String s2 = s[j];
	for(int i =0; i< s2.length();i++)
	{  
		
	if(hm.containsKey(s2.charAt(i))==false)
	{
		hm.put(s2.charAt(i),1 );
	}
	else 
	{
		hm.put(s2.charAt(i), hm.get(s2.charAt(i))+1);
	}
	
	}
}
System.out.println(hm);



	}

}
