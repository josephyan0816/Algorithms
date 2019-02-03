package learn;

import java.util.Iterator;
import java.util.Scanner;




public class Stack<Item>  implements Iterable<Item>{
	

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		Scanner in=new Scanner(System.in);
		while(true)
		{
			String item=in.nextLine();
			if(item.equals("end"))break;
			if(!item.equals("-"))
			{
				s.push(item);
			}
			else if(!s.isEmpty())System.out.println(s.pop()+" ");
		}
		System.out.println("("+s.size()+" left on the stack)");
	}
	
	
	
	private Node first;
	public int N;
	private class Node{
		Item item;
		Node next;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	public int size()
	{
		return N;
	}
	public void push(Item item)
	{
		Node oldfirst=first;
		first=new Node();
		first.item=item;
		first.next=oldfirst;
		N++;
	}
	public Item pop()
	{
		Item item=first.item;
		first=first.next;
		N--;
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
