import java.util.Scanner;
public class OneDArray {
//@author sanjeev
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] arr1= {1,2,3};//used to create with specified elements
		int[] arr;
		arr=new int[5];//used to create an array if elements of array are known
		System.out.println("Array is:");//Printing array 
		for(int i=0;i<5;i++)// creating loop for storing elemtents in a array under arr
		{
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			arr[3]=4;
			arr[4]=5;
			//arr[5]=6;
			//System.out.println("Array is:");
			System.out.println(arr[i]);//printing elements or aray at index values
		}
		//System.out.println("Array is:");
		//System.out.println(+arr[i]);
	}

}
