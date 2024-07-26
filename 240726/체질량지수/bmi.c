#include <stdio.h>

int main() {
    double h,w,bmi;
    scanf("%lf %lf",&h,&w);
    bmi = (10000*w) / (h*h);

    printf("%d\n",(int)bmi);

    if (bmi >= 25)
        printf("Obesity");

    return 0;
}