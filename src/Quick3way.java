package learn;

import java.util.Scanner;

public class Quick3way implements Comparable{
	
		private static void exch(Comparable[] a,int i,int j)
		{
			Comparable t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	
	public static void sort(Comparable[] a)
	{
		sort(a,0,a.length-1);
		
	}
	private static void sort(Comparable[] a,int lo,int hi)
	{
		if(hi<=lo)return;
		int lt=lo,i=lo+1,gt=hi;
		Comparable v=a[lo];
		while(i<=gt)
		{
			int cmp=a[i].compareTo(v);
			if(cmp<0)exch(a,lt++,i++);
			else if(cmp>0)exch(a,i,gt--);
			else i++;
		}
		sort(a,lo,lt-1);
		sort(a,gt+1,hi);
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
