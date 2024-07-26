#include <stdio.h>

int main() {
    int a;
    scanf("%d",&a);

    if (a%2 == 0)
        printf("%d", (int)a/2);
    if (a%2 != 0)
        printf("%d", (int)(a+1)/2);
    return 0;
}