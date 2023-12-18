#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// pocet samohlasok, spoluhlasok, cisel a inych znakov

int find(char c, char arr[]) {
    for(int i = 0; i < strlen(arr); i++) {
        if(c == arr[i] || c + ' ' == arr[i]) {
            return 1;
        }
    }

    return 0;
}

int main() {
    char veta[] = "Na ceste 540 clovek si musi zakricat, ze zivot ma zrazu celkom iny zmysel";
    char samohlasky[] = "aeiouy";
    char spoluhlasky[] = "bcdfghjklmnpqrstvwxz";
    char cislice[] = "0123456789";
    int pocetSamo = 0;
    int pocetSpolu = 0;
    int pocetCislo = 0;


    for(int i = 0; i < strlen(veta); i++) {
        if(find(veta[i], samohlasky)) {
            pocetSamo++;
        }
        else if(find(veta[i], spoluhlasky)) {
            pocetSpolu++;
        }
        else if(find(veta[i], cislice)) {
            pocetCislo++;
        }
    }

    printf("pocet samohlasiek: %d\npocet spoluhlasiek: %d\npocet cislic: %d\npocet inych znakov: %d\n", pocetSamo, pocetSpolu, pocetCislo, strlen(veta) - pocetCislo - pocetSamo - pocetSpolu);

    return 0;
}