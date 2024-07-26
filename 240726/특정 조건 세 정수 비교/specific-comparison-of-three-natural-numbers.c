#include <stdio.h>

int main() {
    int a,b,c;
    scanf("%d %d %d", &a, &b, &c);

    if (a<=b && a<=c) 
    // 왜 '<'가 아니라 '<='??
    //'최솟값'을 찾는거라서 다른 수랑 값이 같더라도 최솟값에 해당하면 ok
        printf("1 ");
    else
        printf("0 ");
    
    if (a==b && b==c)
        printf("1");
    else
        printf("0");
    return 0;
}