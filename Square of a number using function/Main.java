#include <stdio.h>
int square(int num)
{
    return (num * num);
}
int main()
{
    int num;
    int n;
	scanf("%d", &num);
    n = square(num);
    printf("%d",n); 
    return 0;
}