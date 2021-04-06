import java.util.Scanner;
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count no of vowels and consonants
        int vCount = 0, cCount = 0;   
           // String str;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str= sc.nextLine();
        str = str.toLowerCase(); 
        for (int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='i'  )
        	{
        		vCount++;
        	}
        	else if(str.charAt(i)>='a' && str.charAt(i)<='z')
        	{
        		cCount++;
        	}
        	
        }
        System.out.println("Vowels is:"+ vCount);
    	System.out.println("Consonant is:"+ cCount);
	}    
	
}   
