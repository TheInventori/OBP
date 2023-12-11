#include <stdio.h>
#include <stdlib.h>

int postupnost(int pocet) {
	if(pocet == 1) {
		return -2;
	} else if(pocet == 2) {
		return 3;
	}
	
	return 2 * postupnost(pocet - 2) + postupnost(pocet - 1);
}

int main() {
	int pocet;
	
	printf("zadaj poradove cislo super postupnosti: ");
	scanf("%d", &pocet);
	
	printf("%d. clen: %d", pocet, postupnost(pocet));
	
	return 0;
}