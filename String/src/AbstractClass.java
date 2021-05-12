import java.util.Scanner;
//@Author Sanjeev Kumar
abstract class Book
{
	String title;
	abstract void setTitle(String s);
	String getTitle()
	{
		return title;
	}

}

class MyBook extends Book
{
	void setTitle(String s)
	{
		title = s;
	}

}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Tiltle Of Book");
		String title=sc.nextLine();
		MyBook Novel=new MyBook();
		Novel.setTitle(title);
		System.out.println("The title is: "+Novel.getTitle());
	}

}

