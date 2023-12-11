#include <stdio.h>
#include <stdlib.h>

int faktorial(int n);
int mocnina(int m, int n);
unsigned long long int fibonacciho(int pocet);

int main() {
    // int i;
    // int j;
    int pocet;

    // printf("Zadaj cele cislo (mocnenec / zaklad mocniny): ");
    // scanf("%d", &i);
    // printf("Zadaj cele cislo (mocnitel / exponent): ");
    // scanf("%d", &j);

    // printf("%d^%d = %d", i, j, mocnina(i, j));


    printf("Zadaj clen fibonacciho postupnosti: ");
    scanf("%d", &pocet);


    printf("%d. clen fibonacciho postupnosti: %d", pocet, fibonacciho(pocet));

    return 0;
}

int faktorial(int n) {
    return n == 0 ? 1 : n * faktorial(n - 1);
}

int mocnina(int m, int n) {
    if(n == 0) {
        return 1;
    }
    return m * mocnina(m, n - 1);

    // return n == 0 ? 1 : m * mocnina(m, n - 1);
}

unsigned long long int fibonacciho(int pocet) {
    if(pocet == 1 || pocet == 2) {
        return 1;
    }
    return fibonacciho(pocet - 1) + fibonacciho(pocet - 2);
}