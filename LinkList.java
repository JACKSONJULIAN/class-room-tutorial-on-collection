package collection;
import java.util.*;
public class LinkList 
{
	public static void main(String[] args)
	{
	LinkedList ll=new LinkedList();
	ll.add(4);
	ll.add(2);
	ll.add(1);
	ll.add(3);
	System.out.print(ll);
	ll.addFirst(0);
	System.out.print(ll);
	ll.addFirst(10);
	ListIterator li= ll.listIterator();
	int counter=0;
	while(li.hasNext())
	{
		System.out.println("elements ["+ counter+ "]="+li.next());
		System.out.println("-hasPrevious= "+li.hasPrevious());
		System.out.println("-hasNext= "+li.hasNext());
		System.out.println("-previousIndex= "+li.previousIndex());
		System.out.println("-nextIndex="+li.nextIndex());
		System.out.println();
		counter++;
	}
	}
}
