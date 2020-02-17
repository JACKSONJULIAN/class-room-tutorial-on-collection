package collection;
import java.util.*;
public class StackDemo 
{
public static void main(String args[])
{
	Stack s=new Stack();
	s.push("patric naugton");
			s.push("james gosling");	
			s.push("mike sheridan");
			s.push("chris wrait");
			s.push("ed frank");	
			System.out.println(" stack elements:"+s);
			System.out.println("first element"+s.peek());
			System.out.println("stacking elements");
			System.out.println("poping out"+s.pop());
			System.out.println("stack elements"+s);
			s.push("java");
			System.out.println("after adding"+s);
			System.out.println("poping out"+s.pop());
			System.out.println("stack elements"+s);
			System.out.println("first element"+s.peek());
			Enumeration e= s.elements();
			System.out.println("elements are:");
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
}
}
