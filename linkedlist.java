/**
 * 
 */
package arraytask;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*LinkedList l=new LinkedList();
	l.add(10);	
	l.add(15);
	l.add(13);
	l.add(14);
	l.add(15);
	l.add(15);
	l.add(13);
	l.add(14);
	l.addFirst(25);
	l.addFirst("Alex");
	l.offer(500);
	
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.addAll(l);
	System.out.println(l);
	System.out.println(lhs);
	//l.removeLast();
	/*System.out.println(l.poll());
	System.out.println(l.indexOf(15));
	System.out.println(l);
	System.out.println(l.containsAll(l));	*/
	
	/*	Map<String,Integer>m=new HashMap<>();
		  m.put("Tamil", 95);
		  m.put("English", 95);
		  m.put("Baths", 97);
	      m.put("Arivieal", 95);	
	      m.put("Baths", 97);
	      m.replace("Tamil", 100);
	     
		//m.remove("Maths");
		System.out.println(m);
		System.out.println(m.replace("Tamil ",100,95 ));
		/*Set s= m.keySet();
		Collection c = m.values();
		Set s2 = m.entrySet();
		Iterator i = s2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		 Set s1 = m.keySet();
		 for(String i1:m.keySet()) {
	      System.out.println(i1);
		 }*/
		Map<Integer,String> tm=new TreeMap<>();
		
		tm.put(4, "Hari");
		tm.put(5, "Tamil");
		tm.put(6, "Sivs");
		tm.put(2, "Mathan");
		tm.put(1, "Alex");
		tm.put(3, "VIjay");
	    tm.put(8, "Jeeva");
	    tm.put(7, "Alex");
		System.out.println(tm);
		System.out.println(tm.get(8));
		Set s=tm.keySet();
		Collection c=tm.values();
		Set s1=tm.entrySet();
		Iterator i =s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+";");
		}
		
		
		
	}
}
