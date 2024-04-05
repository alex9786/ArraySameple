/**
 * 
 */
package arraytask;

  public class copyarray {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {12,13,14,15,16};
System.out.print(" NUMBER Is     :");
 for( int k:num) {
 System.out.print(" "+k);
 }
 System.out.println();
 System.out.print(" Copy number is:");
 int num1=0;
  for(int i=0;i<num.length;i++) {
	 for(int j=0; j<num.length;j++) {
		 num1=num[i];
		 num[i]=num[j];
		 num[i]=num1;
	 }
	
	 System.out.print(" "+num1);
 }
 
  
  
  
  
  }	  
	}


