package basics;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=19;
int rem=0;int rev=0;
while(num>=1) {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	
}
	
	System.out.println(rev);
	
	
	}}