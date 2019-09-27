import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int temp;
      temp=n1;
      n1=n2;
      n2=temp;
      System.out.println(n1);
      System.out.println(n2);
      
    }
}