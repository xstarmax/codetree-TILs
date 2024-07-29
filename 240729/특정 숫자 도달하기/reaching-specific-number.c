#include <stdio.h>

int main() {
    int arr[10], sum=0, count=0;

    for (int i=0; i<10; i++) {
        scanf("%d", &arr[i]);
        if (arr[i] >= 250){
            break;
        }
        sum += arr[i];
        count += 1;
    }

    double avg = sum / count;

    printf("%d %.1lf", sum, avg);

    return 0;
}