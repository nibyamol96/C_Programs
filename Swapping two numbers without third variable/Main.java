import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println(a+"\n"+b);
    }
}