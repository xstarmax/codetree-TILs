#include <stdio.h>

int main() {
    int a,b;
    scanf("%d %d",&a,&b);
    
    if (a%2 ==0)
        printf("even");
    else
        printf("odd");
    
    if (b%2 == 0)
        printf("even");
    else
        printf("odd");
    return 0;
}