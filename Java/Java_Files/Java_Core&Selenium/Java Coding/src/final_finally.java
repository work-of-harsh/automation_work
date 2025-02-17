
public class final_finally {

	public static void main(String[] args) {
		int a = 1;
		final int b = 0;         //The final keyword in Java is used with variables, methods, and also with classes to restrict modification.
		a++;                    //Final methods can be overriden.
		// b++;  will throw error as b is final variable.
		System.out.println(a);
		Integer[] a2 = {};
		Integer[] a3 = {1,2};
		try 
		{ System.out.println("Inside try block");
		int a1 = 1/0;
		}
		
		catch(Exception e)
		{
			System.out.println("Exception caught: "
                    + e.getMessage());}
		
		finally                                         //always runs
		{ System.out.println(
                "finally block always execute");}
		
		//exception handling by defining exception.
       // example of an handled exception.
		try {  thr.fun();
		    }
		catch(Exception e )
		{     System.out.println("Caught inside main block: " + e.getMessage());    
		      
		}

	}

}


class thr
{  
	static void fun() throws Exception             //throws is a keyword in Java that is used in the signature of a method to indicate that this method might throw one of the listed type exceptions. 
	                                               //The caller to these methods has to handle the exception using a try-catch block. 
	{
	try {  System.out.println("Inside thr try block"); 
          throw new Exception("test");
        }
	catch(Exception e )
	{     System.out.println("Caught inside fun() method: " + e.getMessage());    
	      throw e;
	}


}}