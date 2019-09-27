#include<stdio.h>
int sumofnatural( int num)
{
  int sum=0,i=0;
  while(i<num)
    {
        i++;
        sum+=i;
    }
    return sum;
}
int main() {
    int n,nsum=0;
    scanf("%d",&n);
  nsum=sumofnatural(n);
   printf("%d",nsum);

  	return 0;
}