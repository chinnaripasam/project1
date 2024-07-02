package basics;

public class Reversestr {

	public static void main(String[] args) {
		int rm=0;
		int re=0;
		int num=19;
		while(num>=1) {
			rm=num%10;
			re=re*10+rm;
			num= num/10;
			
		}
		System.out.println(re);
	}
}