#include <stdio.h>

int main() {
    // input: n m (행 n, 열m)
    int n,m;
    scanf("%d %d", &n, &m);

    int arr[n][m];
    int num = 1; // 1로 초기화
    
    for (int i=0; i<n; i++){
        for (int j=0; j<m; j++) {
            arr[i][j] = num;
            num += 1;
        }
    }

    for (int i=0; i<n; i++){
        for (int j=0; j<m; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}