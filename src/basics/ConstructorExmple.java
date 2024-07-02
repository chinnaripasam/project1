package basics;

public class ConstructorExmple {
int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExmple v =new ConstructorExmple();
		System.out.println(v.c);
		
	}
public ConstructorExmple() {
	c=66;
}
public ConstructorExmple(int c) {
	System.out.println(c);
}
}
