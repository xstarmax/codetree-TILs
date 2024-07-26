#include <stdio.h>

int main() {
    int num;
    scanf("%d", &num);

    if (num < 0)
        printf("ice");
    else if (num >= 100)
        printf("vapor");
    else    
        print("water");

    return 0;
}