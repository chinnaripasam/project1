package basics;

public class Multidimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] arr = new int[2][2];
arr[0][0]=1;
arr[0][1]=2;
arr[1][0]=3;
arr[1][1]=4;
/*
 * arr[2][0]=5; arr[2][1]=6;
 */
System.out.println(arr[1][1]);
System.out.println(arr[0][1]);
int size=0;
for(int i=0;i<arr.length;i++)
	{
	size=size+arr[i].length;
	}
System.out.println(size);
	}

}
