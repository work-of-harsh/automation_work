import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_List_Operations {

	public static void main(String[] args) {

		Integer[] a = {1,2,3,4,4,5,6};
		List<Integer> c = Arrays.asList(a); 
		ArrayList<Integer> b = new ArrayList<Integer>(c);
		b.add(0, 23);     //adding values in list by index
		System.out.println(b);
		b.remove(0);           //removing values in list  by index
		System.out.println(b);
		//removing values in list  by value itself.
		for (int i =0; i < b.size();i++)      
		{if (b.get(i)== 3)
			
		{ b.remove(i);}
		}
		System.out.println(b); 
		b.add(6);
		b.add(6);
		System.out.println(Collections.max(b));  //finds max in list.
		System.out.println(Collections.frequency(b, 6));  //finds frequency of particular element.
		Collections.swap(b, 0, 1);   //swap by index
		System.out.println(b);
		Collections.rotate(b, -1);  //use +1 for clockwise rotate.
		System.out.println(b);
		Collections.replaceAll(b, 4, 44);   //replace by value
		System.out.println(b);
		System.out.println(b.indexOf(44));
		c= (List<Integer>) b.clone();
		c.add(43);
		
		System.out.println(b.containsAll(c));  //to check if all elements of c are in b.
		Collections.fill(b, 67);    //converts every element to 67.
		System.out.println(b);
		b.remove(Integer.valueOf(67));   //remove by value
		System.out.println(b);
		
	}}

	
