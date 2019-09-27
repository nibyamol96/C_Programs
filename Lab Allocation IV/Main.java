import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
       int x,y,z,n;
      Scanner s=new Scanner(System.in);
      x=s.nextInt();
      y=s.nextInt();
      z=s.nextInt();
      n=s.nextInt();
      //s.nextLine();
      if(x==n)
        System.out.println("L1");
      if(y==n)
        System.out.println("L2");
      if(z==n)
        System.out.println("L3");
     
      if(x>n&&y>n&&z>n)
      {
      if(x<y&&y<z)
        System.out.println("L1");
     
         else if(y<z)
                   System.out.println("L2");
      else
        System.out.println("L3");
    }
   if(x<n && y<n &&z>n)
       System.out.println("L3");
   if(x<n&&y>n&&z<n)
       System.out.println("L3");
   if(x<n&&y>n&&z>n)
   {if(y<z)
       System.out.println("L2");
    else
      System.out.println("L3");}
  if(x>n&&y<n&&z<n)
    System.out.println("L1");
  if(x>n&&y<n&&z>n)
   {if(x<z)
       System.out.println("L1");
    else
      System.out.println("L3");}
  if(x>n&&y>n&&z<n)
   {if(y<x)
       System.out.println("L2");
    else
      System.out.println("L1");}
 
}} 
