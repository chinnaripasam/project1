package string_programs;

public class Palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="madam mom are good friends";
String s[]=str.split(" ");
for(String word:s) {
	String rev="";
	for(int i=word.length()-1;i>=0;i--) {
		rev=rev+word.charAt(i);
	}
	if(word.equals(rev)) {
		System.out.println(word+" is palindrome");
	}
	else {
		System.out.println(word+" is not palindrome");
	}
}
	}

}
