import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();
    int p,a;
    a=l*b;
    p=2*(l+b);
      System.out.println(p+"m\n"+a+"sqm");
  }
}