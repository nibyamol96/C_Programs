import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      
      int i;
      for(i=n;i>=m;i--)
      {
        System.out.println(i);
      }
    }
}