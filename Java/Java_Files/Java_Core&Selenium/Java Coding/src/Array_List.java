import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// array list is a class in java. Array list is array with dynamic size.
		ArrayList<String> a = new ArrayList<String> ();   //we can also use List<String> a = new ArrayList<String> (); because List is a superclass (base class or parent class).
		a.add("Harsh");
		a.add("Hi");
		String g ="mna";
		a.add(g);
		System.out.println(a);
		for(int i = 0; i<a.size();i++)    // we use size() for array list, and length() is used for array.
		{      System.out.print(a.get(i));   // we use a.get(i) for array list, and a[i] is used for array.
		System.out.print(" "+i + " "); //printing on the same line . println prints on new line. + " " is for space. + "\r " can be used for print on new line with System.out.print();
		}
		System.out.println(a.contains("Hi"));  //a.contains("Hi") method is present only in ArrayList not in normal array.
		Object[] name = {"hi", "we","Thug",619}; //using data type as Object can allow arraylist and list to have multiple data types.
		List<Object> nameArrayList = Arrays.asList(name);   // new is not used here,  class Arrays.asList(name) converts "name" array to a "nameArrayList" array list.
		System.out.println(name);    //if we use System.out.println(name); output is unexpected, limitations of traditional array, over array list.
		System.out.println(name[1]); 
		System.out.println(nameArrayList);
		System.out.println(nameArrayList.get(3));  
		//nameArrayList.addAll(a);
		//System.out.println(nameArrayList);
	}

}
 