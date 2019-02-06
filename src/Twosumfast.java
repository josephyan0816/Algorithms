package learn;

import java.util.Arrays;
import java.util.Scanner;


public class Twosumfast {
	public static int bsrank(int key,int[] a)
	{
		int left=0;
		int right=a.length-1;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(key<a[mid])right=mid-1;
			else if(key>a[mid])left=mid+1;
			else return mid;
		}
		return -1;
		
	}

	public static int count(int[] a)
	{
		int cnt=0;
		Arrays.sort(a);
		int N=a.length;
		for(int i=0;i<N;i++)
		{
			if(bsrank(-a[i], a)>i)
			{
				cnt++;
			}
		}
	
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println(count(a));
	}
}
