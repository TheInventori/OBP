#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

typedef struct{
    char surname[30];
    int age;
    float height;
    float weight;
    float BMI;
}ZIAK;




int main(){

    int count; // premenna poctu ziakov
    int i; //cyklova premenna
    float heighttogether;
    float weighttogether;
    float averageheight;
    float averageweight;

    printf("Zadajte pocet ziakov ktorych chcete zadat: ");
    scanf("%d",&count);

    ZIAK ziaci [count]; //pole ziakov typu struktury ZIAK

    for(i = 0; i < count; i++){
        printf("Zadajte priezvisko %d. ziaka: ",i+1);
        scanf("%s",ziaci[i].surname);
        printf("Zadajte vek %d. ziaka: ",i+1);
        scanf("%d",&ziaci[i].age);
        printf("Zadajte vysku %d. ziaka v metroch: ",i+1);
        scanf("%f",&ziaci[i].height);
        printf("Zadajte hmotnost %d. ziaka kilogramoch: ",i+1);
        scanf("%f",&ziaci[i].weight);

        ziaci[i].BMI = ziaci[i].weight/pow(ziaci[i].height,2);
        heighttogether += ziaci[i].height;
        weighttogether += ziaci[i].weight;
    }
    
    averageheight = heighttogether/count;
    averageweight = weighttogether/count;

    printf("VYPIS ZIAKOV | POCET %d\n",count);
    printf("Priezvisko\tVek\t\tVyska\t\tHmotnost\tBMI\n");

    for(i = 0; i < count; i++){
        printf("%s\t\t%d\t\t%.2f\t\t%.2f\t\t%2.f\n",ziaci[i].surname,ziaci[i].age,ziaci[i].height,ziaci[i].weight,ziaci[i].BMI);
    }

    printf("\n////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
    printf("\nPriemerna vyska ziakov je %f\n",averageheight);
    printf("Priemerna vaha ziakov je %f\n",averageweight);

    return 0;
}