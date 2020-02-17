package collection;

import java.util.*;

public class HashMapDemo
{
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("oop","object oriented programming");
	hm.put("object","object oriented programming" );
	hm.put("class","defines state and behaviour shared by object");
	System.out.println(hm);
	Set s=hm.entrySet();
	System.out.println();
	System.out.println("\n hashmap current size:"+hm.size());
	System.out.println("elements of hashmap");
	System.out.println();
	Iterator it=s.iterator();
	while(it.hasNext());
	{
		Object ob=it.hasNext();
		System.out.println(""+ob);
	}
	TreeMap tm=new TreeMap();
	tm.put("xava is ","oop");
	tm.put("java is ","simple");
	tm.put("zava is ","robust");
	tm.put("rava is ","temperaray");
	System.out.println();
	System.out.println(tm);
	System.out.println("\n elements of tree map by iteration");
	System.out.println();
	Set s1=tm.entrySet();
	Iterator it1=s1.iterator();
	while(it1.hasNext())
	{
		Map.Entry me=(Map.Entry)it1.next();
		Object ob1=it1.next();
		//both key/value
		System.out.println(""+ob1);
		//only for keys
		System.out.println(me.getKey());
		//only for values
		System.out.println(me.getValue());
	}
	System.out.println("a treemap current size:"+tm.size());
	tm.putAll(hm);
	System.out.println("\n putting a map into invoke map will sort out");
	System.out.println("\n"+tm);
	System.out.println(tm.remove("ram is")+": iam removed value");
	System.out.println("\n treemap current size:"+tm.size());
	System.out.println("checking specific key/value status :"+tm.containsKey("java is")+" "+tm.containsValue("temporary"));
	System.out.println("retrive value by key:"+hm.get("oop"));
	Collection c=tm.values();
	System.out.println("\n values of my treemap:"+c);
	System.out.println("\n keys of treemap:"+tm.keySet());
}
}
