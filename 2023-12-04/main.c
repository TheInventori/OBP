#include <stdio.h>

void swap(int *pa, int *pb) {
    int tmp = *pa;
    *pa = *pb;
    *pb = tmp;
}

int main() {
    int a = 5, b = 10;
    
    printf("pred vymenou:\n\ta = %d\n\tb = %d\n", a, b);

    swap(&a, &b);

    printf("po vymene:\n\ta = %d\n\tb = %d\n", a, b);
    
    return 0;
}