import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
      int mark=sc.nextInt();
      if(mark==100)
      {
        System.out.println("S");
      }
      else if((mark<=99)&&(mark>=90))
      {
        System.out.println("A");
      }
      else if((mark<=89)&&(mark>=80))
      {
        System.out.println("B");
      }
      else if((mark<=79)&&(mark>=70))
      {
        System.out.println("C");
      }
      else if((mark<=69)&&(mark>=60))
      {
        System.out.println("D");
      }
      else if((mark<=59) && (mark>=50))
      {
        System.out.println("E");
      }
      else if(mark<50)
      {
        System.out.println("F");
      }
      else if(mark==100)
      {
        System.out.println("Invalid Input");
      }
    }
}