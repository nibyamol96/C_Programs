#include<stdio.h>
int subarray(int size, int a[], int sumarr[])
{
for(int index1 = 0; index1 <= size - 1; index1++)
    {
        int k =  a[index1];
        int f = 1;
        for(int index2 = index1+1; index2<=size-1;index2++)
        {
            if(a[index2]>k)
            {
                for(int index3 = index1; index3 <= index2; index3++)
                {
                    if(a[index3]>a[index2])
                    f = 0;
                }
                if(f == 1)
                printf("%d,%d\n", k, a[index2]);
            }
            f = 1;
        }
    }
    return 0;
}
int main()
{
    int size;
scanf("%d",&size);
    int a[size];
    for(int index = 0;index < size; index++)
    {
        scanf("%d", &a[index]);   
    }
    int sumarr[3 * size];
    subarray(size, a, sumarr);
    return 0;
}    
