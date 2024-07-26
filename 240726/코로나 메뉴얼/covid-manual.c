#include <stdio.h>

int main() {
    char p1, p2, p3;
    int t1, t2, t3;

    // 이전 입력에서 남아있는 개행문자 \n가 영향을 줄 수 있음...!! 앞에 공백 주기
    scanf(" %c %d", &p1, &t1);
    scanf(" %c %d", &p2, &t2);
    scanf(" %c %d", &p3, &t3);

    if (p1 == 'Y' && t1 >= 37) // A
    {
        if ((p2 == 'Y' && t2 >= 37) || (p3 == 'Y' && t3 >= 37))
            printf("E");
        else
            printf("N");
    }
    else
    {
        if ((p2 == 'Y' && t2 >= 37) && (p3 == 'Y' && t3 >= 37))
            printf("E");
        else
            printf("N");
    }
    return 0;
}