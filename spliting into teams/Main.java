import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
  Scanner s=new Scanner(System.in);
  int no=s.nextInt();
  int t=s.nextInt();
  int team,out;
  team=no/t;
  out=no%t;
  System.out.println("The number of students in each team is "+team+" and left out is "+out);
}
}