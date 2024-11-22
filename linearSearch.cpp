#include<stdio.h>

int linearSearch(int arr[], int size, int element)
{
  for(int i = 0; i < size; i++)
	{
		if(arr[i] == element)
		{
			return 1;
		}
	}
	return -1;
}
    int main()
{
	int arr[50] = {12,54,86,37,52,66};
	int size = sizeof(arr)/sizeof(int)+2;
	int element = 86;
	int searchIndex = linearSearch(arr, size, element);
	printf("This element %d was found %d\n",element, searchIndex);
	return 0;
}
