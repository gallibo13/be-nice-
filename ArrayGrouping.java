public class ArrayGrouping
{
	public static void main(String[] args) 
	{
			//int [] arr= {1,2,3,2,1,2,3,4,2,1};
			int arr[] = {1,2,3,1,2,3,4,5,3,4};

			for(int i=1;i< arr.length;i++) 
			{

			if(arr[i] > arr[i-1] )

				{

					arr[i] = arr[i] + arr[i-1];
					arr[i -1 ] = arr[i] -arr[i-1];
					arr[i] = arr[i] - arr[i-1];

					i = 0;

				}
			}

			System.out.println("Array Group:");

			for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i] + " ");


			}
	}
}





	
