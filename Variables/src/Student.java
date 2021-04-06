import java.util.Scanner;
public class Student {
String name;
int roll_no,age;
static String section;
void getdata (String nm,int r,int a,String sc)
{
	name=nm;
	roll_no=r;
	age=a;
	section=sc;
}
void display() {
	System.out.println("Name of Student is"+" "+name);
	System.out.println("Roll Number of Student is"+" "+roll_no);
	System.out.println("Age of student is"+" "+age);
	System.out.println("Section of student is"+" "+section);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj=new Student();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		String nm=sc.nextLine();
		System.out.println("Enter roll_no");
		int r=sc.nextInt();
		System.out.println("Enter age");
		int a=sc.nextInt();
		obj.getdata(nm, r, a,"third");
		obj.display();
		
	}

}
