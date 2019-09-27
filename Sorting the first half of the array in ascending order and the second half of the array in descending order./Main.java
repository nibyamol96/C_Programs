#include<stdio.h>
int insertion_sort(int n,int a[]);
int main()
{
    int n;
scanf("%d",&n);
    int a[n];
    for(int i = 0;i < n; i++)
    {
        scanf("%d",&a[i]);   
    }
    insertion_sort(n,a);
    return 0;
}    
int insertion_sort(int n,int a[])
{
for (int i1 = 1; i1 < n/2; i1++) 
        {
            int key = a[i1];
            int i2 = i1 - 1;
            while((i2 >= 0) && (a[i2] > key)) 
            {
               a[i2 + 1] = a[i2];
                i2--;
            }
            a[i2 + 1] = key;
        }
        for (int i1 = n/2; i1 < n; i1++) 
        {
            int key = a[i1];
            int i2 = i1 - 1;
            while((i2 >= n/2) && (a[i2] < key)) 
            {
                a[i2 + 1] = a[i2];
                i2--;
            }
            a[i2 + 1] = key;
        }
        for(int i = 0; i < n; i++)
        {
            printf("%d ", a[i]);
        }
    return 0;
}