package ArrayPrograms;

public class MaxNumber {
	
	public static void main(String[] args) {
		
	
	int arr[]= {10,2,3,30,5,6,7,8,9};
	
	int max = arr[0],size = 0 ;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		
	}
	System.out.println(max);
	
		
	}	

}
