package basics;

public class Duplicates_inSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=6;      
		//inner loop  
		for (int i= rows-1; i>=0 ; i--)  
		{  
		//outer loop  
		for (int j=1; j<=i; j++)  
		{  
		//prints star and space  
		System.out.print(j+ " ");  
		}  
		//throws the cursor in the next line after printing each line  
		System.out.println();  
		}  
		}  
		}  