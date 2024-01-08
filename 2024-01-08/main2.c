#include <stdio.h>
#include <string.h>


struct hehe{
    int mojeCislo;
    char mojePismeno;
    char mojRetazec[30];
};

int main() {
    struct hehe hehe1, hehe2;

    hehe1.mojeCislo = 69;

    hehe1.mojePismeno = 'x';

    strcpy(hehe1.mojRetazec, "ahoj");

    printf("\n\ntvoje oblubene cislo je: %d\ntvoje oblubene pismeno: %c\ntvoje oblubene slove: %s\n\n", hehe1.mojeCislo, hehe1.mojePismeno, hehe1.mojRetazec);

    hehe2 = hehe1;

    hehe2.mojePismeno = 'Y';

    printf("\n\ntvoje oblubene cislo je: %d\ntvoje oblubene pismeno: %c\ntvoje oblubene slove: %s\n\n", hehe2.mojeCislo, hehe2.mojePismeno, hehe2.mojRetazec);

    return 0;
}