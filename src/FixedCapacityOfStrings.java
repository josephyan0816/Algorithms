package learn;

import java.util.Scanner;

public class FixedCapacityOfStrings {
	public static void main(String[] args) {
		FixedCapacityOfStrings s=new FixedCapacityOfStrings(100);
		Scanner in=new Scanner(System.in);
		while(true)
		{
			 String item=in.nextLine();
			 if(item.equals("end"))break;
			if(!item.equals("-"))s.push(item);
			else if(!s.isEmpty())System.out.println(s.pop()+" ");
			
		}
		System.out.println("("+s.size()+"left on stack)");
	}
	
	private String[] a;
	private int N;
	public FixedCapacityOfStrings(int cap) {
		a=new String[cap];
		
	}
	public boolean isEmpty()
	{
		return N==0;
	}
	public int size()
	{
		return N;
	}
	private void push(String item) {
		a[N++]=item;
	}
	private String pop() {
		return a[--N];
	}
}
