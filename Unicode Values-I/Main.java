import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill the code;
      Scanner s=new Scanner(System.in);
      
      // char ch=s.nextChar;
      char ch = s.next().charAt(0); 
        int ascii = ch;
       
        int castAscii = (int) ch;
        System.out.println(ascii);
        
    }
}