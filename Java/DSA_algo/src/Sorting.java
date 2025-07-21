import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		//selection sort: bringing the smallest element at index arr[i].
	Integer[] arr = {23,-9,0,23,5,81,75,101,-101};
	int temp;
	for(int i = 0; i< arr.length;i++)
	{
		for(int j = i+1;j<arr.length;j++)
		{
			if(arr[i] > arr[j])
			{   //swap
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}
System.out.println(Arrays.toString(arr));  //printing an array.
//bubble sort : mutual swap
Integer[] arr1 = {23,-9,0,23,5,81,75};

for(int i = 0; i< arr1.length;i++)
{
	for(int j = 0;j<arr1.length-i-1;j++)
	{
		if(arr1[j] > arr1[j+1])
		{   //swap
			temp = arr1[j];
			arr1[j] = arr1[j+1];
			arr1[j+1] = temp;
		}
	}
}
System.out.println(Arrays.toString(arr1)); 
	}

}
