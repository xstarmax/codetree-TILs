#include <stdio.h>

int main() {
    int a,b,c,min;
    scanf("%d %d %d", &a, &b, &c);

    if (a<=b && b<=c)
        min = a;
    else if (b<=a && b<=c)
        min = b;
    else
        min = c;

    printf("%d",min);
    return 0;
}