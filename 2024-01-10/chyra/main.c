#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef struct {
    char name[30];
    char model[30];
    int date;
    int km;
}CAR;

int main() {
    CAR car1, car2, car3;

    CAR auta[3];

    for(int i = 0; i < 3; i++) {
        printf("Zadaj znacku %d. auta: ", i + 1);
        scanf(" %30[^\n]s", auta[i].name);
        printf("Zadaj model %d. auta: ", i + 1);
        scanf(" %30[^\n]s", auta[i].model);
        printf("Zadaj rok %d. auta: ", i + 1);
        scanf("%d", &auta[i].date);
        printf("Zadaj km %d. auta: ", i + 1);
        scanf("%d", &auta[i].km);
    }

    for(int i = 0; i < 3; i++) {
        printf("\n\nauto:\n\ttyp: %s\n\tmodel: %s\n\trok vyroby: %d\n\tpocet najazdenych km: %d\n\n", auta[i].name, auta[i].model, auta[i].date, auta[i].km);
    }

    // CAR car1 = {"Skoda", "Octavia", 1992, 120000}, 
    //     car2 = {"Skoda", "Fabia", 2015, 80000}, 
    //     car3 = {"Skoda", "Kodiaq", 2020, 12000};

    // printf("Zadaj znacku 1. auta: ");
    // gets(car1.name);
    // printf("Zadaj model 1. auta: ");
    // gets(car1.date);
    // printf("Zadaj rok 1. auta: ");
    // scanf("%d", &car1.date);
    // printf("Zadaj km 1. auta: ");
    // scanf("%d", &car1.km);

    // printf("\n\nauto:\n\ttyp: %s\n\tmodel: %s\n\trok vyroby: %d\n\tpocet najazdenych km: %d\n\n", car2.name, car2.model, car2.date, car2.km);

    return 0;
}