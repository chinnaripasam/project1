package basics;

public class Object_ex1 {
int v,c;
	public Object_ex1() {
		// TODO Auto-generated constructor stub
	v=10;
	c=19;
	}
	public Object_ex1(int v,int c)
	{
		this.c=c;
		this.v=v;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object_ex1 v1 = new Object_ex1();
		Object_ex1 v2 = new Object_ex1(19,8);
		Object_ex1 v3 = new Object_ex1(05,10);
		System.out.println(v1.add());
		System.out.println(v2.add());
		System.out.println(v3.add());
		System.out.println(v2==v3);
		
		 
	}
public int add() {
	return c+v;
}
}
