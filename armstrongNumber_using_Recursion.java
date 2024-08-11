package methodPrograms;

public class armstrongNumber_using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arm_strong a=new arm_strong();
		int b=a.count1(a.num,0);
		System.out.println(b);
		int res=a.sum(a.num,0,b);
		System.out.println(res);
		if(res==a.num)
			System.out.println(a.num+" armstrong");
		else
			System.out.println(a.num+" not armstrong");
	}

}
class arm_strong
{
	int num=153;
	int count1(int num,int count)
	{
		if(num==0)
		{
			return count;
		}
		else
		{
			//count++;
			return count1(num/10,++count);
		}
	}
	int sum(int num,int sum,int count)
	{
		if(num==0)
		{
			return sum;
		}
		else
		{
			int rem=num%10;
			sum=sum+(int)Math.pow(rem, count);
			//System.out.println(sum);
			return sum(num/10,sum,count);
		}
	}
}