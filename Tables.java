import java.util.Scanner;
class Tables 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= 10; i++)
		{
			int sum = n*i;
			System.out.println("Table is "+sum);
		}
		
	}
}
