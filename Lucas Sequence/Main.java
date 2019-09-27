import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {

      Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
      //b = sc.nextInt();
      //c = sc.nextInt();
      // System.out.println(a);
      int thirdLast = 0;
	int secondLast = 0;
	int last = 1;
	int current = 0;
	System.out.print(thirdLast+" ");
      System.out.print(secondLast+" ");
      System.out.print(last+" ");
	for (int i = 3; i < n; i++) {
        current = last + secondLast + thirdLast;
        System.out.print(current+" ");

        int tmp = last;
        last = current;
        thirdLast = secondLast;
        secondLast = tmp;
	}

    }
}