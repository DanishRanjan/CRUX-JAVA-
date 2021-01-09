package Linked;

public class client {
public static void main(String args[]) throws Exception
{
	LinkedList list = new LinkedList();
	list.addFirst(10);
	list.addLast(20);
	list.addFirst(30);
	list.addLast(40);
	list.addLast(50);
	list.addAt(100,1);
	//list.display();
	//System.out.println(list.getFirst()+" "+list.getLast());
	System.out.println(list.removeLast());
	list.display();
	//list.display();
}
}
