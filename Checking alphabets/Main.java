import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      int i=0;
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
      {
        i++;
     }
      if(i==1)
        System.out.println("Vowel");
     else if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
		System.out.println("Consonant");
		else
		System.out.println("Not an alphabet");		
}
}