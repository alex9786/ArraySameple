/**
 * 
 */
package arraytask;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]numbers= {2,3,4,5,6,7};
int sum=0;
 for(int i:numbers)
	sum+=i;
 System.out.println("SUM OF NUMBER IS:"+sum);
	double Average=(sum/numbers.length);
	System.out.println("AVERAGE OF SUM :"+Average);
	
	String[][]name= {{" alex "," raghu "," hari "},{" doss "," mani "," karan "}};
	System.out.println(" find the elements:");
	System.out.println(name[0][1]);
	System.out.println(name[1][1]);
	System.out.println(name[1][0]);
		
	}
}
