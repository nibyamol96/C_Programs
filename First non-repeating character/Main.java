#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    scanf("%[^\n]s", str);
    char ch;
    int count;
    for(int i = 0; str[i] != '\0'; i++){
        count = 0;
        for(int j = 0; str[j] != '\0'; j++){
            if(str[i] == str[j] && i != j){
                count = 1;
                break;
            }
        }
        if(count == 0){
            ch = str[i];
            break;
        }
    }
    if(count == 0){
        printf("%c", ch);
    }
    else{
        printf("All the characters are repetitive");
    }
}  