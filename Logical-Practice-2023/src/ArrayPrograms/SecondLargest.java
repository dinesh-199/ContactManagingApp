package ArrayPrograms;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int arr[]= {10,2,3,30,25,6,127,8,9};
		
		int temp ,size;
		size=arr.length;
		
		for(int i=0;i<arr.length;i++)
			
		{
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		System.out.println(arr[size-3]);
	}

}
