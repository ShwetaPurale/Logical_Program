class Sample3
{
	public static void main(String[]args)
	{
		int age=17;
		char gender='f';
		if((gender=='m' && age>=21)||(gender=='f' && age>=18))
		{
			System.out.println("you are eligible");
		}
		else
		{
			System.out.println("you are not eligible");
		}
		//System.out.println("Control!.....");
	}	
}