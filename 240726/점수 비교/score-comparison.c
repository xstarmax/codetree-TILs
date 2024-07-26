#include <stdio.h>

int main() {
    int math1,eng1,math2,eng2;
    scanf("%d %d", &math1, &eng1);
    scanf("%d %d", &math2, &eng2);

    if (math1>math2 && eng1>eng2)
        printf("1");
    else
        printf("0");

    return 0;
}