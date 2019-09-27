import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
            // fill your code
          Scanner s=new Scanner(System.in);
          int n1=s.nextInt();
          int n2=s.nextInt();
          int sum=0;
          int diff=0;
          sum=n1+n2;
          diff=n1-n2;
          System.out.println(sum);
          System.out.println(diff);
        }
}