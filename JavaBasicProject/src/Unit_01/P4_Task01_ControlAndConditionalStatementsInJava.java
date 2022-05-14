package Unit_01;
/*
  #Control Statements and Conditional Statements:
  -Java provides three types of control flow statements.
  	-Decision Making Statements
  			*if-else statements
  			*switch statement
  	-Loop Statements
  			-do while 
  			-while 
  			-for
  			-for each
  	-Jump Statements
  		-break;
  		-continue;
 */
public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		Statements obj=new Statements();
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
	}
}

class Statements
{
	void DecisionMakingStatements()
	{
		int x=10;
		int y=12;
		if(x+y<10)
		{
			System.out.println("x+y is less than 10");
		}
		else 
		{
			System.out.println("x+y is greater than 10");
		}
		int num=2;
		switch(num)
		{
		case 0:
			System.out.println("number is 0");
		case 1:
			System.out.println("number is 2");
		default:
			System.out.println(num);
		}
	}
	void LoopStatements()
	{
		/*
		 * for(initialization;condition;increment/decrement)[**block of statements]
		 * for(data_type : array_name/collection_name){//statements}
		 */
		//For Loop
		int sum=0;
		for(int j=1;j<=10;j++)
		{
			sum=sum+j;
		}
		System.out.println("the sum of first 10 natural no.s is:"+sum);
		//For each
		String[] names= {"Java","C","C++","Python","JavaScript"};
		System.out.println("Printing the content of the array");
		for(String name:names)
			System.out.println(name);
		/*
		 * while(conditional){//Looping Statement}
		 */
		int i=0;
		System.out.println("Printing the List of  even no.s upto 10\n");
		while(i<=10)
		{
			System.out.print(i);
			System.out.print(" ");
			i=i+2;
		}
		System.out.println("\n");
		/*
		 * do-while{ //statements}while(condition)
		 */
		i=1;
		System.out.println("Printing the  list of odd no.s upto 10");
		do {
			System.out.print(i);
			System.out.print(" ");
			i=i+2;
		}while(i<=10);
	}
	void JumpStatements()
	{
		//Break
		for(int i=0;i<=10;i++)  // [0,1,2,3,4,5]
		{
			System.out.println(i);
			if(i==6)
				break;
			System.out.println(i);
		}
		//Continue
		for(int i=0;i<=10;i++)   //[0,1,2,3,4,5,7,8,9,10]
		{
			System.out.print(i);
			if(i==6)
				continue;
			System.out.print(i);
		}
	}
}