package methodPrograms;

public class SecondSmallestNumber_using_methods {

	public static void main(String[] args) {
		SecondSmallestNumber_using_methods s=new SecondSmallestNumber_using_methods();
		// TODO Auto-generated method stub
//		int res=sec_smallest_Number(10,20,30,9,0);
//		System.err.println(res);
		s.sec_smallest_Number(50,20,30,9,0);
	}
	void sec_smallest_Number(int x,int y,int z,int min,int sec_min)
	{
	
		if((x>y && x<z)||(x<y && x>z))
		{
			System.out.println(x);
		}
		else if((y>x && y<z)||(y<x && y>z))
		{
			System.out.println(y);
		}
		else
			System.out.println(z);
		//System.out.println(sec_min);
	}
}
