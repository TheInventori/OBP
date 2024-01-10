#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char meno[51];
    int vek;
    char ulica[51];
} UZIVATEL;

void zostarni(UZIVATEL *uzivatel) {
    uzivatel -> vek += 1;
}

int main() {
    UZIVATEL* p_karol = malloc(sizeof(UZIVATEL));
    
    strcpy(p_karol -> meno, "Karel Barel");
    p_karol -> vek = 27;
    strcpy(p_karol -> ulica, "Pivna 69");

    p_karol -> vek = 20;

    zostarni(p_karol);

    printf("Meno: %s\nUlica: %s\nVek: %d\n", p_karol -> meno, p_karol -> ulica, p_karol -> vek);
    return 0;
}