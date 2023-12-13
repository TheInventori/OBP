#include <stdio.h>
#include <stdlib.h>

// B
// vytvorte pole desatinnych cisel pricom pocet prvkov pola a aj prvky nacitate z klavesnice, pouzite smarnik a dyn. all. pamate vo funkcii vypocitate priemeru hodnotu prvkov pola

float avg(float *pole, int *size) {
    float sum = 0;

    for(int i = 0; i < *size; i++) {
        sum += *(pole + i);
    }

    return sum / *size;
}

int main() {
    int size;
    printf("Zadaj pocet prvkov: ");
    scanf("%d", &size);

    float *pole = (float*) malloc(size * sizeof(float));

    for(int i = 0; i < size; i++) {
        printf("Zadaj %d. prvok pola (desatinne cislo): ", i + 1);
        scanf("%f", (pole + i));
    }

    printf("\n\n\nPrvky pola: \n");
    for(int i = 0; i < size; i++) {
        printf("\t%d. prvok: %f\n", i + 1, *(pole + i));
    }

    printf("\n\nPriemer prvkov pola: %f\n", avg(pole, &size));

    return 0;
}