#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void vypis(FILE *fr) {
    char c;
    while ((c = fgetc(fr)) != EOF) {
        putchar(c);
    }
}

void vypis_s_strankovanim(FILE *fr) {
    int row = 0;
    int c;
    while ((c = fgetc(fr)) != EOF) {
        putchar(c);
        if (c == '\n') {
            row++;
        }
        if (row == 5) {  // Zmena stranky po 24 riadkoch
            printf("Press any key to continue...");
            getchar();  // Caka na stlacenie klavesu
            row = 0;
        }
    }
}

double vypis_subor() {
    char filename[100];
    
    printf("Zadajte meno suboru: ");
    scanf("%s", filename);
    
	if (strcmp(filename, "K.txt") == 0 || strcmp(filename, "k.txt") == 0) {
	    return 2.2;
	}

    FILE *fr = fopen(filename, "r");
    if (fr == NULL) {
        printf("Subor neexistuje.\n");
        return 1.1;  // Chyba - subor neexistuje
    }

    vypis_s_strankovanim(fr);

    if (fclose(fr) != 0) {
        return 1;  // Chyba - nepodarilo sa zatvorit subor
    }

    return 0.5;  // Uspesne ukoncene
}

int main() {
    printf("\n\n\n\nReturn value: %.1lf", vypis_subor());

    return 0;  // Uspesne ukoncene
}