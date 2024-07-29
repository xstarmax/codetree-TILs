#include <stdio.h>

int main() {
    int arr[4][4];
    int sum[4] = {0}; // trash 값 제거 초기화

    for (int i=0; i<4; i++) {
        for (int j=0; j<4; j++) {
            scanf("%d", &arr[i][j]);
            sum[i] += arr[i][j];
        }
    }
    
    for (int i=0; i<4; i++) {
        printf("%d\n", sum[i]);
    }

    return 0;
}