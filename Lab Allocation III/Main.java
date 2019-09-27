import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int i=0;
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      int s=sc.nextInt();
      if((s>=x)&&(s>=y)&&(s>=z))
      {
        System.out.println("0");
      }
      else
      {
      if(x>s)
      {
        i++;
      }
      if(y>s)
      {
        i++;
      }
      if(z>s)
      {
        i++;
      }
        System.out.println(i);
      }
      
    }
}