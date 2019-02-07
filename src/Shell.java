package learn;

import java.util.Scanner;

public class Shell implements Comparable{
	public static void sort(Comparable[] a)
	{
		int N=a.length;
		int h=1;
		while(h<N/3)h=h*3+1;
		while(h>=1)
		{
			for(int i=h;i<N;i++)
			{
				for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h)
					exch(a,j,j-h);
				
				
			}
			h=h/3;
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
