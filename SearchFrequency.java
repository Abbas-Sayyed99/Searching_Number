import java.util.*;

class SearchFrequency
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
				c++;

			n=n/10;
		}
		
			if(c>0)
				System.out.println("\n\t\t\tNumber Found "+c+" times.");
			else
				System.out.println("\n\t\t\tNumber not found.");
	}

}