#include <stdio.h>

int main() {
    char p1, p2, p3;
    int t1, t2, t3;

    scanf("%c %d", &p1, &t1);
    scanf("%c %d", &p2, &t2);
    scanf("%c %d", &p3, &t3);

    if (p1 == 'Y' && t1 >= 37)
    {
        if (p2 == 'Y' && t1 >= 37) || (p3 == 'Y' && t1 >= 37)
            print("E");
        else
            print("N");
    }
    else
        print("N");
        
    return 0;
}