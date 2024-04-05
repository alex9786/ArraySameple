/**
 * 
 */
package arraytask;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc = new Scanner (System.in);
  System.out.println("ENTER THE NUMBER:");
   int n = Sc.nextInt();

  for(int i=1;i<=n;i++) {
  for(int j=1;j<=i;j++) {
  System.out.print(j);
	}
  System.out.print("\n");
  }
  System.out.println("Triangle shape:");
  for(int i1=1;i1<=n;i1++) {
	for(int s=1;s<=n-i1;s++) {
	System.out.print(" ");
	}
	for(int j=1;j<=i1*2-1;j++) {	
		System.out.print(j);
	}
	System.out.println();
 }
  System.out.println("SQURE SHAPE:");
  for(int i=0;i<=n;i++) {
	 for(int j=0;j<=n;j++) {
		 System.out.print(i+" ");
	 }
	 System.out.println();
  }
  
  
  
  
  
  
}
}