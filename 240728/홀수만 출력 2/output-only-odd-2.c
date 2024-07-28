#include <stdio.h>

int main() {
    int a, b, temp;
    scanf("%d %d", &a, &b);

    // a<b 상황을 충족해야...
    if (a>b)
        temp = a;
        a = b;
        b = temp;

    for (int i=b; i>=a; i--)
        { 
            if (i % 2 != 0)
                printf("%d ", i);
        }
    return 0;
}