import java.util.*;

class SearchNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int c = 0;
		int rem;

		System.out.print("\n\t\t\tEnter number : ");
			int n = sc.nextInt();

		System.out.println("\n\t\t\t=============================");

		System.out.print("\n\t\t\tEnter number which you have to find : ");
			int s = sc.nextInt();

		System.out.println("\n\t\t\t======================================");

		while(n!=0)
		{
			rem = n%10;

			if(rem==s)
			{
				c = 1;
				break;
			}
			
			n=n/10;
		}
		
			if(c==1)
				System.out.println("\n\t\t\tNumber Found");
			else
				System.out.println("\n\t\t\tNumber not found.");
	}
}