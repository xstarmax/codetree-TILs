#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int arr[n];

    // 배열 입력
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int count = 0;
    int min = arr[0]; // 첫 번째 값을 min으로 초기화

    // 최소값 찾기 및 특정 조건에 따라 카운트
    for (int i = 0; i < n; i++) {
        if (arr[i] < min) {
            min = arr[i]; // 최소값 업데이트
            count = 1; // 새로운 최소값을 찾았으므로 카운트 1로 초기화
        } else if (arr[i] == min) {
            count++; // 최소값과 같은 경우 카운트 증가
        }
    }

    printf("%d %d\n", min, count); // min과 count 출력

    return 0;
}