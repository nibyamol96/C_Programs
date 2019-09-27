import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a,b;
      a=n%10;
      b=(n%100)/10;
      b=a+b;
      System.out.println("Alice must go in path-"+b);
        
	}
}