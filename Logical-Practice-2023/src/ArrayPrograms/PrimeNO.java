package ArrayPrograms;

public class PrimeNO {
	
	public static void main(String[] args) {
		
		int n=50;
		
		for(int i=2;i<=50;i++)
		{
			int s=0;
			
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					s=s+1;
					break;
				}
				if(s==0)
				{
					System.out.println(i);
				}
			}
		}
		
		
	}

}
