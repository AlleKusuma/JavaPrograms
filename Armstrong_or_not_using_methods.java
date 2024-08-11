package methodPrograms;

public class Armstrong_or_not_using_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 myclass=new MyClass1();
		for(int i=1;i<=10000;i++)
		{
			int res=myclass.Armstrong(i);
			//System.out.println(res);
			if(i==res)
				System.out.println(i+" armstrong number");
//			else
//				System.out.println("not armstrong number");
		}
		
	}

}
class MyClass1
{
	//int x=153;
	int Armstrong(int num)
	{
		int count=0,temp=num,sum=0;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+(int)Math.pow(rem, count);
			temp/=10;
		}
		return sum;
	}
}
