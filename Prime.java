import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		if(n == 0 || n == 1)
		{
			System.out.println("Please enter valid number");
		}
		for(int i = 2; i < n; i++){
			if(n%i==0){
				System.out.println(n+" is not prime no");
				count = 1;
				break;
			}			
		}
		if(count == 0){
			System.out.println(n+" is prime no");
		}		
	}
}
