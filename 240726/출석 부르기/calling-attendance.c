#include <stdio.h>

int main() {
    int num;
    scanf("%d",&num);

    if (num == 1)
        printf("John");
    else if (num == 2)
        printf("Tom");
    else if (num == 3)
        printf("Paul");
    else   
        printf("Vacancy");
    return 0;
}