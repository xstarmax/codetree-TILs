#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);

    // n보다 크거나 같은 n의 배수 중 작은 수 5개?
    for (int i=1; i<6;i++)
        printf("%d ", n*i);
    return 0;
}