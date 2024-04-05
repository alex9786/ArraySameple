/**
 * 
 */
package arraytask;
import java. util.ArrayList;

public class collectinos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList l= new ArrayList();
   l.add(10);
   l.add(32);
   l.add(24);
   l.add(54);
   l.add(21);
   l.add(24);
   l.add(54);
   l.add(25);
   l.add(" Alex");
   System.out.println(l.get(3));
   l .add(3, "Alex ");
  
   
    System.out.println(l);
    System.out.println(l.contains(32)); 
    System.out.println(l.size());	
    System.out.println(l.get(3));	
    System.out.println(l.indexOf(54) );	
    System.out.println(l.lastIndexOf(54));	
    System.out.println();

   /* ArrayList l2 = new ArrayList();
    System.out.println("l2 is empty:" +l2.isEmpty());
    l2.add(32);
    l2.add(22);
    l2.add(12);
    l2.add(62); 
    l2.add("ALEX");
    l2.add(0,l);
    l2.add(2,55);
    l2.add(22);
    System.out.println(l2);
    System.out.println(l2.get(4));
    System.out.println("l2 is empty:" +l2.isEmpty());
    System.out.println(l2.indexOf(22));
    System.out.println(l2.lastIndexOf(22));*/

	}

}
