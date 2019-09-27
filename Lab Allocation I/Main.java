import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      if((x<y)&&(x<z))
      {
        System.out.println("L1");
      }
      else if((y<x)&&(y<z))
         {
        System.out.println("L2");
      }
       else if((z<x)&&(z<y))
         {
        System.out.println("L3");
      }
    }
}