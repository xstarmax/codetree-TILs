#include <stdio.h>

int main() {
    int a;
    scanf("%d",&a);
    printf("%s", (a==1)?"t": "f"); //삼항 연산의 결과로 "t"랑 "f"가 반환됨.. => %s를 사용
    return 0;
}

/*
	char ans = a == 1 ? 't' : 'f';
	
    // 출력
	printf("%c", ans);
*/