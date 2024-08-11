package arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {121,153,12,11,22};
		for(int x=0;x<a.length;x++)
		{
			int temp=a[x],rev=0;
			while(temp>0)
			{
				int rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}
			if(rev==a[x])
			{
				System.out.println(a[x]+" palindrome");
			}
		}
	}

}
