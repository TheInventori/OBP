#include <stdio.h>
#include <stdlib.h>


void pretypovanie() {
	char *p_c;
	int *p_i;

	printf("p_c pred konverziou:\t%p\n", p_c);
	
	p_c = (char*) p_i;
	p_i = (int*) p_c;
	p_c = (char*) p_i;

	printf("p_c po konverzii:\t%p\n", p_c);
}

void swap(int *a, int *b) {
	int tmp = *a;
	*a = *b;
	*b = tmp;
}

int main() {
	int a = 4;
	int b = 5;

	printf("pred vymenou\na = %d\nb = %d\n\n", a, b);

	swap(&a, &b);

	printf("po vymene\na = %d\nb = %d\n", a, b);

	return 0;
}

