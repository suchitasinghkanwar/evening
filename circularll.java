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
		node l= new node(data);
		if(head==null)
		{
			head=l;
			head.next=head;
		} 
		else
		{
			node temp = head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=l;
			l.next=head;
		}
		return head;
	}
	
	public int length()
	{
		node temp=head;
		int count=1;
		while(temp.next!=head)
		{
			temp=temp.next;
			count++;
		}
		//temp=temp.next;
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
	
	public node addFront(int data,node head)
	{
		node f=new node(data);
		f.next=head;
		head=f;
	

	return head;
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

	
	public 	void print(node head)
	{
		node temp=head;
		 // System.out.println(head.data);
		while(temp.next!=head)
		{
			System.out.println(temp.data);
			temp=temp.next;
			
		}
		System.out.println(temp.data);
		//System.out.println(temp.next.data);

		
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
	
	public node midreverse(node m)
	{
		node prev=null;
		node next=null;
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
	public void palindrome(node temp1,node temp2)
	{
		if(temp1.data==temp2.data)
		{
			System.out.println("it is palindrome");
			temp1=temp1.next;
			temp2=temp2.next;
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
} 

	

class circularll
{
	public static void main(String args[])
	{
		node b=new node();


		node head=b.add(11);
		 head=b.add(28);
		 head=b.add(38);
		 head=b.add(33);
		 int l=b.length();
		 System.out.println("length of the list is:"+l);
		// head=b.addend(2,head);
		// head=b.addFront(4,head);
		// node kuchb=b.mid(head,l);
		// head=b.reverse(head);
		// node ulta=b.midreverse(kuchb);
		// b.palindrome(head,ulta);
		b.print(head);
				
	}
}