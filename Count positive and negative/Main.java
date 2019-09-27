import java.util.*;
class Main
{
    public static void main(String arg[])
{
       Scanner s=new Scanner(System.in);
        int n= s.nextInt();
      int c1=0,c2=0;
      for(int i=0;i<n;i++)
      {
        int n2= s.nextInt();
        if(n2<0)
        {
          c1++;
        }
        else
        {
          c2++;
        }
      }
      System.out.println("Number of positive numbers is "+c2+" and the number of negative numbers is "+c1);
    }
}