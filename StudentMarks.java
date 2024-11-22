import java.util.Scanner;
class StudentMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int mark = sc.nextInt();
		       do{
					if(mark>=90)
					{
						System.out.println("This is Very Good");
					}
					else if(mark>=60 && mark<=89)
					{
						System.out.println("This is Good");
					}
					else if(mark<=58)
					{
						System.out.println("This is Good as well");
					}else{
						System.out.println("This is fail");
					}
					a++;
				}while(a==1);			
	}
}
