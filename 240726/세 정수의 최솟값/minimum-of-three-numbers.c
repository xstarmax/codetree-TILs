#include <stdio.h>

int main() {
    int a,b,c,min;
    scanf("%d %d %d", &a, &b, &c);
    
    if (a<=b)
        //a
        if (a<=c)
            min = a;
            else
                min = c;
    else
        // b
        if (b<=c)
            min = b;
            else
                min = c;
    
    printf("%d",min);
    return 0;
}