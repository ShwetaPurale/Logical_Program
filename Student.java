import java.util.Scanner;
class Student 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first subject marks ");
		float s1=sc.nextFloat();
		System.out.println("Enter Second subject marks ");
		float s2=sc.nextFloat();
		System.out.println("Enter third subject marks ");
		float s3=sc.nextFloat();
		float total = s1+s2+s3;
		System.out.println("Total mark is "+total);
		float per =(total/300)*100;
	    System.out.println("Total percentage is "+per);

		if(per>=40){
			System.out.println("Student is pass with "+per );
		}else if(per<=30){
			System.out.println("Student is fail with "+per );
		}else{
			System.out.println("please enter valid value");
		}
	}
}
