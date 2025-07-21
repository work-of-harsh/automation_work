
public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] a = {{1,2,4},{11,-5,-3},{1,20,7},{1,2,4}};
       //find the minimum value in multi-array and find the maximum value in that column.
      int row_length = a.length;
      int column_length = a[0].length;   //column length can vary as we provide.
      
      int min = a[0][0];
      int col=0;
       for(int i =0; i<a.length;i++)
       {
    	   for(int j =0; j<a[i].length;j++)
    	   {
    		   if(a[i][j]<min)
    		   {
    			   min = a[i][j];
    			   col = j;
    		   }
    	   }
       }
       System.out.println("Minimum value is: "+min);
       int max= a[0][col];
       for(int i =0; i<a.length;i++)
       {
    	   if(a[i][col]>max)
    	   {
    		   max = a[i][col];
    	   }
       }
       System.out.println("Maximum value is: "+max);
	}

}
