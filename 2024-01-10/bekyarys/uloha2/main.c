#include <stdio.h>
#include <string.h>
#include <stdlib.h>


typedef struct{
    char meno[51];
    int vek;
    char ulica[51];
}Uzivatel;

void getold(Uzivatel uzivatel){
    uzivatel.vek++;
}

int main(){

    Uzivatel karel = malloc(sizeof(Uzivatel));


    Uzivatel karel = {"Karel Got", 80,"Hlavna 420"};

    Uzivatel user = karel;

    karel.vek = 20;
    
    printf("Meno: %s Ulica: %s Vek: %d\n",karel.meno,karel.ulica,karel.vek);
    printf("Meno: %s Ulica: %s Vek: %d\n",user.meno,user.ulica,user.vek);

    getold(karel);
    printf("Meno: %s Ulica: %s Vek: %d\n",karel.meno,karel.ulica,karel.vek);

    return 0;
}