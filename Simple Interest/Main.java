import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      float interest=0;
      Scanner sc=new Scanner(System.in);
      int p=sc.nextInt();
      int n=sc.nextInt();
      float r=sc.nextFloat();
      interest=(p*n*r)/100;
      System.out.printf("%.2f",interest);
    }
}