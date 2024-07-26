#include <stdio.h>

int main() {
    int math1, eng1, math2, eng2;
    scanf("%d %d %d %d", &math1, &eng2, &math2, &eng2);

    if (math1 > math2)
        printf("A");
    else if ((math1 == math2) && (eng1 > eng2))
        printf("A");
    else
        printf("B");

    return 0;
}