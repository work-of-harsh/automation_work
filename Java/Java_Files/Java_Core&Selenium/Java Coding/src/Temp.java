import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Temp {
  
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("hi", 1);
		HashMap<String,Integer> hm1 = new HashMap<String,Integer>(hm);
		System.out.println(hm1);
	}

}
