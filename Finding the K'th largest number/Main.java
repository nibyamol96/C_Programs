#include <stdio.h>
    void main()
    {
 
        int i, j, a, n,k, number[30];
        
        //printf("Enter the value of N \n");
        scanf("%d", &n);
        //printf("Enter the value of k\n");
        
 
        //printf("Enter the numbers \n");
        for (i = 0; i < n; ++i)
            scanf("%d", &number[i]);
       scanf("%d", &k);
        for (i = 0; i < n; ++i) 
        {
 
            for (j = i + 1; j < n; ++j)
            {
 
                if (number[i] > number[j]) 
                {
 
                    a =  number[i];
                    number[i] = number[j];
                    number[j] = a;
 
                }
 
            }
 
        }
 
        
             printf("%d", number[n-k]);
 
 
    }