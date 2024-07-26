#include <stdio.h>

int main() {
    int a,b;
    scanf("%d %d",a,b);
    printf("%d",a>=b);
    printf("%d",a>b);
    printf("%d",b>=a);
    printf("%d",b>a);
    printf("%d",a==b);
    printf("%d",a!=b);
    return 0;
}