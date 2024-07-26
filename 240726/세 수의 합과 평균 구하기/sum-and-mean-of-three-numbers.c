#include <stdio.h>

int main() {
    int a,b,c;
    scanf("%d %d %d", &a, &b, &c);
    printf("%d \n%d", a+b+c, (int)(a+b+c)/3);

    // (double) -> 반올림 하게 됨
    // 소수점 버리려면 int가 더 적절
    return 0;
}