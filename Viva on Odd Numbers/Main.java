import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
      int n1;
      float score=0.0f;
      int c=0;
      do
      {
        n1=sc.nextInt();
        if(n1<0){
          score=(float)(score-1);
          
        }
       else if(n1%2==1){
         score=score+1;
          
          c++;
        }
          else
          {
            
           score=(float)(score-0.5);
            //c++;
          }
         
      }while((n1>0)&&(c!=3));
      System.out.printf("%.2f",score);

}
}