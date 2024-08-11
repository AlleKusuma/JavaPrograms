package basic_programs;
import java.util.Scanner;
public class extract_lastDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
			int rem=num%10;
			System.out.println(rem);
			num/=10;
		}
	}

}
