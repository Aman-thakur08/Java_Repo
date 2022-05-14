package Unit_01;
/*
 * Normally, an array is a collection of similar types of elements stored at contiguous memory location
 * Java array is an object which contains  elements of similar data type 
 * We can store only a fixed set of elements in a Java array
 * Size Limit issue:
 * 		-We can store only fixed number of elements
 * 		-It does not grow its size at runtime
 * 		- To solve this problem,collection framework is used in Java which grows automatically
 * 
 * There are two types of array
 * 		-Single Dimensional Array
 * 		-Multidimensional Array
 * 
 * Declare an array in Java
 * 	- DataType arrayRefVar[];
 * Or
 * 	- DataType[] arrayRefVar;	
 * Or	
 * - DataType []arrayRefVar;
 * 
 * Initiation of an array in Java
 * arrayRefVar =new DataType[size];
 */

public class P6_Task01_ArraysInJava {

	public static void main(String[] args) {
		//Declaration
		int array1[];
		int[] array2;
		int []array3;
		
		//Cannot do it as we have not provided it any memory/space yet
		//array1[0] =1;
		
		//Initialization, during this we have to provide size to the array
		array1=new int[6];
		
		//Assigning values to array
		for(int i=0;i<array1.length;i++)//length property of array
			array1[i]=i;
		int array4[]= {33,3,4,5};//declaration,initiation and initialization
		
		//passing array to method
		arrayAsParameter(array4);
		//Passing anonymous array in parameters
		arrayAsParameter(new int[] {33,3,4,5});
		//Returning the value of array from method
		int[] array5=arrayAsReturnType();
		System.out.println(array5.toString());
		
		//ArrayIndexOutofBoundException
		int[] arr= {50,60,70,80};
//		for(int i=0;i<=arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		//Multidimensional Array
		int[][] arr6=new int[3][3];
		for(int i=0,j=0;i<3&&j<3;i++,j++)
		{
			System.out.println(arr6[i][j]);
		}
		int counter =0;
		for(int i=0,j=0;i<3&&j<3;i++,j++)
		{
			counter++;
			arr6[i][j]=counter;
		}
		for(int i=0,j=0;i<3&&j<3;i++,j++)
		{
			System.out.println(arr6[i][j]);
		}
	}
	static void arrayAsParameter(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	static int[] arrayAsReturnType() 
	{
		int array4[]= {33,3,4,5};
		return array4;
	}

}









