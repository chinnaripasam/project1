package basics;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter Marks:");
int c=sc.nextInt();

if(c>=700 && c<=1000) {
	System.out.println("A Grade");
}
else if(c>=600 && c<700) {
	System.out.println("B Grade");
}
else if(c>=500 && c<600) {
	System.out.println("C Grade");
}
else if(c<500 && c>1){
	System.out.println("Fail");
}
else {
	System.out.println("Out of Score");
}
	}

}
