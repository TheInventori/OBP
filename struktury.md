# struktury

pole - postupnost za sebou iducich premennych rovnakeho typu

struktura - je to suhrn jednej alebo viacerych premennych rozneho alebo rovnakeho typu ulzenych pod jedinecnym typom
    - pomaha nam organizovat zlozite data, pretoze umoznue zaobchadzat so skupinou suviciacych premennych ako s celkom a nie ako so samostantnymi objektmi


## definicia

[[pointer.md]]

vytvorime strukturu, ktora bude mat 3 zlozky: suradnice stredu x, y a polomer

moznost 1
```C
struct kruznica {
    double x;
    double y;
    float r;
}; // nezabudni bodkociarku

int main() {
    struct kruznica kruznica1, kruznica2;
    struct kruznica kruznica3;

    return 0;
}
```

moznost 2
```C
struct kruznica {
    double x;
    double y;
    float r;
} kruznica1, kruznica2, kruznica3; // nezabudni bodkociarku

int main() {

    return 0;
}
```

moznost 3
```C
typedef struct {
    double x;
    double y;
    float r;
}KRUZNICA; // musi byt velkym, nezabudni bodkociarku

int main() {
    KRUZNICA kruznica1, kruznica2, kruznica;

    return 0;
}
```

## prikady

```C
#include <stdio.h>


typedef struct {
    double x;
    double y;
    float r;
}KRUZNICA; // musi byt velkym, nezabudni bodkociarku

int main() {
    KRUZNICA kruznica1, kruznica2, kruznica3;

    kruznica1.x = 2.5;
    kruznica1.y = 2;
    kruznica1.r = 4;

    kruznica3.r = 5;

    kruznica2 = kruznica1;

    printf("Kruznica k2 ma stred[%lf,%lf] a polomer %f\n", kruznica2.x, kruznica2.y, kruznica2.r);

    return 0;
}
```

```C
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
```