#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    scanf("%[^\n]s", str);
    int key;
    
    scanf("%d", &key);
    key=key%26;
    int str_len = strlen(str);
    
    for(int index = 0; index <= str_len - 1; index++)
    {
      char ch = str[index];
      if(ch >= 'a' && ch <= 'z')	
        {
            ch = ch - key;
            if(ch< 'a')
            {
                ch = ch + 'z' - 'a' + 1;
            }
            
            str[index] = ch;
        }
      else if(ch >= 'A' && ch <= 'Z')	
        {
            ch = ch - key;
            
            if(ch < 'A')
            {
                ch = ch + 'Z' - 'A' + 1;
            }
            str[index] = ch;
        }
    }
    printf("%s", str);
}