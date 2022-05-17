package Unit_03;

//Throw keyword is used when you want to create your own exception
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exceptions can be handled while errors can't be handled
 * the code which can generate exception is put into try block which is then catch after
 * we can use numerous catch block but the exception can be caught only by correct catch block
 */
public class P14_ErrorAndExceptionsInJava {

	public static void main(String[] args) {
		ABC obj=new ABC();
		//obj.arithmeticException();
		//obj.inputMismatchException();
		//obj.stackoverflowException();
		//obj.IndexOutofBound();
		obj.IndexOutofBound();
//		obj.checkedAndUncheckedException();
		obj.manualExceptionThrow();
//		obj.nullPointerException();
//		obj.useofThrows_and_finally();
	}

//the finally keyword lets you execute code,after try.....catch regardless of the results
}
class ABC{
	void arithmeticException()
	{
		try {
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
		System.out.println("done");
		
	}
	void MultipleException()
	{
		try {
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{ //SUPER CLASS should always be after child class
			System.out.println(e.getMessage());
		}
			
		System.out.println("done");

	}
	
	void inputMismatchException()
	{
		Scanner s=new Scanner(System.in);
		try {
			int a=s.nextInt();
			System.out.println(a);
			s.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("done");
	}
	int a=10;
	//error
	void stackoverflowException()
	{
		try {
			if(a>0) {
				a++;
				stackoverflowException();
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("done");
	}
	void IndexOutofBound()
	{
		try {
			int a[]= {1,2,3};
			System.out.println(a[4]);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	void nullPointerException()
	{
		try {
			String s=new String();
			s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	void useofThrow(int age)throws Exception//LAzy Exception does not want to use its own try /catch
	{
		if(age<18)
			throw new Exception();
		else
			System.out.println("You are allowed to Vote");
	}
	void useofThrows_and_finally() {
		try {
			useofThrow(17);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("The try block is finished");
		}
	}
	void voting(int age) throws ManualException {

		if (age < 17) {
			throw new ManualException();
		}

		
		System.out.println("you can vote");

	}
	void checkedAndUncheckedException() {
		/*
		 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		 * will not be caught at compile time - as there is no mistake but caught at
		 * runtime - because it is mathematically incorrect
		 */
		
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);
		// Checked Exception [Run this code over terminal and check compiler error]
		
		try {
			useofThrow(19);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	void manualExceptionThrow() {

		try {
			voting(16);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}


class ManualException extends Exception {

	@Override
	public String getMessage() {
		String detailMessage = "Exception Occured!";
		return detailMessage;
	}

}