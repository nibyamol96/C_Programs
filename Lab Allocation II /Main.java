import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int num1,num2,num3;//variable declaration for three numbers
      String lab;
//Using scanner class
Scanner scan=new Scanner(System.in);

num1=scan.nextInt();
num2=scan.nextInt();
num3=scan.nextInt();
lab=scan.nextLine();
    if(num2>num1 && num1>num3 || num3>num1 && num1>num2){
        System.out.print("L1");
    }
    
    if(num1>num2 && num2>num3 || num3>num2 && num2>num1){
        System.out.print("L2");
    }
    
    if(num1>num3 && num3>num2 || num2>num3 && num3>num1){
        System.out.print("L3");
    }
    }
}