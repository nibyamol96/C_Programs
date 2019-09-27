#include<stdio.h>
int subarray(int size, int a[], int sumarr[])
{
for(int i1 = 0; i1 <= size - 1; i1++)
        {
            int key =  a[i1];
            for(int i2 = i1+1; i2 <= size-1; i2++)
            {       
                    if(a[i2]>key)
                    printf("%d,%d\n", key,a[i2]);
            }
        }
    return 0;
}  
int main()
{
    int size;
    scanf("%d",&size);
    int a[size];
    for(int i = 0;i < size; i++)
    {
        scanf("%d", &a[i]);   
    }
    int sumarr[3 * size];
    subarray(size, a, sumarr);
    return 0;
}    

