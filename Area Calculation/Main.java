import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      
      int sq,rec;
      float cir;
      Scanner sc=new Scanner(System.in);
      int side=sc.nextInt();
      int base=sc.nextInt();
      int height=sc.nextInt();
      float rad=sc.nextFloat();
      sq=side*side;
      rec=base*height;
      cir=(float)3.14*rad*rad;
      System.out.println(sq);
      System.out.println(rec);
      System.out.println(cir);
    }
}