import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    Scanner s=new Scanner(System.in);
    int x1=s.nextInt();
    int y1=s.nextInt();
    int x2=s.nextInt();
    int y2=s.nextInt();
    float out1,out2;
    out1=(float)(x1+x2)/2;
    out2=(float)(y1+y2)/2;
    System.out.println("Binoy's house is located at ("+out1+","+out2+")");
  }
}