#include <stdio.h>

int main() {
    char p1, p2, p3;
    int t1, t2, t3;

    scanf("%c %d", &p1, &t1);
    scanf("%c %d", &p2, &t2);
    scanf("%c %d", &p3, &t3);

    if (p1 == 'Y' && t1 >= 37) // 1번이 A
    {
        if ((p2 == 'Y' && t2 >= 37) || (p3 == 'Y' && t3 >= 37))
            printf("E");
        else
            printf("N");
    }
    else if ((p2 == 'Y' && t2 >= 37) && (p3 == 'Y' && t3 >= 37))
        printf("E");
    else
        printf("N");
    return 0;
}