package Unit_01;

/*
  Operators inJava is a symbol that is used to perform operations.
  sum=a+b;
  
  	For example +,*,-,/,etc ;
  	-> a+=1; //a=a+1
  	
  	Types of Operators in Java 
  		-Unary Operator[prefix and post-fix] [a++,++a,a--,--a,~a,!a]
  		-Arithmetic Operator[+,-,/,*]
  		-Shift Operator[<<,>>]
  		-Relational Operator[<,>,<=,>=,==,!=]
  		-Bitwise Operator [&,^,|]
  		-Logical Operator [&&,||]
  		-Ternary Operator[?:]
  		-Assignment Operator{=,+=,-=,/=,%=,&=,^=,|=,<<=,>>=,>>>=2]
 */
public class P3_Task02_OperatorsinJava {

	public static void main(String[] args) {
		OperatorsInJava obj=new OperatorsInJava();
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperator();
		obj.TernaryOperator();
		obj.AssignmentOperator();

	}
}
class OperatorsInJava {
	void UnaryOperator()
	{
		int a=10;
		boolean b=false;
		System.out.println("Inside UnaryOperator");
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);
		/*
		 *Bitwise Complement(~)
		 -this unary operator return the 1's complement representation of input value with all bits
		  inverted ,which means it makes every 0 to 1,and every 1 to 0; 
		 */
		System.out.println(~a);
		//Not operator(!) is used to reverse the value of an operand
		System.out.println(!b);
		System.out.println("\n");
	}
	void ArithmeticOperator()
	{
		System.out.println("Inside Arithmetic Operator");
		int a=10;
		
		int b=5;
		System.out.println(a+b);//15
		System.out.println(a-b);//5
		System.out.println(a*b);//50
		System.out.println(a/b);//2
		System.out.println(a%b);//0
		//what is the output of the following expression?
		System.out.println(((10*10)/5)+3-((1*4)/2));
		System.out.println("\n");
	}
	void ShiftOperator()
	{
		System.out.println("Inside Shift Operator");
		/*
		  01010101<<1
		  10101010
		  
		  01010101>>1
		  00101010
		  
		  0,0,1,0,0,0(8>>1) >>
		  0,0,0,1,0,0(4>>1)
		  0,0,0,0,1,0(2>>1)
		  0,0,0,0,0,1(1)
		  
		  0,0,1,0,0,0(8<<1)
		  0,1,0,0,0,0(16<<1)
		  1,0,0,0,0,0(32)
		 */
		System.out.println(10<<2);//40
		System.out.println(10<<3);//80
		System.out.println(20<<2);//80
		System.out.println(15<<4);//240
		
		System.out.println(10>>2);//2
		System.out.println(20>>3);//5
		System.out.println(20>>2);//2
		System.out.println("\n");
	}
	void RelationalOperator()
	{
		//Result it true or false
		System.out.println("Inside RelationalOperator");
		int a=10;
		int b=20;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println("\n");
	}
	//Bitwise :Second condition is also checked which is not the case in Logical
	void BitwiseAndLogicalOperator()
	{
		System.out.println("Inside BitwiseOperator");
		int a=10;
		int b=5;
		int c=20;
		//Logical && and Bitwise &
		System.out.println(a<b &&a++<c);// false && true= false
		System.out.println(a);//10 because second condt. is not checked
		System.out.println(a<b & a++<c);//false & true =false 
		System.out.println(a);//11 because second condt. is also checked

		//Logical || and Bitwise |
		System.out.println(a>b||a<c);// true || true= true
		System.out.println(a>b | a<c);//true | true= true 
		System.out.println(a);//11 because second condt. is also checked

		System.out.println(a>b ||a++<c);// true && true= true
		System.out.println(a);//10 because second condt. is not checked
		System.out.println(a>b | a++<c);//true | true= true 
		System.out.println(a);//11 because second condt. is also checked
	
		/*
		 Exclusive and Inclusive OR{! and ^}
		  In case of OR:0|1=1;  1|0=1;  1|1=1;  0|0=0;
		  In case of XOR:0|1=1;  1|0=1;  1|1=0;  0|0=0;
		 */
		System.out.println("Bitwise OR:"+(12|12));//1100|1100=1100
		System.out.println("Bitwise XOR:"+(12^12));//1100^1100=0000
		System.out.println("\n");
	}
	void TernaryOperator()
	{
		System.out.println("Inside TernaryOperator");
		int a=2;
		int b=5;
		int min=(a<b) ? a:b;
		System.out.println(min);
		System.out.println("\n");
	}
	void AssignmentOperator()
	{
		System.out.println("Inside AssignmentOperator");
		int a=10;
		int b=20;
		a+=4;//14
		b-=4;//16
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		//Exercise
		b>>>=2;
		System.out.println(b);
		a=10;
		a+=3;
		System.out.println(a);//13
		a-=4;
		System.out.println(a);//9
		a*=2;
		System.out.println(a);//18
		a/=2;
		System.out.println(a);//9
		System.out.println("\n");
	}
	
}