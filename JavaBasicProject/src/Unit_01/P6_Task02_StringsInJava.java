package Unit_01;

public class P6_Task02_StringsInJava {

	public static void main(String[] args) {
		StringInJava obj=new StringInJava();
		obj.StringDefinition();
		obj.charAndString();

	}

}
class StringInJava
{
	void StringDefinition()
	{
		String s="Hello There!";
		String s1=new String("sdcsdcs");
		System.out.println(s);
		//get length of string
		System.out.println(s.length());
		//loop through string
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		String first="Aman";
		String second="Thakur";
		
		//Add two Strings
		String third=first+second;
		System.out.println(third);
		//Compare two strings
		boolean result=first.equals(second);
		System.out.println(result);
		
		/*
		 * Java Strings are Immutable
		 * In Java,the JVM maintains a string pool to store all of its strings inside the memory.
		 * The string pool helps in reusing the strings
		 * 		- If the string already exists,the new string is not created
		 * 		  Instead, the new reference,example points to the already existed string (Java).
		 * 		- If the string does not exist ,the new string is created.
		 */
		String fourth="Aman";
		//System.out.println(fourth.);
		String fifth =new String ("Thakur");
	}
	/*
	 * Character Arrays are mutable but Strings are not
	 */
	void charAndString()
	{
		char[] ch= { 'H','e','l','l','o','T','h','e','r','e','!'};
		char[] ch2= {'!','!'};
		System.out.println(ch);
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		String s1=new String(ch);
		System.out.println(s1);
		ch[0]='h';
		//s1.charAt(0)='h';
		/*
		 * Join two Java Strings- '+' can be used to append two strings to form a third string
		 * which is not possible in char array
		 */
		s1=s1+'a';//s1 is new object in new memory
		//ch=ch+ch2;
		//String to char array
		String s2="GEEKS";
		char[] ch4=s2.toCharArray();
		//char array to string
		char []a2= {'A','M','A','N'};
		String s3=new String(s2);
	}
}





