#include <stdio.h>

int main() {
    int a,b;
    scanf("%d %d",&a,&b);

    printf("%.2lf", (double)(a+b)/(a-b));

    return 0;
}