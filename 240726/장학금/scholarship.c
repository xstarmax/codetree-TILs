#include <stdio.h>

int main() {
    int ex1, ex2;
    scanf("%d %d",&ex1, &ex2);

    if (ex1 < 90 || ex2 < 90)
        printf("0");
    else if (ex2 >= 95)
        printf("100000");
    else
        printf("50000");
    
    return 0;
}