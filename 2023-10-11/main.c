#include <stdio.h>
#include <stdlib.h>


int vyskyt(FILE *f, char c) {
    int znak;
    int pocet = 0;

    while((znak = getc(f)) != EOF) {
        printf("ahoj");
        if(znak == c) {
            pocet++;
            printf("%d", pocet);
        }
    }

    return pocet;
}

int main() {
    char c;
    int ahoj;

    printf("zadaj znak: ");
    scanf("%c", &c);

    FILE *f;
    
  	if ((f = fopen("subor.txt", "r")) == NULL) {
    	printf("nevies programovat\n");
    	return 1;
  	}

    printf("znak '%c' sa v subore vyskytol %d krat", c, vyskyt(f, c));

    return 0;
}