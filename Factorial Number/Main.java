import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int c=1,flag=0;
      Scanner s=new Scanner(System.in);
     int x=s.nextInt();
      for(int i=1;i<=x;i++)
      {
        c=c*i;
        if(c==x)
        {
      flag=1;
        }
      
      }
     if(flag==1)
        {
      System.out.print("Yes");
          
        }
      else
      {
        System.out.print("No");
      }
    }
}