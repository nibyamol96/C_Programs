import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int a;
      int s1=0;
      int s2=0;
      while(n1!=0)
      {
        a=n1%10;
        if(a%2==0)
        {
          s1=s1+n1;
        }
        else
        {
          s2=s2+n1;
        }
        n1=n1/10;
      }
      if(s1==s2)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}