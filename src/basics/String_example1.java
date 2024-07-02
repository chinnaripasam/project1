package basics;

public class String_example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="chinnari naidu pasam";
String rev=" ";
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}
System.out.println(rev);

	}

}
