
public class temp extends a {
   int var =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      temp o = new temp();
      o.met1();
      
	}
  public void met1()
  {    
	  System.out.println(var);  
  }
}


class a  extends b
{ int var = 5;
public a()
{   
	System.out.println("constructor a");
}
	public void met()
	{   
		System.out.println("hi");
	}
}


class b
{    int var =6;
public b()
{
	System.out.println("constructor b");
}
	public void met()
	{
		System.out.println("hi");
	}
}