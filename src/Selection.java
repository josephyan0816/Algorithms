
import java.util.Scanner;

public class Selection implements Comparable{

	public static void sort(int[] a)
	{
		int N=a.length;
		for(int i=0;i<N;i++)
		{
			int min=i;
			for(int j=i+1;j<N;j++)
			{
				if(less(a[j],a[min]))min=j;
			}
			
			exch(a,i,min);
		}
		
	}
	private static void exch(int[] a,int i,int j)
	{
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static void show(int[] a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");
			
		}
		
	}
	public static boolean isSorted(Comparable[] a)
	{
		for(int i=1;i<a.length;i++)
			if(less(a[i],a[i-1]))return false;
		
		return true;
		
	}
	
	
	
	private static boolean less(Comparable v,Comparable w)
	{
		return v.compareTo(w)<0;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		sort(a);
		show(a);
	}
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return o;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
