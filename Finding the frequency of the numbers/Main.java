#include<stdio.h>
int main()
{
    int n,i,k,b=0;
	//printf("Enter size of array: \n");
	scanf("%d",&n);
	//printf("Enter size of k: \n");
	scanf("%d",&k);
	int freq[1000]={0};
	int a[n];            //Array of required size
 	//printf("Enter elements in array: \n");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
     //Initialize all elements to 0 like this.
    /*Take size of freq array to be greater
    than the max element in original array*/
    for(i=0;i<n;i++)
        freq[a[i]]++;    //Increment count of freq[a[i]] for each a[i].
    for(i=1;i<=k;i++)
        if(freq[i])
        printf("%d %d\n",i,freq[i]);
        else
        printf("%d %d\n",i,b);
}