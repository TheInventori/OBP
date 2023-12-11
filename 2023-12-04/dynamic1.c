#include <stdio.h>
#include <stdlib.h>

/* 
    do premennej pocet typu int nacitajte hodnotu z klavesnice nechajte si pridelit pole int-ov 
    danej velkosti s lubovolnym nazvom (typu smernik), nacitajte hodnoty od uzivatela, vypiste na 
    obrazovku a uvolnite pamat
*/

int main() {
    int pocet;

    printf("Zadaj velkost pola: ");
    scanf("%d", &pocet);
    
    int *pole = (int*)malloc(sizeof(int) * pocet);

    if(pole == NULL) {
        printf("nemas dostatok pamate\n");
        exit(0);
    }

    for(int i = 0; i < pocet; i++) {
        printf("zadaj %d. prvok pola: ", i + 1);
        scanf("%d", pole + i);
    }

    printf("pole:\n");

    for(int i = 0; i < pocet; i++) {
        printf("\t%d\n", *(pole + i));
    }

    free(pole);

    return 0;
}