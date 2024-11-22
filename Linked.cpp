//import java.util.stdlib;
#include<stdio.h>
#include<stdlib.h> 

	struct Node{
		int data;
		struct Node *next;
	};
	void LinkedListTraversal(struct Node *ptr){
		
		while(ptr!=NULL)
		{
			printf("Element %d\n ",ptr->data);
			ptr=ptr->next;
		}
	}
	int main() 
	{

		struct Node *head;
		struct Node *second;
		struct Node *third;
		struct Node *fourth;

		head=(struct Node *)malloc(sizeof(struct Node));
		second=(struct Node *)malloc(sizeof(struct Node));
		third=(struct Node *)malloc(sizeof(struct Node));
		fourth=(struct Node *)malloc(sizeof(struct Node));

		head ->data=12;
		head->next=second;

		second ->data=23;
		second->next=third;

		third ->data=53;
		third->next=fourth;

		fourth ->data=42;
		fourth->next=NULL;

		LinkedListTraversal(head);
		return 0;
	}

