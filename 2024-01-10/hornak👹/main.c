#include <stdio.h>
#include <stdlib.h>

typedef struct {
    char znacka[50];
    char model[50];
    int rok;
    int km;
} CAR;

int main() {
    /*
    CAR vozidlo1 = {"Skoda", "Octavia", 1992, 120000};
    CAR vozidlo2 = {"Skoda", "Fabia", 2015, 80000};
    CAR vozidlo3 = {"Skoda", "Kodiaq", 2020, 12000};
    */

    CAR auta[3];

    for(int i = 0; i < 3; i++) {
        printf("Zadaj znacku %d. auta: ", i + 1);
        scanf(" %50[^\n]s", auta[i].znacka);
        printf("Zadaj model %d. auta: ", i + 1);
        scanf(" %50[^\n]s", auta[i].model);
        printf("Zadaj rok vyroby %d. auta: ", i + 1);
        scanf(" %d", &auta[i].rok);
        printf("Zadaj pocet najazdenych km %d. auta: ", i + 1);
        scanf(" %d", &auta[i].km);
    }

    for(int i = 0; i < 3; i++) {
        printf("\n%d. auto: %s %s\nrok vyroby: %d\nnajazdene km: %d\n", i + 1, auta[i].znacka, auta[i].model, auta[i].rok, auta[i].km);
    }

    return 0;
}