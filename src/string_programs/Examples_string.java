package string_programs;

public class Examples_string {

	public static void main(String[] args) {
		// length of string
String s="chinnari";
System.out.println("size of string :"+s.length());
	
//revese of string
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		System.out.println(ch);
	}
}
}