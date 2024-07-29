#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);

    // 정수 부분 먼저 출력
    printf("%d.", a / b);

    // a를 b로 나눈 나머지를 시작으로
    // 소수점 자리를 하나씩 계산
    a %= b;
    for (int i = 0; i < 20; i++){
        // 나머지에 10을 곱한 값을 기준으로
        // b로 나누었을 때의 몫을 구해준다
        a *= 10;
        printf("%d", a / b);

        // a를 b로 나눈 나머지를 계속 갱신
        a %= b;
    }
    
    return 0;
}

/* Test Case 
input: 3 5
output: 0.60000000000000000000

My Error Case
>> printf("%.21lf", (double)a/b);
output: 0.599999999999999977796
*/