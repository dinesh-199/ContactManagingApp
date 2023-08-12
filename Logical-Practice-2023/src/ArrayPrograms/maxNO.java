package ArrayPrograms;

public class maxNO {
	
	public static void main(String[] args) {
		
		int arr[]= {10,2,3,30,5,6,7,8,9};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
			 max=arr[i]	;
			}
		}
		
		System.out.println(max);
	}

}
