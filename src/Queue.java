
import java.util.Iterator;
import java.util.Scanner;

public class Queue<Item> implements Iterable<Item> {
	public static void main(String[] args) {
		Queue<String> q=new Queue<String>();
		Scanner in=new Scanner(System.in);
		while(true)
		{
			String item=in.nextLine();
			if(item.equals("end"))break;
			if(!item.equals("-"))
			{
				q.enqueue(item);
			}
			else if(!q.isEmpty()) {
				System.out.println(q.dequeue()+" ");
			}
			
		}
		System.out.println("("+q.size()+"left on the queue)");
	}

	
	
	
	private Node first;
	private Node last;
	private int N;
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
	public void enqueue(Item item)
	{
		Node oldlast=last;
		last=new Node();
		last.item=item;
		last.next=null;
		if(isEmpty())first=last;
		else oldlast.next=last;
		N++;
	}
	public Item dequeue()
	{
		Item item=first.item;
		first=first.next;
		if(isEmpty())
		{
			last=null;
		}
		N--;
		return  item;
	}
	
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
