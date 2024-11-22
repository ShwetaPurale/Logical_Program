class PyramidNo 
{
	public static void main(String[] args) 
	{
		int n=5;
		int count=1;
		for(int i=1; i<=n; i++){
			int space=n-i;
			for(int j=1; j<=space; j++){
		       System.out.print(" ");
			}

			for(int j=5; j<=n-i;j--)
			{
				//System.out.print("* ");
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}
}
