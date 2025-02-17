import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift_in_List_Method3_Using_If_Else {

	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5,6};
		List<Integer> c = Arrays.asList(a);   //changes in "c" will also change "a" due to same reference. Here we can't perform all array list functions on "c" as all operations are not possible on list "a". eg: c.addAll(); as size of "a" is fixed.
		ArrayList<Integer> b = new ArrayList<Integer>(c);   //here change in list b will not change list c.
		int k =7;
		k = k /c.size();   //once k  becomes larger than c's list size we divide.


		for (int i = 0; i< c.size(); i++)   

			
		{     if (i+k<c.size())
		         {b.set(i+k, c.get(i));}
		     else
		         { b.set(i+k-c.size(), c.get(i));}
			

		}
		System.out.println(b);
		System.out.println(c);
	    b.addAll(c);
	    System.out.println(b);     //added all elements of list c to list b.
	}

}
