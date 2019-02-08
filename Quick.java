package learn;

import java.util.Scanner;

public class Quick implements Comparable{
	public static void sort(Comparable[] a)
	{
		sort(a,0,a.length-1);
	}
	
	private static void sort(Comparable[] a,int lo,int hi)
	{
		if(hi<=lo)return ;
		int j=partition(a,lo,hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	
	}
	private static boolean less(Comparable v,Comparable w)
	{
		
		return v.compareTo(w)<0;
		
	}
	private static int partition(Comparable[] a,int lo,int hi)
	{
		int i=lo,j=hi+1;
		Comparable v=a[lo];
		while(true)
		{
			while(less(a[++i],v))if(i==hi)break;
			while(less(v,a[--j]))if(j==lo)break;
			if(i>=j)
				break;
			exch(a,i,j);
			
		}
		exch(a,lo,j);
		return j;
	}
	private static void exch(Comparable[] a,int i,int j)
	{
		Comparable temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	private static void show(Comparable[] a)
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
