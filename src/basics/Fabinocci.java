package basics;

public class Fabinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int limit=1000;
System.out.println("print 1 t0 1000 :");
while(a<=limit) {
	System.out.println(a+" ");
	int temp=a+b;
	a=b;
	b=temp;
}
	}

}
