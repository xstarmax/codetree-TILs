#include <stdio.h>

int main() {
    int arr[10];
    for (int i = 0; i<10; i++) {
        scanf("%d", &arr[i]);
    }
    int max = arr[0];
    for (int i = 0; i<10; i++) {
        if (max < arr[i+1])
            max = arr[i+1];
    }
    printf("%d", max);
    return 0;
}