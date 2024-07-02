package string_programs;

public class Large_Smallest_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This java of Selenium";
String s[]=str.split(" ");
int a[]=new int[s.length];
String small=s[0];
String large=s[0];
int max=s[0].length();
int min=s[0].length();
for(int i=0;i<s.length;i++) {
	String s1=s[i];
	a[i]=s1.length();
	if(a[i]>max) {
		max=a[i];
	}
	if(a[i]<min) {
		min=a[i];
	}
	
}
for(String word:s) {
	if(word.length()>large.length()) {
		large=word;
	}
	if(word.length()<small.length()) {
		small=word;
	}


	}
System.out.println("largest word "+large+" length-----"+max  );
System.out.println("small word "+small+" length---"+min  );
	}
}

