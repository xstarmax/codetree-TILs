#include <stdio.h>

int main() {
    int a = 5, b = 6, c = 7;
    int temp1, temp2;

    temp1 = b;
    b = a;
    
    temp2 = c;
    c = temp1;

    a = temp2;
    
    printf("%d\n%d\n%d",a,b,c);
    return 0;
}