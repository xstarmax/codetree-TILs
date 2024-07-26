#include <stdio.h>

int main() {
    int math1, eng1, math2, eng2;
    scanf("%d %d", &math1, &eng1);
    scanf("%d %d", &math2, &eng2);

    if (math1 == math2)
        printf("%s", (eng1>eng2)? "A": "B");
    else
        printf("%s", (math1>math2)? "A": "B");

    return 0;
}