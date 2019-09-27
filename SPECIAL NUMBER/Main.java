import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      if(((n1>=10)&&(n1<=99))&&((n2>=10)&&(n2<=99)))
      {
        for(int i=n1;i<=n2;i++)
        {
          int j=i;
          int r1=i/10;
          int r2=i%10;
          if(((r1+r2)+(r1*r2))==j)
          {
            System.out.println(i);
          }
        }
      }
    }
}