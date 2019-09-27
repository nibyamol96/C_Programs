import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code;
      Scanner ob=new Scanner(System.in);
        
        int n=ob.nextInt();
      int  m=n;
        int N=n*n;
      int ri=0,x=0,ti=0;
       int sum;
       int y=1;
        int tn=n;int c=0;
        while(N!=0)
        {
           N=N/10;c++;
        }
        if(c%2==0)
        {
          ri=c/2;
         
        }
      else
      {
        ri=(c/2)+1;
        
      }
        while(ri!=0)
        {
          x=(10*x)+(N%10);
          N=N/10;
          ri--;
          ti++;
        }
      
     while(ti!=0)
     {
        y=(10*y)+(N%10);
          x=x/10;
          ti--; 
     }
     
     sum=(y+N)-1;
     // System.out.println(sum);
      if(sum==m){
            System.out.println("Kaprekar Number");}
        else
        {  System.out.println("Not A Kaprekar Number");}
        
    }
}