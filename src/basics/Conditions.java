package basics;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("wht is ur name");
String v= scan.nextLine();
System.out.printf("hey %s,how are u ? \n",v);
String c= scan.nextLine();
System.out.println("what is ur age");
int age=scan.nextInt();
System.out.printf("my age is %d",age);
scan.close();
}
}
