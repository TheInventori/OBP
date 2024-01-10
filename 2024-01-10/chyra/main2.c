#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef struct {
    char meno [51];
    int vek;
    char ulica[51];
}UZIVATEL;

void zostarni(UZIVATEL *uzivatel) {
    uzivatel->vek += 1;
}

int main() {
    UZIVATEL* karol = malloc(sizeof(UZIVATEL));

    strcpy(karol->meno, "Karol Novak");
    karol->vek = 27;
    strcpy(karol->ulica, "Hlavna 10");

    UZIVATEL* user = karol;

    karol->vek = 20;

    zostarni(user);

    printf("Meno: %s Ulica: %s Vek: %d\n", karol->meno, karol->ulica, karol->vek);
    printf("Meno: %s Ulica: %s Vek: %d\n", user->meno, user->ulica, user->vek);

    return 0;
}