# Pointer / smernik

**premenna**, ktorej **hodnota** je adresa inej premennej v pamati

```C
int x = 17;
int *p;

p = &x;
```

- niektore operacie, kompaktnejsi a efektivnejsi kod, setrenie pamati
- C vyuziva smerniky explicitne pri:
    - poliach
    - funkciach
    - strukturach

### definicia smernika

```C
int *p;
```

`int` - typ hodnoty, na ktoru smernik ukazuje

### referencny operator
ziskanie adresy objektu

```C
p = &x
```

### dereferencny operator
na ziskanie obsahu danej adresy

```C
int y;
y = *p;
```

priradi y rovnaku hodnotu ako y = x

| priradenie | i | p_i1 | p_i2 |
|---|---|---|---|
| i = 1; | 1 | NULL | NULL |
| p_i1 = &i; | 1 | 0x10 | NULL |
| *p_i1 = 2; | 2 | 0x10 | NULL |
| i = *p_i1 + 1; | 3 | 0x10 | NULL |
| p_i2 = &i; | 3 | 0x10 | 0x10 |


### nulovy smernik NULL

```C
#define NULL 0
```


### smernikova aritmetika

+, -, ++, --

o velkosti posunu zavisi datovy typ, na ktory pointer ukazuje

### konverzia smernikov

snazime sa jeje vyhybat, lebo prinasa mnozstvo problemov napr. so smernikovou aritmetikou

ak je to nutne pouzivame explicitne pretypovanie


```C
char *p_c;
int *p_i;

p_c = (char*) p_i; // spravne

p_c = p_i; // nespravne
```

pokial dochadza k neocakavanej chybe je vhodne pretypovat tam a spet a vypisat hodnoty smernikov

vyhoda - rychlejsi pristup k datam

nevyhoda - vecsie vyuzitie pamete

### smerniky a funkcie

- smerniky pouzivame ak chceme vo funkcii trvale zmenit skutocne hodnoty parametrov, neodovzdavame hodnotu premennej ale jej adresu

### pointer na typ void

- genericky pointer

```C
void *p_void;
```

- neukazuje na ziaden konkretny typ, da sa pouzit na lubovolny typ (po pretypovani)

```C
#include <stdio.h>

int main() {
    int i;
    float f;
    void *p_void = &i;

    *(int*)p_void = 2;

    p_void = &f;

    *(float*)p_void = 1.1;

    return 0;
}
```

