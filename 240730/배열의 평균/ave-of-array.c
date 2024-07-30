#include <stdio.h>

int main() {
    // 2행 4열
    int arr[2][4];

    for (int i=0; i<2; i++)
    {
        for (int j=0; j<4; j++)
        {
            scanf("%d ", &arr[i][j]);
        }
    }

    // 가로 평균
    for (int i=0; i<2; i++)
    {
        int cnt = 0, avg = 0;
        for (int j=0; j<4; j++)
        {
            cnt += 1;
            avg += arr[i][j];
        }
        printf("%.1lf ", (double)(avg/cnt));
    }
    printf("\n");
    
    // 세로 평균
    for (int j=0; j<4; j++)
    {
        int cnt = 0, avg = 0;
        for (int i=0; i<2; i++)
        {
            cnt += 1;
            avg += arr[i][j];
        }
        printf("%.1lf ", (double)(avg/cnt));
    }
    printf("\n");

    // 전체 평균
    int cnt = 0, avg=0;
    for (int i=0; i<2; i++)
    {
        for (int j=0; j<4; j++)
        {
            cnt += 1;
            avg += arr[i][j];
        }
    }
    printf("%.1lf ", (double)(avg/cnt));
    
    return 0;
}