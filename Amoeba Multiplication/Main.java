import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       int n, a = 0, b = 0, c = 1; //fill your code;
      Scanner s=new Scanner(System.in);
       n=s.nextInt();
      
   for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
     
            //System.out.print(a+" ");
        }
   System.out.print(a);
}
}