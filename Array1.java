class Array1 
{
	public static void main(String[] args) 
	{
		int [] marks={12,10,20,5,3};
		int sum=0;
		for(int element:marks){
			sum=sum+element;
		}
		System.out.println("The value of sum is "+sum);
	}
}
