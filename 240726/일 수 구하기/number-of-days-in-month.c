#include <stdio.h>

int main() {
    // 1,3,5,7,8,10,12 -> 31
    // 2,4,6,9,11 -> 30
    int m;
    scanf("%d",&m);
    
    if (m == 4 || m == 6 || m == 9 || m == 11)
        printf("30");
    else if (m==2)
        printf("28");
    else
        printf("31");

    return 0;
}