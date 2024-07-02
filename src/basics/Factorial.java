package basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num");
		int n=sc.nextInt();
		int v=1;
		for(int i=1;i<=n;i++) {
			v=v*i;
		}
		System.out.println(v);
	}

}
