#include <stdio.h>

int main() {
    int weight = 13;
    double gravity = 0.165; 

    printf("%d * %.6lf = %.6lf", weight, gravity, weight*gravity);
    return 0;
}