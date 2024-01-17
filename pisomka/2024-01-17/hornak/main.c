#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

typedef struct{
    char lastname[25];
    int age;
    double height;
    double weight;
    double bmi;
}STUDENT;

int main() {
    int amount;
    double avgheight = 0;
    double avgweight = 0;
    
    printf("Zadajte pocet ziakov, ktorych chcete zadavat: ");
    scanf("%d", &amount);

    STUDENT student[amount];

    for(int i = 0; i < amount; i++) {
        printf("Zadajte priezvisko %d. ziaka: ", i+1);
        scanf(" %25[^\n]s", student[i].lastname);
        printf("Zadajte vek %d. ziaka: ", i+1);
        scanf(" %d", &student[i].age);
        printf("Zadajte vysku %d. ziaka v metroch: ", i+1);
        scanf(" %lf", &student[i].height);
        printf("Zadajte hmotnost %d. ziaka v kilogramoch: ", i+1);
        scanf(" %lf", &student[i].weight);
        printf("\n");

        student[i].bmi = student[i].weight / (student[i].height * student[i].height);
    }

    printf("|-------------------------------------------------------------|\n");
    printf("|Priezvisko\t|Vek\t|Vyska (m)\t|Hmotnost (kg)\t|BMI  |\n");

    for(int i = 0; i < amount; i++) {
        printf("|%s\t\t|%d\t|%.2lf\t\t|%.1lf\t\t|%.1lf |\n", student[i].lastname, student[i].age, student[i].height, student[i].weight, student[i].bmi);

        avgheight += student[i].height / 2;
        avgweight += student[i].weight / 2;
    }

    printf("|-------------------------------------------------------------|");
    printf("\n\n");
    printf("Priemerna vyska ziakov: %.2lf\n", avgheight);
    printf("Priemerna hmotnost ziakov: %.2lf\n", avgweight);

    return 0;
}