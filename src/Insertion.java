package learn;

import java.util.Scanner;

public class Insertion implements Comparable{
	public static void sort(Comparable[] a)
	{
		int N=a.length;
		for(int i=1;i<N;i++)
		{
			for(int j=i;j>0&&less(a[j],a[j-1]);j--)
			{
				exch(a,j,j-1);
			}
		}
	}
	private static boolean less(Comparable v,Comparable w)
	{
		
		return v.compareTo(w)<0;
	}
	private static void exch(Comparable[] a,int i,int j)
	{
		Comparable temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void show(Comparable[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=in.next();
		}
		sort(s);
		show(s);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
