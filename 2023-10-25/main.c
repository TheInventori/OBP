#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>


void tabulka_mocnin(double x, int n) {
    printf("%d mocnin cisla %lf\n", n, x);
    for(int i = 1; i < n + 1; i++) {
        printf("%.2lf^%d\t%.2lf\n", x, i, pow(x, i));
    }
}

void troj(char c, int n) {
    int stlpce = n + n - 1;

    for(int i = 0; i < n * 2 ; i += 2){
        for(int j = 0; j < stlpce; j++) {
            if(j < ((stlpce - i - 1) / 2) || j > ((stlpce + i) / 2)) {
                printf(" ");
            } else {
                printf("%c",c);
            }
        }
        printf("\n");
    }
}

int exist() {
    FILE *f;

    if((f = fopen("TEST.txt", "r")) == NULL) {
        return 1;
    }

    return 0;
}

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
        if (row == 10) {  // Zmena stranky po 24 riadkoch
            printf("Press Enter key to continue...");
            getchar();  // Caka na stlacenie klavesu
            row = 0;
        }
    }
}

double vypis_subor() {
    char filename[100];
    
    printf("\n\n\n\nZadajte meno suboru: ");
    scanf("%s", filename);
    
	if(strcmp(filename, "K.txt") == 0 || strcmp(filename, "k.txt") == 0) {
	    return 2.2;
	}

    FILE *fr = fopen(filename, "r");
    if(fr == NULL) {
        printf("Subor neexistuje.\n");
        return 1.1;  // Chyba - subor neexistuje
    }

    vypis_s_strankovanim(fr);

    if(fclose(fr) != 0) {
        return 1;  // Chyba - nepodarilo sa zatvorit subor
    }

    return 0.5;  // Uspesne ukoncene
}

void vypisovanie_suborov() {
    while(vypis_subor() != 2.2) {}
}

int main() {
    vypisovanie_suborov();

    return 0;
}