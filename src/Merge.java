package learn;

import java.util.Scanner;

public class Merge implements Comparable{
	private static Comparable[] aux;
	
	private static boolean less(Comparable v,Comparable w)
	{
		return v.compareTo(w)<0;
	}
	
	public static void sort(Comparable[] a)
	{
		aux=new Comparable[a.length];
		sort(a,0,a.length-1);
	}
	private static void sort(Comparable[] a,int lo,int hi)
	{
		if(hi<=lo)return ;
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
	public static void merge(Comparable[] a,int lo,int mid,int hi)
	{
		int i=lo;
		int j=mid+1;
		for(int k=lo;k<=hi;k++)
		{
			aux[k]=a[k];
		}
		for(int k=lo;k<=hi;k++)
		{
			if(i>mid)a[k]=aux[j++];
			else if(j>hi)a[k]=aux[i++];
			else if(less(aux[j],aux[i]))a[k]=aux[j++];
			else a[k]=aux[i++];
		}
		
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
