package April10;

public class PermutationOfCoin {
	static int count=0;
	public static void main(String[] args) {
		
		CoinChange(new int[] {2,3,5,6}, 10, "");
	}
	public static void CoinChange(int[] Denom, int amount, String ans)
	{
		if(amount==0)
		{
			count++;
			System.out.println(count+"."+ans);
			return;
		}
		for(int i = 0;i<Denom.length;i++)
		{
			if(amount>=Denom[i])
			{
				CoinChange(Denom, amount-Denom[i], ans+Denom[i]);
			}
		}
	}

}
