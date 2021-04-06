import java.util.Scanner;
public class SwappingTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Swapping two Strings
String str1,str2;
String temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter String 1 Before Swap:");
 str1= sc.nextLine();
 System.out.println("Enter String 2 Before Swap");
 str2=sc.nextLine();
 // Storing value of string1 in temp
 temp=str1;
 str1=str2;// assigning string 1 value as str2
 str2=temp;
 System.out.println("String 1 After Swap:"+str1);
 System.out.println("String 2 after Swap:"+str2);
 
	}

}
