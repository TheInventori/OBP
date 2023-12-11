#include <stdio.h>


int main() {
    int arr[] = {1, 8, 4, 5, 10, 5};
    int *max = arr;

    for(int i = 0; i < (sizeof(arr) / sizeof(arr[0])); i++) {
        if(*max < *(arr + i)) {
            max = arr + i;
        }
    }

    printf("Maximalny prvok pola je: %d\n", *max);
    printf("Miesto v pamati:\n\tarr:\n\t\t%d\n\t\t%p\n\tmax:\n\t\t%d\n\t\t%p", arr, arr, max, max);

    return 0;
}