
public class Static_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj = new class1("Harsh","Vastral");
		obj.getDetail();
		class1 obj2 = new class1("Thug","Bapunagar");
		obj2.getDetail();
		obj2.getcity();
		class1.getcity();  ////static methods can be accessed without created object.
		
	}

}


class class1{
	String name;   //instance variable as it is updated every time we create object for class.
	String address;
	static String city = "Ahmedabad";  //class variable, fixed and accessible to all the objects when created,saves memory.
	static int i =0;
	int m =0;
	public class1(String name, String address){  //constructor gets local variable.
		this.name = name;
		this.address = address;
		i++;    //i will increment every time as i is shared with every object that is created. 
		m++;   //m will start from  0 every time as m is not static, exclusive for every object. 
		System.out.println("i:  "+ i + " , m: "+ m);
	}
	
	public void getDetail() {
		System.out.println(name +" "+ address + " "+ city);
		}
	
	public static void getcity() {   //static methods can be accessed without creating object.
		System.out.println( city);   //static method can only accept static variables.
		}
}