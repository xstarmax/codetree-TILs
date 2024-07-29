#include <stdio.h>

int main() {
    int n;
    double arr[5], sum = 0;

    scanf("%d", &n);

    for (int i=0; i<n; i++)
    {
        scanf("%lf", &arr[i]);
        sum += arr[i];
    }

    double avg = (double)sum / n;
    printf("%.1lf\n", avg);
    
    if (avg >= 4.0)
        printf("Perfect");
    else if (avg >= 3.0)
        printf("Good");
    else
        printf("Poor");

}