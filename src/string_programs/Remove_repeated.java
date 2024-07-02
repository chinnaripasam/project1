package string_programs;

public class Remove_repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="this is java selenium";
str=str.replace(" ", "");
String str1="";
for(int i=0;i<str.length();i++){
	char ch=str.charAt(i);
	if(str.indexOf(ch)==-1) {
		str1+=ch;
	}

}
System.out.println(str1);
	}

}
