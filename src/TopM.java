package learn;

import java.util.Scanner;

public class TopM implements Comparable{

	
	
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
public static void sort(String[] s)
{
	for(int i=s.length/2-1;i>=0;i--)
		adjustheap(s,i,s.length);
	
	for(int j=s.length-1;j>0;j--)
		{swap(s,0,j);
		adjustheap(s,0,j);
		}
	
}
public static void adjustheap(String[] s,int i,int len)
{
	String temp=s[i];
	
	for(int k=2*i+1;k<len;k=k*2+1)
	{
		if(k+1<len&&less(s[k],s[k+1]))
		{
			k++;
		}
		
		
		if(!less(s[k],temp))
		{
			swap(s,i,k);
			i=k;
		}else {
			break;
		}
	}
}
public static void swap(String[] s,int a,int b)
{
	String temp=s[a];
	s[a]=s[b];
	s[b]=temp;

}
public static boolean less(Comparable v,Comparable w)
{
	return v.compareTo(w)<0;
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
public static void show(String[] s)
{
	for(int i=0;i<s.length;i++)
	{
		System.out.print(s[i]+" ");
	}
}
}
