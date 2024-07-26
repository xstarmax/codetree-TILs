#include <stdio.h>

int main() {
    double left,right;
    scanf("%lf %lf",&left, &right);

    if (left >= 1.0 && right >= 1.0)
        printf("High");
    else if (left >= 0.5 && right >= 0.5);
        printf("Middle");
    else
        printf("Low");
    return 0;
}