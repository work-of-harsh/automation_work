import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift_in_List_Method1_Using_add {
	
public static void main(String[] args) {

Integer[] a = {1,2,3,4,5,6};
List<Integer> c = Arrays.asList(a);  //changes in "c" will also change "a" due to same reference. Here we can't perform all array list functions on "c" as all operations are not possible on list "a". eg: c.addAll(); as size of "a" is fixed.
ArrayList<Integer> b = new ArrayList<Integer>();
int k =3;


for (int j = 0; j < k; j ++) 
{b.add(c.get(c.size()-1));

for (int i = 1; i< c.size(); i++)   //shift by one place

	
{ 
	b.add(c.get(i-1));

}
c= (List<Integer>) b.clone();     //array list c becomes equal to array list b.   Don't directly use c=b as changes in c will also change b due to same reference.
b.clear();        //empty the list.
}

System.out.println(c);
System.out.println(a[0]);

}}


