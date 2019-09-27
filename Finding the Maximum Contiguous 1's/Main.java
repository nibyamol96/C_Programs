#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int arr[10];
        for(int i = 0; i < n; i++)
        {
            scanf("%d",&arr[i]);
        }
        int farr[n];
        int idx = frequency(arr,n,farr);
        int max = checking(farr,n,idx);
        printf("%d",max);
        return 0;
}
    int frequency(int arr[], int n, int farr[])
    {
        int i;
        int c=0;
        int findex = 0;
        for(i = 0; i < n ; i++)
        {
            if(arr[i] == 1)
            {
                c++;
            }
            if((arr[i] == 0) || (i == n-1))
            {
                farr[findex] = c;
                c= 0;
                findex++;
            }
        }
        return findex-1;
    }
     int checking(int farr[], int n, int idx)
    {
        int max= 0;
        if((farr[0] > farr[1]) || (idx == 0))
        {
            max = farr[0];
        }
        else
        {
            max = farr[1];
        }
        for(int i = 2; i < idx ; i++)
        {
            if(max < farr[idx])
            { 
                max = farr[idx];
            }
        }
    return max;
    }