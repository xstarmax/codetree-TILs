#include <stdio.h>

int main() {
    char alphabet;
    scanf("%c", &alphabet);

    if (alphabet == 'S')
        printf("Superior");
    else if (alphabet == 'A')
        printf("Excellent");
    else if (alphabet == 'B')
        printf("Good");
    else if (alphabet == 'C')
        printf("Usually");
    else if (alphabet == 'D')
        printf("Effort");
    else
        printf("Failure");
    return 0;
}