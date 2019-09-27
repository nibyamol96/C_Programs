import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      int x,a,b,val,v=0;
      Scanner s=new Scanner(System.in);
      x=s.nextInt();
      a=s.nextInt();
      b=s.nextInt();
      val=((x*a)-(x*b));
      v=val-100;
      System.out.println("The profit obtained is Rs."+v);
	}
}