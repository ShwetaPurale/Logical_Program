#include <stdio.h>
#include<stdlib.h>

struct Node
{
	int data;
	struct Node *next;	
};

int linkedListTraversal(struct Node *ptr)
{
	while(ptr!=NULL)
	{
		printf("Element: %d\n",ptr->data);
		ptr=ptr->next;
	}
}

// Insert the node in the linked list in heap memory
//insert node At the first

struct Node *insertAtFirst(struct Node *head, int data)
{
	struct Node *ptr=(struct Node *)malloc(sizeof(struct Node));
	
	ptr->data = data;
	ptr->next = head;

	return ptr;
}

//insert node At the first

struct Node *insertAtIndex(struct Node *head, int data, int index)
{
	struct Node *ptr=(struct Node *)malloc(sizeof(struct Node));
	
	struct Node *p = head;
	int i = 0;
	while(i != NULL)
	{
		p = p->next;
		i++;
	}
	ptr->data = data;
	ptr->next = p->next;
	p->next = ptr;

	return head;
}

//insert node At the End

struct Node *insertAtEnd(struct Node *head, int data)
{
	struct Node *ptr=(struct Node *)malloc(sizeof(struct Node));
	
	ptr->data = data;
	struct Node *p = head;	
	while(p->next != NULL)
	{
		p = p->next;	
	}
	p->next = ptr;
	ptr->next = NULL;
	return head;
}


int main()
{
	struct Node *head;
	struct Node *second;
	struct Node *third;
	struct Node *fourth;
	
	head = (struct Node *)malloc(sizeof(struct Node));
	second = (struct Node *)malloc(sizeof(struct Node));
	third = (struct Node *)malloc(sizeof(struct Node));
	fourth = (struct Node *)malloc(sizeof(struct Node));

	head->data = 12;
	head->next = second;

	second->data = 26;
	second->next = third;

	third->data = 53;
	third->next = fourth;

	fourth->data = 54;
	fourth->next = NULL;
	
	printf("Linked list before insertion\n");
	linkedListTraversal(head);
	//head = insertAtFirst(head, 56);
	//head = insertAtIndex(head, 56, 1);
	head = insertAtEnd(head, 56);
	//head = insertAfterNode(head, third, 56);

	printf("Linked list after the insertion\n");
	linkedListTraversal(head);
	
	return 0;
}
