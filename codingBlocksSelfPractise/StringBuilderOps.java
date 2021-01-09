package codingBlocksSelfPractise;

public class StringBuilderOps {
public static void main(String args[])
{
	StringBuilder sb = new StringBuilder("Hello");
	System.out.println(sb);
	System.out.println(sb.length());
	
	//append
	sb.append("abc");
	System.out.println(sb);
	
	//insert
	sb.insert(2, "def");
	System.out.println(sb);
	
	sb.insert(2,"g");
	System.out.println(sb);
	
	sb.insert(sb.length(), "g");
	System.out.println(sb);
	
	//delete
	sb.deleteCharAt(3);
	System.out.println(sb);
	
  	//update
	sb.setCharAt(4,'d');
	System.out.println(sb);
	
	
	String s = sb.toString();//conversion of string builder to string
	System.out.println(s);

}
}
