package string_programs;

public class Reverse_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Iam ChinnariVas";
String[] s=str1.split(" ");
//System.out.println(s.length);
for(int i=0;i<s.length;i++) {
	for(int j=s[i].length()-1;j>=0;j--) {
		System.out.print(s[i].charAt(j));
		
	}
	System.out.print(" ");
}
	

	

}
}
