
public class ved {

	public static void main(String[] args)  {
		calculator1 obj = new calculator1(2,3);
		System.out.println(obj.sum());
		System.out.println(obj.mul());
	}

	
	
}
class calculator1  extends calculator2  {
    int a1;
    int b1;
	
	public calculator1(int a, int b)
	{ 
		super(a, b);       //sending argument via super
		this.a1 = a;
		this.b1 = b;
		
	}
	
	public Integer sum() {
		//System.out.println("prt1");
		Integer s = a1+b1;
		return s;}
}
	
	class calculator2  {
	    int a2;
	    int b2;
		
		public calculator2(int a, int b)
		{ this.a2 = a;
		this.b2 = b;
			
		}
		
		public Integer mul() {
			//System.out.println("prt1");
			Integer s1 = a2*b2;
			return s1;}
		


	
	}


