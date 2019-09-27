import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
      //int n1=n;
      int c=0;
      int i=0;
      int n1=n;
      while(n>0)
      {
        n=n/10;
        c++;
      }
    
  if(c==3){
    while(n1>0)
    {
      i++;
      n=n/2;
      if(i==2){
        if(n%3==0){
          System.out.println("Trendy Number");
       break;}
        else
        {System.out.println("Not a Trendy Number");
         break;}
      }
      }
    }
      else
      System.out.println("Not a Trendy Number");
  }
}