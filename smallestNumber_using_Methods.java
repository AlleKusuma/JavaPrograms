package methodPrograms;

public class smallestNumber_using_Methods {

	public static void main(String[] args) {
		smallestNumber_using_Methods s=new smallestNumber_using_Methods();
		// TODO Auto-generated method stub
		int res=s.smallest_number(10,20,30);
		System.out.println(res);
	}
	int smallest_number(int x,int y,int z)
	{
		if(x<y && x<z)
		{
			return x;
		}
		else if(y<z)
		{
			return y;
		}
		else
			return z;
	}

}
