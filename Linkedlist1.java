import java.util.Scanner;
import java.util.*;
class node
{
	int data;
	node head=null;
	node next;

	public node()
	{
		this.data=0;
		this.next=null;
	}
	public node(int data1)
	{
		this.data=data1;
		this.next=null;
	}
	
	public node add(int data)
	{
		node l=new node(data);
		if(head==null)
		{
			head=data;
			return;
		}
		node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=l;
		return;
	}
	public void print(node head)
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
	}

	public int length()
	{
		node temp=head;
		int count=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		return count;
	}
	public node mid(node head,int l)
	{
		int count=0;
		node temp=head;
		while(count!=(l/2))
		{
			temp=temp.next;
			count++;
			
		}
		node middle=temp.next;
		temp.next=null;
		return middle;
		//System.out.println(middle.data);
		
	}
	
	
    public node addend(int data,node head)
	{
		node f=new node(data);
		if(head==null)
		{
			head=f;
			head.next=head;
		}
		else
		{
			node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=f;
			f.next=head;
		}
		return head;
	}

	
	
	public node reverse(node head)
	{
		node next=null;
		node prev=null;
		node temp=head;
		while(temp!=null)
		{
			next=temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
			head=prev;
		}
		return head;
	}
	
	
}

	

class Linkedlist1
{
	public static void main(String args[])
	{
		node b=new node();
		node head=b.add(11);
		 head=b.add(28);
		 head=b.add(38);
		 head=b.add(33);
		// int l=b.length();
		// head=b.addend(2,head);
		// head=b.reverse(head);
		b.print(head);
				
	}
}