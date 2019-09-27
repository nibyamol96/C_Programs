import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int expo=sc.nextInt();
      System.out.println(Math.pow(base,expo));
    }
}