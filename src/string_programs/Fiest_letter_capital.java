package string_programs;

public class Fiest_letter_capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="chinnari naidu pasam";
String s[]=str.split(" ");
String result="";
for(int i=0;i<s.length;i++) {
	String s1=s[i];
	result=result+s1.substring(0, 1).toUpperCase()+s1.substring(1).toLowerCase()+" ";
}
System.out.println("First letter capital :"+result.trim());
	}

}
