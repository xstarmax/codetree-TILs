#include <stdio.h>

int main() {
    float left,right,avg;
    scanf("%lf %lf", &left, &right);
    avg = (left+right)/2;

    if (avg >= 1.0)
        printf("High");
    else if (avg >= 0.5)
        printf("Middle")
    else
        printf("Low");

    return 0;
}