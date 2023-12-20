#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// vytvorte program, ktory nahradi v retazci lubovolny znak inym lubovolnym znakom
// vrati pocet vyskytov lubovolneho retazca
// pripoki retazec2 na koniec retazca1
// zmeni vsetky pismena na velke a vytvori z textu schody smerom dole


int main() {
	char text[100];
	char letter1;
	char letter2;
	
	printf("zadaj retazec: ");
	gets(text);
	
	printf("zadaj hladany znak: ");
	getc(letter1);
	
	printf("zadaj nahradny znak: ");
	getc(letter2);
	
	for(int i = 0; i < strlen(text); i++) {
		if(text[i] == letter1) {
			text[i] = letter2;
		}
	}
	
	puts(text);
	
	return 0;
}
