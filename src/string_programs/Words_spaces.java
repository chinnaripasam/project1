package string_programs;

public class Words_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1;
String str="chinnari naidu is good girl";
for(int i=0;i<str.length();i++ ) {
	if(str.charAt(i)==' ') 
		a++;
	}
	System.out.println("number of word :-"+a);
	System.out.println("number of spaces :-"+(a-1));
}
	}



  