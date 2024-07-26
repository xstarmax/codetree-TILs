#include <stdio.h>

int main() {
    int book=3000, mask=1000, pen=500, money;
    scanf("%d", &money);
    if (money >= book)
        printf("book");
    else if (money >= mask)
        printf("mask");
    else if (money >= pen)
        printf("pen");
    else
        printf("no");
    return 0;
}