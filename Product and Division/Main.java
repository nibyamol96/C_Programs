import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int pdt=0;
      int r=0;
      int q=0;
      pdt=n1*n2;
      r=n1%n2;
      q=n1/n2;
      System.out.println(pdt);
      System.out.println(q);
      System.out.println(r);
    }
}