import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,sum=0,a;
      int c=0;
      n=sc.nextInt();
      while(sum<n)
      {
        a=sc.nextInt();
        //System.out.println(n);
        c++;
        sum=sum+a;
        if(sum>=n)
        {
          System.out.println("The number of turns is "+c);
        }
      }
}}