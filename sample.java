/**
 * 
 */
package arraytask;
class mai{
	void joe() {
		System.out.println("      Details: ");
	}
}
class joes extends mai{
void joe(String a,String b) {
	System.out.println(" Name         : "+a);
	System.out.println(" FatherNam e  : "+b);
}
}
class joes1 extends joes{
void joe(String l,double b,String list) {
	System.out.println(" Date of brith: "+l);
	System.out.println(" Temp         : "+b);
	System.out.println(" City Name    : "+list);
}

}
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
joes1 m1= new joes1();
	m1.joe();
	m1.joe( "Alex ", "Kumar ");
	m1.joe("20/07/2001" ,  45.6 , "Orathanadu");
		
		
		
 }
}
