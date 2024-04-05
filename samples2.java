/**
 * 
 */
package arraytask;
class school{
	private String name;
	private int a;
	private int b;
    
 void student() {
	 double c=a*b;
	 System.out.println("List is:");
	 System.out.println("C value is:"+c);
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	}
public class samples2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
school s =new school();


s.setA(25);
s.setB(5);
s.student();
s.setName("Alex");
System.out.println("A value is:"+s.getA());
System.out.println("B value is:"+s.getB());
System.out.println("Name is   :" +s.getName());
	}
}
