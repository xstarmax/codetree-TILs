#include <stdio.h>

int main() {
    double avg;
    scanf("%lf", &avg);

    if (avg >= 1.0)
        printf("High");
    else if (avg >= 0.5)
        printf("Middle");
    else
        printf("Low");

    return 0;
}