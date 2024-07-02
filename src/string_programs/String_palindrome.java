package string_programs;

public class String_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="madam";
//String s[]=str.split(" ");
String rev="";
int len=str.length();
for(int i=(len-1);i>=0;--i) {
	rev=rev+str.charAt(i);
	
}
if(str.equals(rev)) {
	System.out.println(str+" palindrome");
}
else {
System.out.println(str+ "not palindrome");}
}
}

