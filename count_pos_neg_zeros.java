import java.util.Scanner;
class count_pos_neg_zeros
{
	public static void main(String args[])
	{
		int i=1,n=10,pos=0,neg=0,zero=0;
		Scanner sc=new Scanner(System.in);
		while(i<=n)
		{
			int s=sc.nextInt();
			if(s==0)
			{
				zero++;
			}
			else if(s>0)
			{
				pos++;
			}
			else
			{
				neg++;
			}
			i++;
		}
		System.out.println("pos count "+pos);
		System.out.println("neg count "+neg);
		System.out.println("zero count "+zero);
	}
}