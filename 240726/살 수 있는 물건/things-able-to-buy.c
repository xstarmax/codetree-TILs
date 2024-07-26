#include <stdio.h>

int main() {
    int book=3000, mask = 1000, money;
    scanf("%d",&money);

    if (money >= book)
        printf("book");
    else if (money >= mask)
        printf("mask");
    else
        printf("no");
    return 0;
}