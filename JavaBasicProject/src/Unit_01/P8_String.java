package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		int i=0,flag=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=1;
				break;
			}
			i++;
			j--;
		}
		if (flag==1)
			System.out.println("Not Palindrome");
		else
			System.out.println("Palindrome");

	}

	void reverseOfAString(String s) {
		int l=s.length()-1;
		for(int i=l;i>=0;i--)
			System.out.print(s.charAt(i));
		System.out.println();

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		int n=s1.length()-1;
		int m=s2.length();
		int flag=0;
		if(n!=m)
			System.out.println("Not Equal");
		else
		{
			for(int i=0;i<n;i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Equal");
			else
				System.out.println("Not Equal");
		}
	}
}