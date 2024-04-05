/**
 * 
 */
package arraytask;

/**
 Write a Java program to test 
 if an array contains a specific value. 
 */
public class specifyarr {

	public static void main(String[] args) {
	int[]a= {12,23,13,31,33,3,23,54,45};
	boolean b= false;
	int search=16;
	System.out.println("Numbers is:");
    for (int i:a) {
    if(i==search)
    b=true;
    System.out.print(" "+i);
 }
    System.out.println();
   if(b==true) {
	System.out.println("Number is founded");
   }else {
    System.out.println(" Unvalueied Number : "+search);
   }
   
   
	 
  }

}
