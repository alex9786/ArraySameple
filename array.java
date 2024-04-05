/**
 * 
 */
package arraytask;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] numbers = {10,56,33,22,25,16,55};
	String[]names= {"g","m","i","a"};
	
	System.out.println(" Orinal Numbers is:");
   	for (int i:numbers)
    System.out.print(i+" ");
   	int num=0;
  for (int i=0;i<numbers.length;i++) {
	  for(int j =0;j<numbers.length;j++) {
		  if(numbers[i]<numbers[j]) {
			 num=numbers[i]; 
			 numbers[i]=numbers[j];
			 numbers[j]=num;
		  }
	  }
  }System.out.println();
  System.out.println(" Ascending Numbers is:");
 	for (int i:numbers)
  System.out.print(i+" ");  
 	System.out.println();
 	
	System.out.println("name is:");
	for ( String j:names) 
	System.out.print( j+" ");
	  String nam="a";
	for(int i=0;i<names.length;i++) {
	 for(int j=0;j<names.length;j++) {
		/*if(names[i]names[j])*/ {
			nam=names[i];
			names[i]=names[j];
			names[j]=nam;
		}
	 }
	}System.out.println();
	System.out.println(" Acnding name is:");
	for ( String j:names) 
	System.out.print( j+" ");
		
	/*int randomnum=(int)(Math.random()*150);
	System.out.println("Random number is:"+randomnum);*/
	}

}
