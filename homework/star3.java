package homework;
import java.util.*;
public class star3 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
int rows=1;
int nst=1;
//rows
while(rows<=n)
{
	int cst=1;
	//work
	while(cst<=rows)
	{
		if(cst==1||cst==nst)
			System.out.print(rows+"\t");
		else
			System.out.print("0\t");
		cst++;
	}
	//prep
	System.out.println();
	rows++;
	nst++;
        }
	}
}
