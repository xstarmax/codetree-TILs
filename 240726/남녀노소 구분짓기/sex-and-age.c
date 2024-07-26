#include <stdio.h>

int main() {
    int gen, age;
    scanf("%d %d",&gen, &age);

    if (gen == 0)
    {
        if (age < 19)
            printf("BOY");
        else
            printf("MAN");
    }
    else
    {
        if (age <19)
            printf("GIRL");
        else
            printf("WOMAN");
    }
    return 0;
}