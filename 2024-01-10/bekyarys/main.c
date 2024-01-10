#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct{
	char brand [20];
	char model [20];
	int year;
	float distancemade;		
}Car;

int main(){
    int i;
    int pocet;


    printf("Zadajte pocet aut ktore chcete registrovat: 1");
    scanf("%d",&pocet);

    Car auta[pocet];
    
    for(i=0;i<pocet;i++){
        printf("zadajte parametre %d. vozidla\n",i+1);
        printf("znacka: ");
        scanf("%s",auta[i].brand);
        printf("model: ");
	    scanf("%s",auta[i].model);
        printf("rok vyroby: ");
	    scanf("%d",&auta[i].year);
	    printf("najazdene v kilometroch: ");
	    scanf("%f",&auta[i].distancemade);
    }
	for(i=0;i<3;i++){
        printf("\n");
    }
	
	for (i=0;i<pocet;i++){
        printf("Znacka %d. auta je: %s\n Model je: %s\n Rok vyroby: %d\n Najazdene ma: %f\n\n",i+1,auta[i].brand,auta[i].model,auta[i].year,auta[i].distancemade);
    }
	 
		
    
    return 0;
}