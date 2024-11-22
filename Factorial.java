//import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		int n = 5;
		//sc.nextInt();
        // Facto(n);
		 /*int result=1;
		 for(int i = n; i>=1; i--){
			result = result*i;	
			//System.out.println(result);
		}
		System.out.println(result);
		*/

	/*}
	static void Facto(int n)
	{*/
		if(n<0)
		{
			System.out.println("Invalid number ");
			//return;
		}
		int result=1;
		 for(int i = n; i>=1; i--){
			result = result*i;	
			System.out.println(result);
		}
		//System.out.println(result);
	}
}
