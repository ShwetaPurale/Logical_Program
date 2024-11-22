import java.util.Scanner;

class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int number=sc.nextInt();
		int reverse=0;
		while(number!=0){
			int reminder=number%10;
			reverse=(reverse*10+reminder);
			number = number/10;
		}
		System.out.println("The reverse number is "+reverse);
	}
}



