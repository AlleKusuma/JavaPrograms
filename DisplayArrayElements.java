package arrays;
import java.util.Scanner;
public class DisplayArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[5];
		String s[]=new String[3];
		boolean b[]=new boolean[3];
//		for(int x=0;x<ch.length;x++)
//		{
//			ch[x]=sc.next().charAt(0);
//		}
		for(int x=0;x<s.length;x++)
		{
			s[x]=sc.next();
		}
//		for(int x=0;x<b.length;x++)
//		{
//			b[x]=sc.nextBoolean();
//		}
//		char ch[]=new char[] {'c','3','(','?'};
		for(int x=0;x<s.length;x++)
		{
			System.out.println(s[x]);
		}
		for(String temp:s)
		{
			System.out.println(temp);
		}
//		String s[]=new String[] {"hello","all","good","Morning","453","?<>|+_"};
//		for(int x=0;x<s.length;x++)
//		{
//			System.out.println(s[x]);
//		}
//		boolean b[]=new boolean[] {true,false,true,false,true,true};
//		for(int x=0;x<b.length;x++)
//		{
//			System.out.println(b[x]);
//		}
//		String c[]=new String[] {"true","false"};
//		for(int x=0;x<c.length;x++)
//		{
//			System.out.println(c[x]);
//		}
	}

}
