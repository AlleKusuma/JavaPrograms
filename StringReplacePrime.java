package arrays;

public class StringReplacePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[]=new int[args.length];
		for(int x=0;x<args.length;x++)
		{
			temp[x]=Integer.parseInt(args[x]);
		}
		for(int x=0;x<temp.length;x++)
		{
			int count=0;
			// temp=Integer.parseInt(args[x]);
			for(int y=1;y<=temp[x];y++)
			{
				if(temp[x]%y==0)
				{
					count++;
					//break;
				}
			}
			if(count==2)
			{
				args[x]="prime";
			}
		}
		for(int x=0;x<args.length;x++)
		{
			System.out.println(args[x]);
		}
	}

}
