#include <stdio.h>
#include <stdlib.h>

/*
napiste funkciu
sucet(int cislo1, int cislo2, int *vysledok)
ktora do premeny vysledok na ktoru ukazuje smernik vlozi sucet
*/

void sucet(int cislo1, int cislo2, int *vysledok) {
    *vysledok = cislo1 + cislo2;
}

int main() {
    int cislo1, cislo2;
    int vysledok;

    printf("zadaj dve cisla: ");
    scanf("%d %d", &cislo1, &cislo2);

    sucet(cislo1, cislo2, &vysledok);

    printf("\nvysledok: %d", vysledok);

    return 0;
}