package Linked;

public class LinkedList
{
private class Node
{
	int data;//data in linked List
	Node next;//next jahan address rahega
}
private Node head;//node k ander head h address save hua h 
private Node tail;//node k ander tail h end ka address save hua h
private int size;//total size

public void display()
{
	System.out.println("..................");
	Node temp=this.head;
	
	while(temp!=null)
	{
		System.out.print(temp.data+", ");
		temp = temp.next;
	}
	System.out.println(".");
	System.out.println("...................");
}

public void addLast(int item)
{
	//create a new node
	Node nn = new Node();
	nn.data=item;
	nn.next=null;
	
	//attach
	if(this.size>=1)
	{
		this.tail.next=nn;//purani waali tail mein new reference daal rhe h matlb wo tail nhi rahi
	}
	
	if(this.size==0)
	{
		this.head=nn;
		this.tail=nn;
		this.size++;
	}
	else
	{
		this.tail=nn;//nayi tail ban gyi
		this.size++;
	}


}

public void addFirst(int item)
{
	Node nn = new Node();
	nn.data=item;
	nn.next=null;
	
	if(this.size>=1)
	{
		nn.next=head;
	}
	if(this.size==0)
	{
		this.head = nn;
		this.tail = nn;
		this.size++;
	}
	else
	{
		this.head=nn;
		this.size++;
	}
}

public int getFirst() throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LL is Empty");
	}
	return this.head.data;
}

public int getLast() throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LL is Empty");
	}
	return this.tail.data;
}

public int getAt(int index) throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LinkedList is Empty");
	}
	if(index<0||index>=this.size)
	{
	throw new Exception("Invalid Index");	
	}
	Node temp = this.head;
	for(int i=0;i<=index;i++)
	{
		temp=temp.next;
	}
	return temp.data;
}

private Node getNodeAt(int index) throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LinkedList is Empty");
	}
	if(index<0||index>=this.size)
	{
	throw new Exception("Invalid Index");	
	}
	Node temp = this.head;
	for(int i=0;i<=index;i++)
	{
		temp=temp.next;
	}
	return temp;
}
  
public void addAt(int item, int index) throws Exception
{
	if(index<0||index>this.size)
	{
		throw new Exception("Inavalid Size");
	}
	if(index==0)
	{
		addFirst(item);
	}
	else if(index==this.size)
	{
		addLast(item);
	}
	else
	{
		Node nn  = new Node();
		nn.data = item;
		nn.next=null;
		
		Node nm1 = getNodeAt(index-1);
		Node np1 = nm1.next;
		
		nm1.next = nn;
		nn.next=np1;
		
		this.size++;
	}
}

public int removefirst() throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LL is Empty");
	}
	
	int rv = this.head.data;
	
	if(this.size==1)
	{
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	else
	{
		this.head = this.head.next;
		this.size++;
	}
	return rv;
	
}

public int removeLast() throws Exception
{
	if(this.size==0)
	{
		throw new Exception("LL is Empty");
	}
	int rv = this.tail.data;
	
	if(this.size==1)
	{
		this.head=null;
		this.tail=null;
		
		this.size=0;
	}
	else
	{
		Node Sizem2 = getNodeAt(this.size-2);
		this.tail = Sizem2;
		this.tail.next = null;
		this.size--;
	}
	return rv;
}

}

