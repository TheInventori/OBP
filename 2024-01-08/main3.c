#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// vytvorte novy datovy typ auto, ktory bude obsahovat znacku, model, rok vyroby, pocet najazdenych km

typedef struct {
    char name[30];
    char model[30];
    int date;
    int km;
}AUTO;

int main() {
    AUTO car1;

    printf("Zadaj typ auta: ");
    scanf(" %30[^\n]s", car1.name);
    printf("Zadaj model auta: ");
    scanf(" %30[^\n]s", car1.model);
    printf("Zadaj rok vyroby auta: ");
    scanf(" %d", &car1.date);
    printf("Zadaj pocet najazdenych km auta: ");
    scanf(" %d", &car1.km);

    printf("\n\nauto:\n\ttyp: %s\n\tmodel: %s\n\trok vyroby: %d\n\tpocet najazdenych km: %d\n\n", car1.name, car1.model, car1.date, car1.km);

    return 0;
}