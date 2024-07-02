package string_programs;

public class Duplicate_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "We are starting selenium from tomorrow";
        int[] v = new int[26]; // Assuming only lowercase vowels are counted
        
        // Counting the occurrences of vowels
        for (char ch : s.toLowerCase().toCharArray()) {
            if (isVowel(ch)) {
                v[ch - 'a']++;
            }
        } 
        // Printing the count of duplicate vowels
        System.out.println("Count of duplicate vowels:");
        for (char ch : "aeiou".toCharArray()) {
            int count = v[ch - 'a'];
            if (count > 1) {
                System.out.println(ch + ": " + count);
            }
        }
    }
    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

	}


