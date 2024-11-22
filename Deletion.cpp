#include <stdio.h>

void display(int arr[], int n)
{
	for(int i = 0; i < n; i++)
		{
		   printf("%d ",arr[i]);
	    }	
		printf("\n");
}

int indDeletion(int arr[], int size, int index)
{
	/*if(size<index)
	{
		return -1;
	}*/

	for(int i = index; i<size-1;i++)
	{
		arr[i] = arr[i+1];
	}
	return 1;
}

int main()
{
	int arr[20] = {12,45,34,53,61,35,62};
	int size = 7,index = 4;
	display(arr,size);
	indDeletion(arr, size, index);
	size -=1;
	//printf("The number %d was Deleted at index %d\n");
	display(arr,size);
	return 0;
}
