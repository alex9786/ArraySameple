/**
 * 
 */
package arraytask;
abstract class main{
	abstract void display();
	abstract void show();
}
class don extends main{
	@Override
 void display() {
	int a=20,b=25;
	int c=a*b;
	System.out.println("c value is:"+c);	
	}
	@Override
  void show() {
	String name ="ALEX";
	String name2="King";
	System.out.println("Name  is  :" +name+ " " +name2);	
	}
	void remo(int c,int d) {
	double g=c/d ;
	System.out.println("G value is:" +g);
	}
}
 public class samples {
	public static void main(String[] args) {
	don s1= new don();	
	s1.display();
	s1.show();
	s1.remo(275,5);
		
		
		
 }
}
