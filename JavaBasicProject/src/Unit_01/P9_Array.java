package Unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3};

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	
	void sortAnArray(int[] arr) {
		// write code here!
		int n=arr.length;
		//System.out.println(n);
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		int n=arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.print(arr[i]+" ");
				i++;
			}
		}
		System.out.println();
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		int n=arr.length;
		System.out.print(arr[1]);
		System.out.print(" ");
		System.out.print(arr[n-2]);
		System.out.println();
	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		int n=arr.length;
		int temp=arr[0];
		for(int i=0;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
		

	void removeElementInArray(int[] arr) {
		// write code here!
		int key =5;
		int j=0,n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				j=i;
			}
		}
		for(int i=j;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
