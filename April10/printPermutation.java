package April10;

public class printPermutation {

	public static void main(String[] args) 
	{		
     printP("abc", "");
	}
	public static void printP(String str, String result)
	{
		if(str.length()==0)
		{
			System.out.println(result);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char cc = str.charAt(i);
			String ros = str.substring(0,i)+str.substring(i+1);
			printP(ros, result+cc);
		}
	}

}
