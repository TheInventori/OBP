#include <stdio.h>
#include <time.h>

/*
    do premennej pocet typu int nacitajte z klavesnice, nechajte si pridelit p_pole int-ov danej 
    velkosti s lubovolnym nazvom (nezabudnite si dopredu vytvorit smernik), naplne ho nahodnymi
    hodnotami od 0 do 50 vratane, vypiste ho na obrazovku, zotriedte p_pole vzostupne, nove p_pole 
    vypiste do riadku a uvolnite pamat
*/

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void bubbleSort(int arr[], int n) {
    int swapped;
    
    for (int i = 0; i < n - 1; i++) {
        swapped = 0;
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(&arr[j], &arr[j + 1]);
                swapped = 1;
            }
        }

        if (swapped == 0)
            break;
    }
}

int main() {
    int pocet;

    srand(time(0));

    printf("Zadaj velkost pola: ");
    scanf("%d", &pocet);
    
    int *p_pole = (int*)malloc(sizeof(int) * pocet);

    if(p_pole == NULL) {
        printf("nemas dostatok pamate\n");
        exit(0);
    }

    for(int i = 0; i < pocet; i++) {
        // p_pole[i] = rand() % 51;
        *(p_pole + i) = rand() % 51;
        printf("%d, ", *(p_pole + i));
    }

    printf("\nusporiadane pole:\n");

    bubbleSort(p_pole, pocet);

    for(int i = 0; i < pocet; i++) {
        printf("%d, ", *(p_pole + i));
    }

    free(p_pole);

    return 0;
}