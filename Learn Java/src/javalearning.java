import java.util.Scanner;
public class javalearning {

	public static void main(String [] args)
    throws Exception
	{
		try
		{
			//Operators
			//Uniary Operator
			float x,y,x1,x2,x3,y1,y2,y3,x4,x5,x6,y4,y5,y6/*,increment,decrement*/;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Value of x");
			x=sc.nextFloat();
			x1=x++;
			/*x2=x++;*/
			System.out.println("Value of x2 is="+x);//21
			x2=x++;
			System.out.println("Value of x2 is="+x);//22
			x3=x++;
			System.out.println("Value of x2 is="+x);//23
			x4=x--;
			System.out.println("Value of x2 is="+x);//22
			x5=x--;
			System.out.println("Value of x3 is="+x);//21
			x6=x++;
			System.out.println("Value of x4 is="+x);//22
			/*increment=x++ + --x;
			System.out.println("Value of increment is:"+ increment);*/
			System.out.println("Enter Value for y:");
			y=sc.nextInt();
			y1=++y;
			System.out.println("Value for y1 is:"+y);//21
			y2=++y;
			System.out.println("Value for y2 is:"+y);//22
			y3=++y;
			System.out.println("Value for y3 is:"+y);//23
			y4=--y;
			System.out.println("Value for y4 is:"+y);//22
			y5=--y;
			System.out.println("Value for y5 is:"+y);//21
			y6=++y;
			System.out.println("Value for y6 is:"+y);//22
			/*decrement=y-- + --y;
			System.out.println("Value of decrement is:" +decrement);*/
			//Arthematic Operators:These operators are used for performing the arthematic operations
			float a,b,c,mult,divide,percent,multiple,add,sub;
			//Multiplicatie
			System.out.print("Enter value of a:");
			a=sc.nextFloat();
			System.out.println("Enter value of b:");
			b=sc.nextFloat();
			System.out.println("Enter Value of c:");
			c=sc.nextFloat();
			mult=a*b*c;
			System.out.println("Value of mult:"+mult);
			divide=a/b/c;
			System.out.println("value of divide is:"+divide);
			percent=a%b%c;
			System.out.println("value of percent is:"+percent);
			multiple=a*b/c;
			System.out.println("value of multiple is:"+multiple);
			//Addative
			add=a+b+c;
			System.out.println("value of add is:"+add);
			sub=a-b-c;
			System.out.println("value of sub is:"+sub);
			//Shift Operators
            int o,p,left1,left2;
            System.out.println("Enter value of o:");
            o=sc.nextInt();
            left1=o<<3;//o*2*2*2
            System.out.println("Value of left1:"+left1);
                     
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception" +e);
		}
		
		
	}
}
