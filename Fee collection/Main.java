import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
    String type=sc.nextLine();
      int tu=sc.nextInt();
      int bu=sc.nextInt();
      int hs=sc.nextInt();
      float total=0;
      float per;
      if(type.equalsIgnoreCase("msds"))
         {
           total=tu+bu;
           System.out.println(total);
         }
         else if(type.equalsIgnoreCase("msh"))
                 {
                   total=(float)tu+hs;
           System.out.printf("%.2f",total);
                 }
           else if(type.equalsIgnoreCase("mgsds"))
                 {
                   total=(float)((150*tu)/100+bu);
             System.out.printf("%.2f",total);
                 }
                  else if(type.equalsIgnoreCase("mgsh"))
                 {
                   total=(float)(150*tu)/100+hs;
                    System.out.printf("%.2f",total);
                 } 
           //System.out.println(total);
                 
    }
}