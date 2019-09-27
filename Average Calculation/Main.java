import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc=new Scanner(System.in);
      int m;
      int sum=0;
      Float avg;
      for(int i=0;i<5;i++)
      {
        m=sc.nextInt();
        sum=sum+m;  
      }
      avg=(float)sum/5;
      System.out.println(avg);
    }
}