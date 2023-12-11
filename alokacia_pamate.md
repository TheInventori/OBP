# Staticka a dynamicka alokacia pamate

## Staticky alokovana pamat

- prekladac uz pri preklade kodu vie, kolko pamate bude potrebnej pri behu programu

## Dynamicky alokovana pamat v zasobniku

- C nevie kolko krat funkciu zavolame a teda kolko premennych vo finale budeme potrebovat
- pamat sa priraduje dynamicky az za behu programu
- deje sa to **automaticky**

## Dynamicky alokovana pamat v halde

- ak vopred neviete urcit velkost pola alebo dlzku retazca
- C tu ponuka funkcie **`malloc()`** a **`free()`** ktorimi si vieme za behu programu poziadat o lubovolne miesto pamate

## Funkcia `malloc()`

- poziada o mnozstvo pamate v **bytoch**
- funkcia vrati **pointer na prvu adresu**, kde zacina nasa pamat
- vracia pointer na typ **`void`**
- jej vysledok potrebujeme pretypovat na taky pointer, aky potrebujeme
- ak sa funkcia nepodari, funkica vrati hodnotu **`NULL`**
- pri alokovani paamte vzdy pouzivame funkciu **`sizeof()`**

```C
// vracia pointer na typ void, na 1. adresu, kde zacina nase pole intov velkosti 100
int *p_i = (int*) malloc(sizeof(int) * 100);
```

## Funkcia `free()`

- zavolanie tejto funkcie musi nasledovat po kazdom zavolani `malloc()` akonahle prestaneme dynamicky alokovaniu pamat potrebovat, aby sme ju uvolnili