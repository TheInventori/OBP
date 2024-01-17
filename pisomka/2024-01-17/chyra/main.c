#include <stdio.h>
#include <stdlib.h>

typedef struct{
    char lname[25];
    int age;
    float height;
    float weight;
    float BMI;
}ZIACI;

int main() {
    int count;

    printf("Kolko ziakov chces zadat: ");
    scanf("%d", &count);
    printf("\n\n");

    ZIACI ziak[count];

    for(int i = 0; i < count; i++) {
        printf("Zadaj prizvisko %d. ziaka: ", i + 1);
        scanf(" %25[^\n]s", ziak[i].lname);
        printf("Zadaj vek %d. ziaka: ", i + 1);
        scanf(" %d", &ziak[i].age);
        printf("Zadaj vysku %d. ziaka: ", i + 1);
        scanf(" %f", &ziak[i].height);
        printf("Zadaj hmotnost %d. ziaka: ", i + 1);
        scanf(" %f", &ziak[i].weight);
        ziak[i].BMI = ziak[i].weight / (ziak[i].height * ziak[i].height);
        printf("\n");
    }

    printf("\nPriezvisko\tVek\tVyska\tHmotnost\tBMI\n2");

    float sumH = 0;
    float sumW = 0;

    for(int i = 0; i < count; i++) {
        printf("%s\t\t%d\t%.2f\t%.2f\t\t%.2f\n", ziak[i].lname, ziak[i].age, ziak[i].height, ziak[i].weight, ziak[i].BMI);
        sumH += ziak[i].height;
        sumW += ziak[i].weight;
    }

    float avgH = sumH / count;
    float avgW = sumW / count;

    printf("\nPriemerna vyska: %.2f\n", avgH);
    printf("Priemerna hmotnost: %.2f\n", avgW);
    
    return 0;
}