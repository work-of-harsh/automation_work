import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Shift_Direct {

	public static void main(String[] args) {
		Integer[] l = {1,2,3,4,5,6};
		
		List<Integer> l1=  new ArrayList<Integer>(Arrays.asList(l));
		System.out.println(l1);
		Integer k=6%l1.size();
		
		
		for(int i=0;i<l1.size();i++)
		{
			if(i+k<l1.size())
			{
				l1.set(i+k, l[i]);
			}
			else
			{
				l1.set(i+k-l1.size(), l[i]);
			}
		}
        System.out.println(l1);

	}

}