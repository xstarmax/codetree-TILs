#include <stdio.h>

int main() {
    int a = 3, b = 5;
    int temp;

    temp = a; // temp에 a값을 복사
    a = b;    // 변수 a에 b의 값을 복사
    b = temp; // 변수 b에 temp(=a)의 값을 복사

    printf("%d\n%d",a,b);
    
    return 0;
}