package collection;
import java.util.*;
public class HashSetDemo 
{
public static void main(String[] args) {
	TreeSet hs=new TreeSet();
	hs.add("Sandeep");
	hs.add("Tilaka");
	hs.add("Deepa");
	hs.add("Elan");
	hs.add("Chithra");
	hs.add("Tilaka");//duplicate
	hs.add("Elan");//duplicate
	//hs.add(null);
	System.out.println(hs);
}
}
