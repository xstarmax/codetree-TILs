#include <stdio.h>

int main() {
    char s;
    double a,b;

    scanf("%c %lf %lf",&s,&a,&b);
    printf("%c \n%.2lf \n%.2lf",s,a,b);

    return 0;
}