import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ascending_Order {

	public static void main(String[] args) {
		
		
		
		Integer[] lm =  {12,43,256,-90,834,90,76};    //converting int list to int arraylist
		
		List<Integer> lmk = Arrays.asList(lm); 
		
		for (int i =0; i <lm.length;i++) {                   //operation on list
			for (int j=i+1; j <lm.length;j++) {
				if (lm[i] <= lm[j]) {
					int k = lm[i];
					lm[i] = lm[j] ;
					lm[j] = k;
					
				}
				
			}
		}
		
		for (int i =0; i <lmk.size();i++) {                       //operation on arraylist
			for (int j=i+1; j <lmk.size();j++) {
				if (lmk.get(i) <= lmk.get(j)) {
					int k = lmk.get(i);
					lmk.set(i, lm[j])  ;
					lmk.set(j, k);
					
				}
				
			}
		}
	
	System.out.println(lmk.size());
	System.out.println(lmk);
	System.out.println(lm[0]);
}}
