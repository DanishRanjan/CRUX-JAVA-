package HackerBlocks;

import java.util.*;
public class Help_Ramu {
   public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int T=s.nextInt();
int []rick=new int[1000];
int []cab=new int[1000];
while(T!=0)
{
int c1=s.nextInt();
int c2=s.nextInt();
int c3=s.nextInt();
int c4=s.nextInt();
int n=s.nextInt();
int m=s.nextInt();
for(int i=0;i<n;i++)
{
rick[i]=s.nextInt();
}
for(int i=0;i<m;i++)
{
cab[i]=s.nextInt();
}
int rickcost=0;
int cabcost=0;
for(int i=0;i<n;i++)
{
rickcost=rickcost+Math.min(c1*rick[i],c2);
}
rickcost=Math.min(rickcost, c3);
for(int i=0;i<m;i++)
{
cabcost=cabcost+Math.min(c1*cab[i],c2);
}
cabcost=Math.min(cabcost, c3);
int ans=Math.min(cabcost+rickcost, c4);
System.out.println(ans);
T--;
}	

}

}
