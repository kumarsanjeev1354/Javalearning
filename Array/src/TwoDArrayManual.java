//Intilizing 2 D array manually
import java.util.Scanner;
public class TwoDArrayManual {
//@author Sanjeev Kumar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr={{1,2,3},{4,5,6},{7,8,9}};//array manually initilized
System.out.println("Array is");
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		System.out.print(+arr[i][j]+"\t");
	}
	System.out.println();
}
arr[0][0]=3;
System.out.println("Updated Array is");
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		System.out.print(+arr[i][j]+"\t");
	}
	System.out.println();
}
	}

}
