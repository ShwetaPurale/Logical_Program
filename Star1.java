import java.util.Scanner;

class Star1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row no: ");
		int row=sc.nextInt();
		System.out.println("Enter col no: ");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j]=sc.nextInt();
			}			
		}

		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Enter a element for search");
	int key=sc.nextInt();

		Star1 st1=new Star1();
		boolean status=st1.searchElement(arr,key);
		if(status)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not fount");
		}

		st1.primaryElement(arr);

	}

	
	boolean searchElement(int[][] arr, int key)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i][j]==key)
				{
					return true;
				}
				
			}
		}
		return false;
	}


    void primaryElement(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i==j)
				{
					System.out.print(arr[i][j]+" ");
				}

			}
		}
	}




}