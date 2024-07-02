package string_programs;

public class Num_of_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="vasaaaaaaaaaassssssssssssssaaaaaaaaaaaaudevaa";
int count=0;
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)=='a') {
		count=count+1;
		
	}
}
System.out.println(count);
	}

}
