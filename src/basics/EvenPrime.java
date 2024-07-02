package basics;

import java.util.Scanner;

public class EvenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		System.out.print("enter num");
		int c=sc.nextInt();
		int count=0;
		for(int i=1;i<=c;i++) {
			if(c%i==0) {
				count++;
			}
		}
		if(count==2) 
			System.out.print("Prime Number");

		else 
			System.out.print("Not Prime Number");

			}

		}
