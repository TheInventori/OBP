#include <stdio.h>
#include <stdlib.h>
#include <math.h>

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

int main() {
    int pocet;
    char znak;

    printf("zadaj kolko riadkovu pyramidu chces: ");
    scanf(" %d", &pocet);
    printf("zadaj z akych znakov chces mat pyramidu: ");
    scanf(" %c", &znak);

    troj(znak, pocet);

    return 0;
}