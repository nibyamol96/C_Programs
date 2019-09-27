import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner s=new Scanner(System.in);
        int n1 = s.nextInt();
      int n2 = s.nextInt();
      for(int i=1;i<=n2;i++)
      {
        int res=i*n1;
        System.out.println(i+"*"+n1+"="+res);
      }
    }
}