package homework;
import java.util.*;
public class LLDemo {
	public static void main(String args[]) throws Exception
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		ll.add(55);
		System.out.println("List: "+ll);
		
		
		
		Scanner sc = new Scanner(System.in);
		int element;
		int position,choice=0;
		
		while(choice<4)
		{
			System.out.println("\nLinkedList Operation ");
			System.out.println("1. Add an element: ");
			System.out.println("2. Remove an element: ");
			System.out.println("3. Chnage an element: ");
			System.out.println("4 Exit");
			
			
			System.out.print("your choice: ");
            choice = sc.nextInt();
            
            
            switch(choice)
            {
            case 1: System.out.print("Enter an elements: ");
            element = sc.nextInt();
            System.out.print("At what position: ");
            position = sc.nextInt();
            ll.add(position-1,element);
            break;
            
            case 2: System.out.print("Enter position: ");
            position = sc.nextInt();
            ll.remove(position-1);
            break;
            
            
            case 3: System.out.print("Enter position: ");
            position = sc.nextInt();
            System.out.print("Enter new element: ");
            element = sc.nextInt();
            ll.set(position-1, element);
            break;
            
            
            default: return;
           
            
            }
            
            
            System.out.print("list: ");
            Iterator it = ll.iterator();
            while(it.hasNext())
            System.out.print(it.next()+" ");
            
		}
	}

}
