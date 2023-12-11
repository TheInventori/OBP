#include <stdio.h>

int main() {
    int a = 1;
    char b = 'a';
    double c = 3.14;
    int *pa = &a;
    char *pb = &b;
    double *pc = &c;

    printf("Velkost int je: %d\n", sizeof(int));
    printf("Velkost char je: %d\n", sizeof(char));
    printf("Velkost double je: %d\n", sizeof(double));
    printf("Velkost smerniku na int je: %d\n", sizeof(int*));
    printf("Velkost smerniku na char je: %d\n", sizeof(char*));
    printf("Velkost smerniku na double je: %d\n", sizeof(double*));
    printf("Velkost obsah smerniku na int je: %d\n", sizeof(*pa));
    printf("Velkost obsah smerniku na char je: %d\n", sizeof(*pb));
    printf("Velkost obsah smerniku na double je: %d\n", sizeof(*pc));
    printf("Obsah smerniku na int je: %p\n", pa);
    printf("Obsah smerniku na char je: %p\n", pb);
    printf("Obsah smerniku na double je: %p\n", pc);
    printf("Obsah premennej, na ktoru ukazuje smernik na int je: %d\n", *pa);
    printf("Obsah premennej, na ktoru ukazuje smernik na char je: %c\n", *pa);
    printf("Obsah premennej, na ktoru ukazuje smernik na double je: %lf\n", *pa);

    return 0;
}