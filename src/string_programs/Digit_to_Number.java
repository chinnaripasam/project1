package string_programs;

public class Digit_to_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Chinnaripasam19971905";
String temp="";
for(int i=0;i<str.length();i++) {
	char ch=str.charAt(i);
	if(Character.isDigit(ch)) {
		temp=temp+getDigitName(ch);
	}
	else {
		temp=temp+ch;
	}
}
System.out.println(temp);
	}
	public static String getDigitName(char ch) {
		String value="";
		switch(ch) {
		case'1':
			value="one";
			break;
		case'2':
			value="two";
			break;
		case'3':
			value="three";
			break;
		case'4':
			value="four";
			break;
		case'5':
			value="five";
			break;
		case'6':
			value="six";
			break;
		case'7':
			value="seven";
			break;
		case'8':
			value="eight";
			break;
		case'9':
				value="nine";
				break;
			case'0':
				value="zero";
				break;
		}
		return value;
	}

}
