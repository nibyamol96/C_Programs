import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String out;
      out=n%2==0?"Even":"Odd";
     System.out.println(out); 
    }
}