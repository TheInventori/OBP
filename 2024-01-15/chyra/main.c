#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Urcte vzajomnu polohu v dvojrozmernom priestore
typedef struct{
    double x;
    double y;
}BOD;

typedef struct{
    double r;
    BOD S;
}KRUH;

double vzdialenost(KRUH *kruh1, BOD *bod1) {
    double a, b;

    if(kruh1->S.x > bod1->x) {
        a = kruh1->S.x - bod1->x;
    } else {
        a = bod1->x - kruh1->S.x;
    }

    if(kruh1->S.y > bod1->y) {
        b = kruh1->S.y - bod1->y;
    } else {
        b = bod1->y - kruh1->S.y;
    }

    return sqrt((pow(a, 2) + pow(b, 2)));
}

void kde(double x, double r) {
    if(x > r) {
        printf("Bod lezi mimo kruznice\n");
    } else if(x == r) {
        printf("Bod lezi na kruznici\n");
    } else if(x == 0) {
        printf("Bod je rovnaky ako stred kruznice\n");
    } else if(x < r) {
        printf("Bod lezi v kruznici\n");
    }
}

int main() {
    BOD bod1;
    KRUH kruh1;


    printf("zadaj x suradnicu bodu: ");
    scanf("%lf", &bod1.x);
    printf("zadaj y suradnicu bodu: ");
    scanf("%lf", &bod1.y);


    printf("\n\nzadaj r kruznice: ");
    scanf("%lf", &kruh1.r);
    printf("zadaj x suradnicu stredu: ");
    scanf("%lf", &kruh1.S.x);
    printf("zadaj y suradnicu stredu: ");
    scanf("%lf", &kruh1.S.y);

    kde(vzdialenost(&kruh1, &bod1), kruh1.r);

    return 0;
}
