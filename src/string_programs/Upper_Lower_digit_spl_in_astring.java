package string_programs;

public class Upper_Lower_digit_spl_in_astring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="@@ILovevAsU@fromChinnAri*123$";
int l=0;
int u=0;
int d=0;
int sp=0;
String lstr="";
String ustr="";
String dstr="";
String spstr="";
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if(Character.isLowerCase(ch)) {
		l=l+1;
		lstr=lstr+ch;
	}
	else if(Character.isUpperCase(ch)) {
		u=u+1;
		ustr=ustr+ch;
	}
	else if(Character.isDigit(ch)) {
		d=d+1;
		dstr=dstr+ch;
	}
	else {
		sp=sp+1;
		spstr=spstr+ch;
	}
}
System.out.println("LowerCase :"+l+"----"+lstr);
System.out.println("UpperCase :"+u+"----"+ustr);
System.out.println("Digits :"+d+"----"+dstr);
System.out.println("Special Char :"+sp+"----"+spstr);
	}

}
