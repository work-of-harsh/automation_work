import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Pattern {
  
	public static void main(String[] args) {
		System.out.println("1st Program");
int m=0;
for(int i =0;i <4;i++)
{
	for(int j=4; j>i;j--)
	{   m++;
		System.out.print(m+" ");
	}System.out.println();
}
System.out.println("2nd Program");
m=0;
for(int i =1;i <=4;i++)
{
	for(int j=1; j<=i;j++)
	{   m++;
		System.out.print(m+" ");
	}System.out.println();
}

	}
}