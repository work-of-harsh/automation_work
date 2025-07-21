
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7};
		//int[] a= {1,2};
		for(int i =0; i<=a.length;i++)   //O(logn)
		{binary_search(a,i+1);}
		//for(int i =0; i<=a.length;i++)
		//{binary_search_recursion(a,i+1,0, a.length-1);}
		for(int i =0; i<=a.length;i++)   //O(sqrt(n))
		{jump_search(a,i+1);}
		for(int i =0; i<=a.length;i++) 
		{jump_search_method2(a,i+1);}
		
		

	}
   public static int binary_search(int[] a,int val)  //this function works for only sorted array.
   {  int right = a.length-1;
      int left=0;
      int index = (left+right)/2;
   while(index>=0 && index <= a.length-1)
   {   
	   if(a[index]==val)
	   {   System.out.println("Index of "+ val +":"+ index);
		   return index;
	   }

	   else if(a[index]<val)   
	   {
		   left=left+1;   //changing left and right makes sure program is not stuck is while loop.
	   }
		   
	   else if(a[index]>val)
	   {
		   right=right-1;   //changing left and right makes sure program is not stuck is while loop.
	   }
	   index = (left+right)/2;
   }  
     
   System.out.println("Element not in array");
   return -1;
   }
   public static int binary_search_recursion(int[] a,int val,int left, int right)  //this function is incomplete.
   { 
      int index = (left+right)/2;
      if(index==0|| index ==a.length-1)
      {    System.out.println("Element not in array");
    	  return -1;
      }
   {   
	   if(a[index]==val)
	   {   System.out.println("Index of "+ val +":"+ index);
		   return index;
	   }

	   else if(a[index]<val)   
	   {
		   left=left+1;  
		   binary_search_recursion(a,val,left, right);
	   }
		   
	   else if(a[index]>val)
	   {
		   right=right-1;
		   binary_search_recursion(a,val,left, right);
	   }
	   
   }  
     return-1;
 }
   public static int jump_search(int[] a,int val)  //this function works for only sorted array.
   {  int n = (int) Math.sqrt(a.length);
      int k= n-1;
      while(k>=0 && k<a.length)
      { if(a[k]==val)
      {   System.out.println("Index of "+ val +" through jump search: "+ k);
    	  return k;
      }
      else if(a[k]>val)
      {
    	  for(int i = k-n+1;i<=k;i++)
    	  {
    		  if(a[i] == val)
    		  {   System.out.println("Index of "+ val +" through jump search: "+ i);
    			  return i;
    		  }
    	  }
      }k=k+n;
      }
      k=k-n;
      for(int i = k+1;i<a.length;i++)
	  {
		  if(a[i] == val)
		  {   System.out.println("Index of "+ val +" through jump search: "+ i);
			  return i;
		  }
	  }
      System.out.println("Element not in array");
      return-1;
   }
   public static int jump_search_method2(int[] a,int val)  //this function works for only sorted array.
   {  int n = (int) Math.sqrt(a.length);
      int last= n-1;
      int start=0;
      while(a[last]<val && start<a.length)
      {  
    	  start = last +1;
    	  last = last +n;
    	  if(last>=a.length)
    	  {
    		  last=a.length-1;
    	  }
        
      }
      
      for(int i = start;i<=last;i++)
	  {
		  if(a[i] == val)
		  {   System.out.println("Index of "+ val +" through jump search method 2: "+ i);
			  return i;
		  }
	  }
      System.out.println("Element not in array");
      return-1;
   }
}
