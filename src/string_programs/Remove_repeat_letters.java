package string_programs;

public class Remove_repeat_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Chinnari Chinna ";
s=s.replace(" ","");
String s1="";
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	
	if(s1.indexOf(ch)==-1) {
		s1=s1+ch;
	}
}
System.out.println(s1);
}
}