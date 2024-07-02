package basics;

import java.util.Scanner;

public class EvenorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num");
		int c=sc.nextInt();
		if(c%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Not Even");
		}
	}

}
