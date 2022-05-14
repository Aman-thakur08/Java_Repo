package Unit_01;
/*
 - Variables inJava is a data container that saves the data values during Java program execution.
 
 Types of variables:
 - In Java,there are three types of variables:
 		
 		*Local Variables-declared inside the body of a method.
 		
 		*Instance Variables- These are defined without a "Static" keyword.
 			-they are defined outside a method declaration.
 			-they are object specific and are known as instance variable.
 			
 		*Static variable
 			-they are defined using a static keyword
 			-they are initialized only once at the time of program execution.
 			-these static variables should be initialized first,before the initialization of any object.
 			
 */
public class P3_Task01_VariablesAndDataTypesinJava {
	static int q=11;
	int p=10;
	public static void x()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		//Variable declaration
		int a,b,c;
		float pi;
		double d;
		char e;
		
		//Valid Initializations
		pi=3.14f;
		d=20.22d;
		e='v';
		
		a=10;
		b=10;
		c=10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum=5; //Integer declaration(whole number)
		float myFloatNum=5.99f;//Floating point no.
		char myLetter='p';//Character
		boolean myBool=true;//Boolean
		String myText="Hello";//String
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		/*
		 * Java Variable Type Conversion & Type Casting:
		 */
		
		double f;
		int i=10;
		f=i; //Type Conversion
		
		double g=10;
		int j;
		j=(int)g; //Type Casting
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		byte k=10;// 1 byte
		boolean l=true; //1 bit =true or false only
		long m=10L;
		float n=1.2f;
		double o=1.2d;
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println(ABC.j);// data + function/method
		//ABC.display();
		
		ABC obj1=new ABC();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ABC obj2=new ABC();
		System.out.println(obj2.i++);
		System.out.println(obj2.i);
		
		// System.out.println(obj1.i++);
		//System.out.println(obj1.j);
		//System.out.println(obj2.j);
		
		System.out.println(ABC.j++);
		System.out.println(ABC.j);
		
		ABC.typeConversionAndtypeCasting();
		
	}
	
	int r=10;
	void display() {
		int a=5;
		System.out.println("This is a display method");
		System.out.println(a);
	}
}

class ABC{
	static int j=10;//class variable/static variable
	int i=10;//Instance variable
	
	static void dispaly()
	{
		int a=5;
		System.out.println("This is a display method");
		System.out.println(a);
	}
	static void typeConversionAndtypeCasting()
	{
		/*
		  double f;//8 bytes =64 bits/slots
		int i=10;4 bytes =32 bits/slots
		f=i; //Type Conversion
		double g=10;
		int j;
		j=(int)g; //Type Casting
		 */
		double f;//64 slots
		int i=10;
		f=i; //Type Conversion
		System.out.println(f);
		double g=10;//32 slots
		int j;
		j=(int)g; //Type Casting
		System.out.println(i);
		System.out.println(j);
		
		

	}
}
