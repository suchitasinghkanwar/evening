import java.util.Scanner;
import java.util.*;
class node
{
	int data;
	node head=null;
	node prev;
	node next;

	public node()
	{
		this.data=0;
		this.next=null;
		this.prev=null;
	}
	public node(int data1)
	{
		this.data=data1;
		this.next=null;
		this.prev=null;
	}
	public node add(int data)
	{
		node l= new node(data);
		if(head==null)
		{
			head=l;

		} 
		else
		{
			node temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=l;
			l.prev=temp;
			
		}
		return head;
	}
	public void print(node head)
	{
		node last=null;
		node temp=head;
		System.out.println("traversing in forward direction");
		while(temp!=null)
		{
			System.out.println(temp.data);
			
			last=temp;
			temp=temp.next;
		}
        System.out.println("traversing in backward direction");
        while(last!=null)
        {
        	System.out.println(last.data);
        	last=last.prev;
        }
    }
			
}
	
class doublyll
{
	public static void main(String args[])
	{
		node b=new node();
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int n=s.nextInt();
		node a=null;
		int data;
		for(int i=0;i<n;i++)
		{
			data=s.nextInt();
			a=b.add(data);

		}



		
		 b.print(a);
				
	}
}