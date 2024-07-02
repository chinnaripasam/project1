package string_programs;

public class Duplicate_vowelsmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String inputString = "We are starting selenium from tomorrow";
		        int[] count = new int[256]; // Assuming ASCII characters
		        
		        // Convert input string to lowercase to make case-insensitive
		        inputString = inputString.toLowerCase();
		        
		        // Count occurrences of vowels
		        int vowelCount = 0;
		        for (int i = 0; i < inputString.length(); i++) {
		            char ch = inputString.charAt(i);
		            if (isVowel(ch)) {
		                if (count[ch] == 1) {
		                    vowelCount++;
		                }
		                count[ch]++;
		            }
		        }
		        
		        // Print the count of duplicate vowels
		        System.out.println("Count of duplicate vowels: " + vowelCount);
		    }
		    
		    // Method to check if a character is a vowel
		    public static boolean isVowel(char ch) {
		        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
		    

	}

}
